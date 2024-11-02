package Tree;

import javax.swing.*;

public class MainRun {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            //
        }
        JFrame mainframe = new JFrame();
        mainframe.setSize(1280, 720);
        mainframe.setTitle("Frame");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MapPanel mapPanel = new MapPanel();
        mainframe.add(mapPanel);
        mainframe.setVisible(true);
    }
}
