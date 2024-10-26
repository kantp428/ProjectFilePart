package Course;

import java.io.Serializable;
import java.util.*;

public class Subject implements Serializable {
    private String id;
    private String name;
    private double year;
    private final ArrayList<Subject> next;
    private final ArrayList<Subject> require;

    public void addNext(Subject s) {
        if(!next.contains(s)) next.add(s);
    }

    public void addReq(Subject s) {
        if(!require.contains(s)) require.add(s);
    }

    public Subject(String id, String name, String year, Course c) {
        c.getIdMap().put(id, this);
        this.id = id;
        this.name = name;
        this.year = Double.parseDouble(year); // Str --> double
        this.next = new ArrayList<Subject>();
        this.require = new ArrayList<Subject>();
    }

    public void setUndefined(String id, String name, String year, Course c) {
        // using to set up subject --> that didn't connect
        c.getIdMap().put(id, this);
        this.id = id;
        this.name = name;
        this.year = Double.parseDouble(year); // Str --> double
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getYear() {return year;}
    public ArrayList<Subject> getNext() {
        return next;
    }
    public ArrayList<Subject> getRequire() {
        return require;
    }

    @Override
    public String toString() {
        return id;
    }

}
