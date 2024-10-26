package Function;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Time {
    public static void delay(int tDelay, Runnable action) {
        if (action == null) {
            action = () -> {};
        }

        Runnable finalAction = action;
        Timer timer = new Timer(tDelay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalAction.run();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
}


