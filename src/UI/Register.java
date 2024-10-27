package UI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Register implements Serializable{
    private String userName ;
    private String fullName ;
    private String lastName ;
    private String password ;
    private String studentID ;
//    private static List<Register> userList = new ArrayList<>();


    public Register(String fullName,String lastName,String userName,String password,String studentID) {
        this.fullName = fullName ;
        this.lastName = lastName ;
        this.password = password ;
        this.userName = userName ;
//		userList.add(this);
    }

//    public static List<Register> getUserList() {
//		return userList;
//	}

    public String getFullName() {
        return fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return fullName+","+lastName+","+password+","+userName;
    }
}

