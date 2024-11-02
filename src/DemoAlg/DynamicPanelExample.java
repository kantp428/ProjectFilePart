package DemoAlg;

import Tree.MapPanel;

import javax.swing.*;
import java.awt.*;

public class DynamicPanelExample {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            //
        }
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Dynamic Panel Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);

            // Create a CardLayout and set it as the layout for the frame's content pane
            CardLayout cardLayout = new CardLayout();
            JPanel cardPanel = new JPanel(cardLayout);

            // Panel 1 with a button to switch to Panel 2
            JPanel panel1 = new JPanel();
            panel1.setBackground(Color.CYAN);
            JButton switchToPanel2Button = new JButton("Go to Panel 2");
            switchToPanel2Button.addActionListener(e -> cardLayout.show(cardPanel, "Panel2"));
            panel1.add(switchToPanel2Button);

            // Panel 2 with a button to switch back to Panel 1
            JPanel panel2 = new MapPanel("src/CourseObjFile/Course_CPE.ser");;
            JButton switchToPanel1Button = new JButton("Go to Panel 1");
            switchToPanel1Button.addActionListener(e -> cardLayout.show(cardPanel, "Panel1"));

            // Add panels to the card panel with unique identifiers
            cardPanel.add(panel1, "Panel1");
            cardPanel.add(panel2, "Panel2");

            // Add the card panel to the frame
            frame.add(cardPanel);

            // Set the frame to be visible
            frame.setVisible(true);
        });
    }
}

