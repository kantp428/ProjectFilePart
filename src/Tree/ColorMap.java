package Tree;

import java.awt.*;

public class ColorMap {
    static final Color ACTIVE_NODE_COLOR = Color.GRAY;
    static final Color ACTIVE_SOURCE_NODE_COLOR = new Color(10, 126, 6, 189);
    static final Color ACTIVE_TARGET_NODE_COLOR = new Color(214, 150, 0, 189);
    static final Color INACTIVE_NODE_COLOR = new Color(211, 211, 211, 189); // Light gray with low opacity

    static final Color BORDER_ACTIVE_NODE_COLOR = Color.RED;
    //static final Color BORDER_ACTIVE_NODE_COLOR = new Color(158, 0, 0, 189);

    static final Color ACTIVE_FONT_COLOR = Color.WHITE;
    static final Color INACTIVE_FONT_COLOR = new Color(32, 32, 32, 195); //Light Gray

    static final Color CLICKED_EDGE_COLOR = Color.RED; // Color for edges when clickeds
    static final Color INACTIVE_EDGE_COLOR = new Color(0, 128, 0, 150); // Green with low opacity

}
