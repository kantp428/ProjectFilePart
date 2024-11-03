package CourseMap;

import Course.Subject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Node {
    private final String name;
    private final Subject subject;
    private final int x, y;
    private final JLabel nodeLabel;
    private MapPanel mapPanel; // Reference to MainApp instance

    public Node(Subject s, int x, int y, MapPanel mapPanel) {
        this.subject = s;
        this.name = s.getName();
        this.x = x;
        this.y = y;
        this.mapPanel = mapPanel; // Store reference

        // Define a label for the node with a colored background
        nodeLabel = new JLabel(name, SwingConstants.CENTER);
        nodeLabel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));
        // Set inactive Node component
        nodeLabel.setOpaque(true);
        nodeLabel.setBorder(BorderFactory.createEmptyBorder()); // No border for inactive nodes
        nodeLabel.setBounds(x, y, 100, 60);
        this.setInActive();


        // Add mouse click event to label
        nodeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Node clicked: " + name);
                mapPanel.activateConnectedNodes(Node.this); // Activate clicked node and its connections , Using cuter class (Node)
                mapPanel.repaint(); // Repaint the main application to reflect changes
            }
        });
    }


    public void setClickedActive() {
        nodeLabel.setForeground(ColorMap.ACTIVE_FONT_COLOR);
        nodeLabel.setBackground(ColorMap.ACTIVE_CLICKED_NODE_COLOR);
        nodeLabel.setBorder(BorderFactory.createLineBorder(ColorMap.BORDER_ACTIVE_NODE_COLOR, 2));
    }

    public void setInActive() {
        nodeLabel.setForeground(ColorMap.INACTIVE_FONT_COLOR);
        nodeLabel.setBackground(ColorMap.INACTIVE_NODE_COLOR);
        nodeLabel.setBorder(BorderFactory.createEmptyBorder());
    }

    public void setSourceActive() {
        nodeLabel.setForeground(ColorMap.ACTIVE_FONT_COLOR);
        nodeLabel.setBackground(ColorMap.ACTIVE_SOURCE_NODE_COLOR);
        nodeLabel.setBorder(BorderFactory.createEmptyBorder());
    }

    public void setTargetActive() {
        nodeLabel.setForeground(ColorMap.ACTIVE_FONT_COLOR);
        nodeLabel.setBackground(ColorMap.ACTIVE_TARGET_NODE_COLOR);
        nodeLabel.setBorder(BorderFactory.createEmptyBorder());
    }

    // Getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public JLabel getNodeLabel() {
        return nodeLabel;
    }

}
