package Program;

import FilePath.CourseFileCreatePanel;

import javax.swing.*;

public class CreateCourseTest {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            //
        }
        new CourseFileCreatePanel(null);
    }
}
