package Course;
import FilePath.JarFilePath;

import java.io.*;

public class JarCreateObj implements Serializable{
    private final Course course = new Course();

    //public Course getCourse() {return course;}

    public JarCreateObj(String courseName, String filepath) {
        BufferedReader reader = null;
        String line;
        course.setCourseName(courseName);

        try {
            reader = new BufferedReader(new FileReader(filepath));
            for(int numLine=0; (line = reader.readLine()) != null ;numLine++) {
                if(numLine==0) continue;
                String[] row = line.split(",");
                if(row.length==0) continue;

                // Main subject code -->
                String id = row[0];
                String name = row[1];
//                System.out.println(name);
                String year = row[4];
                Subject s;

                if(!course.getAllsubCode().contains(id)) {course.getAllsubCode().add(id);}

                if(!course.getIdMap().containsKey(id)) {
                    s = new Subject(id, name, year, course);
                    course.getIdMap().put(id, s); // add subject to id map
                }else {
                    s = course.getIdMap().get(id); // get subject that already in id map
                    s.setUndefined(id, name, year, course); // this subject was exist in idMap
                }

                // prev & next subject code -->
                if(!row[3].equals("-")) {
                    String[] prev = row[3].split("_");
                    for(String req : prev) {
                        if(course.getIdMap().get(req) == null) { //req isn't already exist
                            // Create req subject!!
                            Subject undefinedSub = new Subject(req, "undefined", "undefined", course);

                            course.getIdMap().put(req, undefinedSub);
                        }
                        s.addReq(course.getIdMap().get(req));
                        course.getIdMap().get(req).addNext(s);
                    }
                }
            }
        }catch (Exception e) {
//            e.printStackTrace(); // uncomment this to check Bug!!
        }finally {
            try {
                assert reader != null;
                reader.close();
            } catch (IOException e) {
//                e.printStackTrace(); // uncomment this to check Bug!!
            }
            // creating root subject
            course.createRoot();
            this.createCourseFile(courseName);
            System.out.println("Create Object File");
        }
    }

    // Create Obj file method -->
    public void createCourseFile(String fName) {
        try {
            FileOutputStream fileout = new FileOutputStream(JarFilePath.getDir() +"CourseObjFile/Course_"+fName+".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(course);
            System.out.println("Course Saved");
        }catch (Exception e) {
//            e.printStackTrace(); // uncomment this to check Bug!!
        }
    }

//    public static void main(String[] args) {
//        new CreateObjCourse("ME", "src/CSVfileTest/Course_ME.csv");
//    }

}
