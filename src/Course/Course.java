package Course;

import java.util.*;
import java.io.*;

public class Course implements Serializable {

    private String courseName;
    public ArrayList<String> AllsubCode = new ArrayList<String>();
    public ArrayList<Subject> rootsub = new ArrayList<Subject>();
    public HashMap<String, Subject> idMap = new HashMap<String, Subject>();

    public void createRoot() {
        for(String code : this.AllsubCode) {
            if(this.idMap.get(code).getRequire().isEmpty()) {
                this.rootsub.add(this.idMap.get(code));
            }
        }
    }


}

