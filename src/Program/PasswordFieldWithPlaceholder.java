package Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PasswordFieldWithPlaceholder {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Password Field Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPasswordField passwordField = new JPasswordField("Password");
        passwordField.setEchoChar((char) 0);  // Initially show text without masking

        // Add a focus listener to handle placeholder text
        passwordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).equals("Password")) {
                    passwordField.setText("");
                    passwordField.setEchoChar('*'); // Mask characters
                    passwordField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (passwordField.getPassword().length == 0) {
                    passwordField.setText("Password");
                    passwordField.setEchoChar((char) 0); // Show placeholder without masking
                    passwordField.setForeground(Color.GRAY);
                }
            }
        });

        passwordField.setForeground(Color.GRAY); // Set initial placeholder color

        frame.setLayout(new FlowLayout());
        frame.add(new JButton(),BorderLayout.NORTH);
        frame.add(passwordField,BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

