package Course;
import java.io.*;

public class  ObjReader {

    public static Course readObj(String filePath) {
        Course c = null;
        try {
            FileInputStream fIn = new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(fIn);
            c = (Course) in.readObject();

        }catch (Exception e) {
//            e.printStackTrace(); // uncomment this to check Bug!!
        }

        return c;
    }

}
