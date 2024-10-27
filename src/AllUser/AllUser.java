package AllUser;

import javax.swing.*;
import java.util.*;
import java.io.*;

public class AllUser implements Serializable{
    private final HashMap<String,User> userMap = new HashMap<String, User>();

    public HashMap<String, User> getUserMap() {
        return userMap;
    }

    public static void writeUserObjFile(AllUser alluser){
        try{
            FileOutputStream file = new FileOutputStream("src/ FileUserID/allUser.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(alluser);

            System.out.println("Create finish");

            out.close();
            file.close();

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Error initailizing stream");
        }
    }

    public static AllUser readUserObjFile(){
        AllUser allUser = null ;
        try{
           FileInputStream fi = new FileInputStream("src/ FileUserID/allUser.ser");
           ObjectInputStream oi = new ObjectInputStream(fi);
           allUser = (AllUser) oi.readObject();

           fi.close();;
           oi.close();

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Error initailizing stream");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return allUser;
    }

    public List<String> getAllkey() {

        return new ArrayList<>(userMap.keySet());
    }
}
