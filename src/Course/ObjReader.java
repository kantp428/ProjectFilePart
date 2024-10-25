package Course;
import java.io.*;

public class ObjReader {

    public static Course readObj(String filePath) {
        Course c = null;
        try {
            FileInputStream fIn = new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(fIn);
            c = (Course) in.readObject();

        }catch (Exception e) {
            e.printStackTrace();
        }

        return c;
    }

    public static void main(String[] args) {
        Course cpe = ObjReader.readObj("D:\\Java66\\JavaFile\\untitled\\src\\CourseObjFile\\Course_CPE.ser");
        // Using this line to run test -->
        for(String code : cpe.AllsubCode) {
            System.out.println("Name: " + cpe.idMap.get(code).getName());
            System.out.println("id: " + cpe.idMap.get(code).getId());
            System.out.print("Require-> ");
            if(cpe.idMap.get(code).getRequire().isEmpty())
                System.out.print("null");
            for(Subject s : cpe.idMap.get(code).getRequire()) {
                System.out.print(s.getId()+" ");
            }
            System.out.print("\nNext-> ");
            if(cpe.idMap.get(code).getNext().isEmpty())
                System.out.print("null");
            for(Subject s : cpe.idMap.get(code).getNext()) {
                System.out.print(s.getId()+" ");
            }
            System.out.println("\n");
        }
        // run test -->
    }
}
