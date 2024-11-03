package Program;

import CourseMap.*;
import javax.swing.*;
import java.awt.*;

public class MapTest {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            //
        }
        JFrame mainframe = new JFrame();
        mainframe.setSize(1280, 720);
        mainframe.setTitle("Frame");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MapPanel mapPanel = new MapPanel("src/resource/CourseObjFile/Course_CPE.ser");
        mainframe.add(mapPanel);
        mainframe.setExtendedState(Frame.MAXIMIZED_BOTH);
        mainframe.setVisible(true);
    }
}