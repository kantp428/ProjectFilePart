package Tree;

import Course.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class MapPanel extends JPanel {
    Map<String, Node> nodes = new HashMap<>();
    List<Edge> edges = new ArrayList<>();


    public MapPanel(String filePath) {
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
        drawingPanel.setPreferredSize(new Dimension(2000, 1100)); // Set preferred size for scrolling

        // Create nodes and edges
        createNodes(filePath);

        // Add nodes to the drawing panel
        for (Node node : nodes.values()) {
            drawingPanel.add(node.getNodeLabel());
        }

        // Wrap the drawing panel in a JScrollPane
        JScrollPane scrollPane = new JScrollPane(drawingPanel);
        scrollPane.setPreferredSize(new Dimension(200, 600)); // Set the size of the scroll pane
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Add scrollPane to Panel
        add(scrollPane, BorderLayout.CENTER);
    }

    private void createNodes(String filePath) {
        double year = 1;
        int x = 100;
        int y = 100;
        Course c = ObjReader.readObj(filePath);
        for(String i : c.getAllsubCode()){
            Subject s = c.getIdMap().get(i);
            if(s.getYear() == year+0.5){
                //System.out.println("xxxxxxxxxx "+year+" xxxxxxxxxx");
                year+=0.5;
                x += 200;
                y = 100;
            }
            nodes.put(s.getId(),new Node(s,x,y,this));
            y += 100;
        }
        for (String i : c.getAllsubCode()){
            Subject s = c.getIdMap().get(i);
            for(Subject sub : s.getNext()){
                edges.add(new Edge(nodes.get(i), nodes.get(sub.getId())));
            }
        }
    }

    // Draw edge if it's active
    private void drawEdges(Graphics g) {
        for (Edge edge : edges) {
            if (edge.isActive()) {
                edge.draw(g);
            }
        }
    }

    public void resetNodeColors() {
        // Reset all nodes to inactive color
        for (Node node : nodes.values()) {
            node.setInActive();
        }
    }

    public void resetEdgeVisibility() {
        // Reset all edges to not visible
        for (Edge edge : edges) {
            edge.setActive(false); // Set edge as not active
        }
    }

    public void activateConnectedNodes(Node clickedNode) {
        // Reset other nodes' colors and activate the clicked node and its connected nodes
        resetNodeColors();
        resetEdgeVisibility();

        // Highlight clicked node and its connected nodes with normal opacity
        clickedNode.setActive();

        for (Edge edge : edges) {
            if (edge.connects(clickedNode)) {
                // Highlight the connected node
                Node connectedNode = edge.getSource() == clickedNode ? edge.getTarget() : edge.getSource();
                connectedNode.setActive();

                // Set the edge as active to change its appearance
                edge.setActive(true);
            }
        }
    }

}
