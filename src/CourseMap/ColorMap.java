package CourseMap;

import java.awt.*;

public class ColorMap {
    public static final Color ACTIVE_CLICKED_NODE_COLOR = Color.GRAY;
    public static final Color ACTIVE_SOURCE_NODE_COLOR = new Color(10, 126, 6, 189);
    public static final Color ACTIVE_TARGET_NODE_COLOR = new Color(214, 150, 0, 189);
    public static final Color INACTIVE_NODE_COLOR = new Color(211, 211, 211, 189); // Light gray with low opacity

    public static final Color BORDER_ACTIVE_NODE_COLOR = Color.RED;
    //public static final Color BORDER_ACTIVE_NODE_COLOR = new Color(158, 0, 0, 189);

    public static final Color ACTIVE_FONT_COLOR = Color.WHITE;
    public static final Color INACTIVE_FONT_COLOR = new Color(32, 32, 32, 195); //Light Gray

    public static final Color CLICKED_EDGE_COLOR = Color.RED; // Color for edges when clickeds
    public static final Color INACTIVE_EDGE_COLOR = new Color(0, 128, 0, 150); // Green with low opacity

}
