package FilePath;

import java.io.File;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

// This class use for handle Jar file
public class JarFilePath {

    public static String getPath(String fileName) {
        if (getDir() != null) return getDir() + fileName;
        else return null;
    }

    public static String[] getCourseObj() {
        if (getDir() == null) return null;
        File dir = new File(getDir());

        return dir.list((_, filename) -> filename.endsWith(".ser"));

    }

    public static String getDir() {
        try {
            URL jarLocation = JarFilePath.class.getProtectionDomain().getCodeSource().getLocation();
            Path jarPath = Paths.get(jarLocation.toURI());

            return jarPath.getParent().toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

