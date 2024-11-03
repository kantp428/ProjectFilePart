package Users;

import java.io.Serializable;

public class User implements Serializable {
    private String userName ;
    private String fullName ;
    private String lastName ;
    private String password ;

    public User(String userName, String fullName, String lastName, String password,AllUser allUser) {
        this.userName = userName;
        this.fullName = fullName;
        this.lastName = lastName;
        this.password = password;
        allUser.getUserMap().put(userName,this);
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
}
