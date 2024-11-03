package FilePath;

import javax.swing.*;
import java.io.*;

public class PathCourseSet {

    public static String[] getCourseName() {
        File dir = new File("src/resource/CourseObjFile/");
        String[] courseName = dir.list((dir1, filename) -> filename.endsWith(".ser"));

        // remove .ser from file
        if (courseName != null) {
            for (int i = 0; i < courseName.length; i++) {
                courseName[i] = courseName[i].replaceFirst("\\.ser$", "").replaceFirst("Course_", "");
            }
        }

        if (courseName != null) {
            return courseName;
        } else {
            return null;
        }
    }

    public static String getPathOf(String courseName) {
        return "src/resource/CourseObjFile/Course_" + courseName + ".ser";
    }

    public static String[] getCoursePath() {
        File dir = new File("src/resource/CourseObjFile/");
        String[] courseName = dir.list((dir1, filename) -> filename.endsWith(".ser"));

        if (courseName != null) {
            return courseName;
        } else {
            return null;
        }
    }



}
