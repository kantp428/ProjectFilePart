package DemoAlg;

import javax.swing.*;
import java.awt.*;

public class JOptionPaneDemo {

    public static void main(String[] args) {
        // Create a JOptionPane
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane optionPane = new JOptionPane("This is a custom message.", JOptionPane.PLAIN_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[] {}, null);

        // Create a custom button
        JButton customOkButton = new JButton("Custom OK");
        customOkButton.setFocusPainted(false); // Disable blue focus border

        // Add any customizations you like to the button
        customOkButton.setBackground(Color.LIGHT_GRAY); // Example background color
        customOkButton.setOpaque(true);
        customOkButton.setBorderPainted(true);

        // Add an action listener to handle button clicks
        customOkButton.addActionListener(e -> {
            System.out.println("Custom OK button clicked!");
            Window window = SwingUtilities.getWindowAncestor(customOkButton);
            if (window != null) {
                window.dispose(); // Close the dialog
            }
            });

        // Add the custom button to the JOptionPane
        optionPane.setOptions(new Object[] {customOkButton});

        // Create a JDialog to display the customized JOptionPane
        JDialog dialog = optionPane.createDialog("CourseCreator");
        dialog.setVisible(true);
    }
}

