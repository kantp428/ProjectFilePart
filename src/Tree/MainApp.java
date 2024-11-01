package Tree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainApp extends JFrame {
    Map<String, Node> nodes = new HashMap<>();
    List<Edge> edges = new ArrayList<>();

    // Colors for the nodes and edges
    static final Color ACTIVE_COLOR = Color.LIGHT_GRAY;
    static final Color INACTIVE_COLOR = new Color(211, 211, 211, 80); // Light gray with low opacity
    static final Color CLICKED_EDGE_COLOR = Color.RED; // Color for edges when clicked
    static final Color INACTIVE_EDGE_COLOR = new Color(0, 128, 0, 150); // Green with low opacity

    public MainApp() {
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
            panel.add(node.label); // Add the label to the panel
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
            MainApp app = new MainApp();
            app.setVisible(true);
        });
    }

    public void resetNodeColors() {
        // Reset all nodes to inactive color
        for (Node node : nodes.values()) {
            node.label.setBackground(INACTIVE_COLOR); // Set to low opacity inactive color
            node.label.setForeground(Color.gray); // Set font color for inactive nodes (dark gray)
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
        clickedNode.label.setBackground(ACTIVE_COLOR); // Set to active color
        clickedNode.label.setForeground(Color.black); // Change font color to black

        for (Edge edge : edges) {
            if (edge.connects(clickedNode)) {
                // Highlight the connected node
                Node connectedNode = edge.source == clickedNode ? edge.target : edge.source;
                connectedNode.label.setBackground(ACTIVE_COLOR);
                connectedNode.label.setForeground(Color.black);

                // Set the edge as active to change its appearance
                edge.active = true;
            }
        }
    }
}

class Node {
    String id;
    int x, y;
    JLabel label;
    MainApp mainApp; // Reference to MainApp instance

    public Node(String id, int x, int y, MainApp mainApp) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.mainApp = mainApp; // Store reference

        // Define a label for the node with a colored background
        label = new JLabel(id, SwingConstants.CENTER) {
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

        label.setOpaque(false); // Make the label opaque false for custom painting
        label.setForeground(Color.gray); // Set font color for inactive nodes (dark gray)
        label.setBorder(BorderFactory.createEmptyBorder()); // No border for inactive nodes
        label.setBounds(x, y, 80, 45);

        // Set the initial background color to inactive (low opacity)
        label.setBackground(new Color(211, 211, 211, 80)); // Light gray with low opacity

        // Add mouse click event to label
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Node clicked: " + id);
                mainApp.activateConnectedNodes(Node.this); // Activate clicked node and its connections
                mainApp.repaint(); // Repaint the main application to reflect changes
            }
        });
    }
}

class Edge {
    Node source;
    Node target;
    boolean active; // Track whether this edge is active

    public Edge(Node source, Node target) {
        this.source = source;
        this.target = target;
        this.active = false; // Edges start as inactive
    }

    public void draw(Graphics g) {
        // Set the color based on the state of the edge
        if (active) {
            g.setColor(MainApp.CLICKED_EDGE_COLOR); // Color for active edges
        } else {
            g.setColor(MainApp.INACTIVE_EDGE_COLOR); // Color for inactive edges
        }

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));

        // Calculate the midpoints for the lines
        int midX = (source.x + target.x) / 2; // X position between source and target
        int midYSource = source.y + 22; // Center Y position of source node
        int midYTarget = target.y + 22; // Center Y position of target node

        // Draw the lines connecting nodes
        g2.drawLine(source.x + 40, midYSource, midX, midYSource); // Horizontal from source to midX
        g2.drawLine(midX, midYSource, midX, midYSource); // Vertical up to the middle of target
        g2.drawLine(midX, midYSource, midX + 40, midYSource); // Horizontal step to target
        g2.drawLine(midX + 40, midYSource, midX + 40, midYTarget); // Vertical down to target Y
        g2.drawLine(midX + 40, midYTarget, target.x + 40, midYTarget); // Horizontal to target
    }

    public boolean connects(Node node) {
        return source == node || target == node; // Check if the edge connects to the node
    }
}
