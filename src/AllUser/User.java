package AllUser;

import UI.UserRegister;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String userName ;
    private String fullName ;
    private String lastName ;
    private String password ;
    private String studentID ;

    public User(String userName, String fullName, String lastName, String password, String studentID ,AllUser allUser) {
        this.userName = userName;
        this.fullName = fullName;
        this.lastName = lastName;
        this.password = password;
        this.studentID = studentID;
        allUser.getUserMap().put(userName,this);
    }

    public static void main(String[] args) {
        new UserRegister().setVisible(true);
//        AllUser a = new AllUser();
//        a.getUserMap().put("b6620503578",new Student("b6620503578","Supakorn","Leelatanangkul","tek","6620503578",a));
//        AllUser.writeUserObjFile(a);
//        AllUser b = AllUser.readUserObjFile();
//        b.getUserMap().remove("Kantapat");
//        AllUser.writeUserObjFile(b);
//        for(String i : b.getAllkey()){
//            System.out.println(b.getUserMap().get(i).fullName);
//        }
//        System.out.println(b.getUserMap().get("b6620503578").fullName);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
