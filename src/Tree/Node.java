package Tree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Node {
    String id;
    int x, y;
    JLabel nodeLabel;
    TreePanel mapPanel; // Reference to MainApp instance

    public Node(String id, int x, int y, TreePanel mapPanel) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.mapPanel = mapPanel; // Store reference

        // Define a label for the node with a colored background
        nodeLabel = new JLabel(id, SwingConstants.CENTER) {
            @Override
            protected void paintComponent(Graphics g) {
                // Custom painting for background color
                if (getBackground() != null) {
                    g.setColor(getBackground());
                    g.fillRect(0, 0, getWidth(), getHeight());
                }
                super.paintComponent(g); // Call the superclass method to paint the label text
            }
        };

        // Set inactive Node component
        nodeLabel.setOpaque(false);
        nodeLabel.setBorder(BorderFactory.createEmptyBorder()); // No border for inactive nodes
        nodeLabel.setBounds(x, y, 80, 45);

        // Set color of inactive
        nodeLabel.setForeground(ColorMap.INACTIVE_FONT_COLOR);
        nodeLabel.setBackground(ColorMap.INACTIVE_NODE_COLOR);

        // Add mouse click event to label
        nodeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Node clicked: " + id);
                mapPanel.activateConnectedNodes(Node.this); // Activate clicked node and its connections , Using cuter class (Node)
                mapPanel.repaint(); // Repaint the main application to reflect changes
            }
        });
    }
}
