package Tree;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeFrame extends JFrame {
    Map<String, Node> nodes = new HashMap<>();
    List<Edge> edges = new ArrayList<>();

    // Colors for the nodes and edges
    static final Color ACTIVE_COLOR = Color.LIGHT_GRAY;
    static final Color INACTIVE_COLOR = new Color(211, 211, 211, 80); // Light gray with low opacity
    static final Color CLICKED_EDGE_COLOR = Color.RED; // Color for edges when clicked
    static final Color INACTIVE_EDGE_COLOR = new Color(0, 128, 0, 150); // Green with low opacity

    public TreeFrame() {
        setTitle("Project Subject List");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize nodes
        createNodes();

        // Custom panel to draw nodes and edges
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawEdges(g); // Draw connections between nodes
            }
        };
        panel.setLayout(null); // Use absolute positioning for nodes

        // Add nodes to the panel
        for (Node node : nodes.values()) {
            panel.add(node.nodeLabel); // Add the label to the panel
        }

        add(panel);
    }

    private void createNodes() {
        // Create nodes and pass this MainApp instance
        nodes.put("MATH I", new Node("MATH I", 100, 100, this));
        nodes.put("Physics I", new Node("Physics I", 100, 200, this));
        nodes.put("Structure", new Node("Structure", 100, 300, this));
        nodes.put("MATH II", new Node("MATH II", 250, 100, this));
        nodes.put("Physics II", new Node("Physics II", 250, 200, this));
        nodes.put("Physics III", new Node("Physics III", 500, 200, this));
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TreeFrame app = new TreeFrame();
            app.setVisible(true);
        });
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