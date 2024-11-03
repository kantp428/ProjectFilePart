package Program;

import Course.*;

public class ObjReaderTest {
    public static void main(String[] args) {
//        CreateObjCourse c = new CreateObjCourse("src/CSVfileTest/Course_CPE.csv");
        Course cpe = ObjReader.readObj("src/resource/CourseObjFile/Course_CPE.ser");
        // Using this line to run test -->
        for(String code : cpe.getAllsubCode()) {
            System.out.println("Name: " + cpe.getIdMap().get(code).getName());
            System.out.println("id: " + cpe.getIdMap().get(code).getId());
            System.out.print("Require-> ");
            if(cpe.getIdMap().get(code).getRequire().isEmpty())
                System.out.print("null");
            for(Subject s : cpe.getIdMap().get(code).getRequire()) {
                System.out.print(s.getId()+" ");
            }
            System.out.print("\nNext-> ");
            if(cpe.getIdMap().get(code).getNext().isEmpty())
                System.out.print("null");
            for(Subject s : cpe.getIdMap().get(code).getNext()) {
                System.out.print(s.getId()+" ");
            }
            System.out.println("\n");
        }
        // run test -->

    }
}