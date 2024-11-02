package Tree;

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

    public Node(String name, int x, int y, MapPanel mapPanel) {
        this.name = name;
        this.subject=null;
        this.x = x;
        this.y = y;
        this.mapPanel = mapPanel; // Store reference

        nodeLabel = new JLabel(name, SwingConstants.CENTER);
        // Set inactive Node component
        nodeLabel.setOpaque(true);
        nodeLabel.setBorder(BorderFactory.createEmptyBorder()); // No border for inactive nodes
        nodeLabel.setBounds(x, y, 100, 60);
        nodeLabel.setBackground(ColorMap.INACTIVE_NODE_COLOR);
        nodeLabel.setForeground(ColorMap.ACTIVE_FONT_COLOR);
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

    public void setActive() {
        nodeLabel.setForeground(ColorMap.ACTIVE_FONT_COLOR);
        nodeLabel.setBackground(ColorMap.ACTIVE_NODE_COLOR);
    }

    public void setInActive() {
        nodeLabel.setForeground(ColorMap.INACTIVE_FONT_COLOR);
        nodeLabel.setBackground(ColorMap.INACTIVE_NODE_COLOR);
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
