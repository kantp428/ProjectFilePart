package Tree;

import Course.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class MapPanel extends JPanel {
    Map<String, Node> nodes = new HashMap<>();
    List<Edge> edges = new ArrayList<>();
    JPanel drawingPanel;
    String filePath;

    public MapPanel(String filePath) {
        this.filePath = filePath;
        setLayout(new BorderLayout());

        // Create a custom panel to draw edges and nodes
        drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawEdges(g); // Draw connections between nodes
            }
        };

        drawingPanel.setLayout(null);
        drawingPanel.setPreferredSize(new Dimension(1920, 1280)); // Set preferred size for scrolling

        // Create nodes and edges
        createNodes();

        // Add nodes to the drawing panel
        for (Node node : nodes.values()) {
            drawingPanel.add(node.getNodeLabel());
        }

        // Wrap the drawing panel in a JScrollPane
        JScrollPane scrollPane = new JScrollPane(drawingPanel);
        scrollPane.setPreferredSize(new Dimension(1920, 1280)); // Set the size of the scroll pane
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Add scrollPane to Panel
        add(scrollPane, BorderLayout.CENTER);
    }

    private void createNodes() {
        double year = 1;
        int x = 100;
        int y = 100;
        int w = 100;
        int t = 1;

        for(int i=1;i<5;i++){
        for(int j=1;j<3;j++){
            if(t>2) t=1;
            //JLabel label = new JLabel("<html>Year<br>"+i+":"+t+"</html>", SwingConstants.CENTER);
            JLabel label = new JLabel("<html><div style='text-align: center;'>Year<br>" + i + ":" + t + "</div></html>", SwingConstants.CENTER);

            label.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14));
            label.setEnabled(false);
            label.setOpaque(false);
            label.setHorizontalAlignment(SwingConstants.CENTER); // Center horizontally
            label.setVerticalAlignment(SwingConstants.CENTER); // Center vertically
            label.setBounds(w, 20, 100, 60);
            w+=200;
            t++;
            drawingPanel.add(label);
        }
        }

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
        clickedNode.setClickedActive();

        for (Edge edge : edges) {
            if (edge.connects(clickedNode)) {
                // Highlight the connected node
                Node connectedNode = edge.getSource() == clickedNode ? edge.getTarget() : edge.getSource();

                if (connectedNode == edge.getSource()) {
                    connectedNode.setSourceActive();
                } else if (connectedNode == edge.getTarget()) {
                    connectedNode.setTargetActive();
                }
                //connectedNode.setActive();

                // Set the edge as active to change its appearance
                edge.setActive(true);
            }
        }
    }

}
