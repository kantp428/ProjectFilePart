package Tree;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class TreePanel extends JPanel {
    Map<String, Node> nodes = new HashMap<>();
    List<Edge> edges = new ArrayList<>();


    public TreePanel() {
        setLayout(new BorderLayout());

        // Create a custom panel to draw edges and nodes
        JPanel drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawEdges(g); // Draw connections between nodes
            }
        };

        drawingPanel.setLayout(null);
        drawingPanel.setPreferredSize(new Dimension(1200, 800)); // Set preferred size for scrolling

        // Create nodes and edges
        createNodes();

        // Add nodes to the drawing panel
        for (Node node : nodes.values()) {
            drawingPanel.add(node.nodeLabel);
        }

        // Wrap the drawing panel in a JScrollPane
        JScrollPane scrollPane = new JScrollPane(drawingPanel);
        scrollPane.setPreferredSize(new Dimension(200, 600)); // Set the size of the scroll pane
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Add scrollPane to Panel
        add(scrollPane, BorderLayout.CENTER);
    }

    private void createNodes() {
        // Create nodes and pass this MainApp instance
        nodes.put("MATH I", new Node("MATH I", 100, 100, this));
        nodes.put("Physics I", new Node("Physics I", 100, 200, this));
        nodes.put("Structure", new Node("Structure", 100, 300, this));
        nodes.put("MATH II", new Node("MATH II", 250, 100, this));
        nodes.put("Physics II", new Node("Physics II", 250, 200, this));
        nodes.put("Physics III", new Node("Physics III", 1000, 200, this));
        nodes.put("Digital", new Node("Digital", 250, 300, this));
        nodes.put("Linux", new Node("Linux", 250, 400, this));
        nodes.put("Make", new Node("Make", 250, 500, this));

        // Define edges
        edges.add(new Edge(nodes.get("MATH I"), nodes.get("MATH II")));
        edges.add(new Edge(nodes.get("MATH I"), nodes.get("Physics II")));
        edges.add(new Edge(nodes.get("Structure"), nodes.get("Linux")));
        edges.add(new Edge(nodes.get("Structure"), nodes.get("Make")));
        edges.add(new Edge(nodes.get("Physics I"), nodes.get("Physics II")));
        edges.add(new Edge(nodes.get("Physics II"), nodes.get("Physics III")));
    }

    private void drawEdges(Graphics g) {
        for (Edge edge : edges) {
            if (edge.active) { // Draw edge if it's active
                edge.draw(g); // Draw the edge
            }
        }
    }

    public void resetNodeColors() {
        // Reset all nodes to inactive color
        for (Node node : nodes.values()) {
            node.nodeLabel.setBackground(ColorMap.INACTIVE_NODE_COLOR);
            node.nodeLabel.setForeground(ColorMap.INACTIVE_FONT_COLOR);
        }
    }

    public void resetEdgeVisibility() {
        // Reset all edges to not visible
        for (Edge edge : edges) {
            edge.active = false; // Set edge as not active
        }
    }

    public void activateConnectedNodes(Node clickedNode) {
        // Reset other nodes' colors and activate the clicked node and its connected nodes
        resetNodeColors();
        resetEdgeVisibility();

        // Highlight clicked node and its connected nodes with normal opacity
        clickedNode.nodeLabel.setBackground(ColorMap.ACTIVE_NODE_COLOR); // Set to active color
        clickedNode.nodeLabel.setForeground(ColorMap.ACTIVE_FONT_COLOR); // Change font color to black

        for (Edge edge : edges) {
            if (edge.connects(clickedNode)) {
                // Highlight the connected node
                Node connectedNode = edge.source == clickedNode ? edge.target : edge.source;
                connectedNode.nodeLabel.setBackground(ColorMap.ACTIVE_NODE_COLOR);
                connectedNode.nodeLabel.setForeground(ColorMap.ACTIVE_FONT_COLOR);

                // Set the edge as active to change its appearance
                edge.active = true;
            }
        }
    }

}
