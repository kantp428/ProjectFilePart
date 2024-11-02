package Tree;

import java.awt.*;

class Edge {
    private Node source;
    private Node target;
    private boolean active; //track active edge

    public Edge(Node source, Node target) {
        this.source = source;
        this.target = target;
        this.active = false; // Edges start as inactive
    }

    public void draw(Graphics g) {
        // Set the color based on the state of the edge
        if (active) {
            g.setColor(ColorMap.CLICKED_EDGE_COLOR);
        } else {
            g.setColor(ColorMap.INACTIVE_EDGE_COLOR);
        }

        // Using Graphic2D for edit line with more flexible option
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));

        // Calculate the midpoints for the lines
        //int midX = source.getX(); // X position between source and target
        int midX = ((source.getX() + (target.getX())+200))/2; // X position between source and target
        int midYSource = source.getY() + 30; // Center Y position of source node
        int midYTarget = target.getY() + 30; // Center Y position of target node
        int midxsource = source.getX()+50;


        g2.drawLine(source.getX()+50,source.getY(),source.getX()+50,source.getY()-20);
        g2.drawLine(source.getX()+50,source.getY()-20,source.getX()+150,source.getY()-20);
        g2.drawLine(source.getX()+150,source.getY()-20,source.getX()+150,target.getY()-20);
        g2.drawLine(source.getX()+150,target.getY()-20,target.getX()+50,target.getY()-20);
        g2.drawLine(target.getX()+50,target.getY()-20,target.getX()+50,target.getY());
        // Draw the lines connecting nodes
//        g2.drawLine(source.getX() + 40, midYSource, midX, midYSource); // Horizontal from source to midX
//        g2.drawLine(midX, midYSource, midX, midYSource); // Vertical up to the middle of target
//        g2.drawLine(midX, midYSource, midX + 40, midYSource); // Horizontal step to target
//        g2.drawLine(midX + 40, midYSource, midX + 40, midYTarget); // Vertical down to target Y
//        g2.drawLine(midX + 40, midYTarget, target.getX() + 40, midYTarget); // Horizontal to target
    }

    public boolean connects(Node node) {
        return source == node || target == node; // Check if the edge connects to the node if not connect one will be null
    }

    // Getter & Setter
    public Node getSource() {
        return source;
    }

    public Node getTarget() {
        return target;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
