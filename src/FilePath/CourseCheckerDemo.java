package FilePath;

import  java.util.*;
import java.io.*;

public class CourseCheckerDemo {
    public static void main(String[] args) {
        File dir = new File("D:\\Java66\\JavaFile\\ProjectFilePart\\src\\CourseObjFile\\");
        String[] courseName = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String filename) {
                return filename.endsWith(".ser");
            }
        });

        System.out.print(Arrays.asList(courseName));
    }
}
