package Course;

import java.util.*;
import java.io.*;

public class Course implements Serializable {

    private String courseName;
    private ArrayList<String> AllsubCode = new ArrayList<String>();
    private ArrayList<Subject> rootsub = new ArrayList<Subject>();
    private HashMap<String, Subject> idMap = new HashMap<String, Subject>();

    // Getter & Setter
    public HashMap<String,Subject> getIdMap() {return idMap;}
    public ArrayList<Subject> getRootsub() {return rootsub;}
    public ArrayList<String> getAllsubCode() {return AllsubCode;}
    public String getCourseName() {return courseName;}

    public void createRoot() {
        for(String code : this.AllsubCode) {
            if(this.idMap.get(code).getRequire().isEmpty()) {
                this.rootsub.add(this.idMap.get(code));
            }
        }
    }


}

