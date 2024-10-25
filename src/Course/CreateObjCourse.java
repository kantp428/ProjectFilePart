package Course;
import java.io.*;

public class CreateObjCourse implements Serializable{
    private Course course;

    public Course getCourse() {return course;}

    public CreateObjCourse(String courseName, String filepath) {
        BufferedReader reader = null;
        String line = "";
        course = new Course();

        try {
            reader = new BufferedReader(new FileReader(filepath));
            for(int numLine=0; (line = reader.readLine()) != null ;numLine++) {
                if(numLine==0) continue;
                String[] row = line.split(",");
                if(row.length==0) continue;

                // Main subject code -->
                String id = row[0];
                String name = row[1];
                String year = row[4];
                Subject s;
                course.AllsubCode.add(id);
                if(!course.idMap.containsKey(id)) {
                    s = new Subject(id, name, year, course);
                    course.idMap.put(id, s); // add subject to id map
                }else {
                    s = course.idMap.get(id); // get subject that already in id map
                    s.set(id, name, year, course); // this subject was exist in idMap
                }

                // prev & next subject code -->
                if(!row[3].equals("-")) {
                    String[] prev = row[3].split("_");
                    for(String req : prev) {
                        if(course.idMap.get(req) != null) { //req is already exist
                            s.addReq(course.idMap.get(req));
                            course.idMap.get(req).addNext(s);
                        }else { // req isn't exist
                            // Create req subject!!
                            Subject undefinedSub = new Subject(req, "undefined", "undefined", course);
                            course.idMap.put(req, undefinedSub);

                            s.addReq(course.idMap.get(req));
                            course.idMap.get(req).addNext(s);
                        }
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            // creating root subject
            course.createRoot();
            this.createCourseFile(courseName);
        }
    }

    public void createCourseFile(String fname) {
        try {
            FileOutputStream fileout = new FileOutputStream("D:\\Java66\\JavaFile\\untitled\\src\\CourseObjFile\\Course_"+fname+".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(course);
            System.out.println("Course Saved");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CreateObjCourse c = new CreateObjCourse("CPE","D:\\Java66\\JavaFile\\untitled\\src\\CSVfile\\Course_CPE.csv");



//        for(String code : cpe.AllsubCode) {
//            System.out.println("Name: " + cpe.idMap.get(code).getName());
//            System.out.println("id: " + cpe.idMap.get(code).getId());
//            System.out.print("Require-> ");
//            if(cpe.idMap.get(code).getRequire().isEmpty())
//                System.out.print("null");
//            for(Subject s : cpe.idMap.get(code).getRequire()) {
//                System.out.print(s.getId()+" ");
//            }
//            System.out.print("\nNext-> ");
//            if(cpe.idMap.get(code).getNext().isEmpty())
//                System.out.print("null");
//            for(Subject s : cpe.idMap.get(code).getNext()) {
//                System.out.print(s.getId()+" ");
//            }
//            System.out.println("\n");
//        }

//        System.out.println("\n\n\n");
//        for(Subject i : cpe.rootsub) {
//            System.out.println(i.getName());
//        }

    }
}
