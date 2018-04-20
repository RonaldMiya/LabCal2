package rmiya.com.labcal2.repositories;

import android.app.Activity;
import android.content.Intent;

import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import rmiya.com.labcal2.activities.MainActivity;
import rmiya.com.labcal2.activities.ProductosActivity;
import rmiya.com.labcal2.models.User;

/**
 * Created by Alumno on 20/04/2018.
 */

public class UserRepository {

    private static List<User> users;


    public static List<User> list(){
        users = SugarRecord.listAll(User.class);
//        Iterator i = users.iterator();
//        int c = 0;
//        while(i.hasNext()){
//            User user1 = users.get(c);
//            if(user1.getUsername().equals(username) && user1.getPassword().equals(password)){
//                    return users;
//            }
//        }
        return users;
    }

    public static User read(Long id){
        User user = SugarRecord.findById(User.class, id);
        return user;
    }

    public static void create( String username, String password, String fullname, String email){
        User user = new User(username,password,fullname,email);
        SugarRecord.save(user);
    }

    public static void update(Long id, String username, String password, String fullname, String email){
        User user = SugarRecord.findById(User.class, id);
        user.setUsername(username);
        user.setFullname(fullname);
        user.setEmail(email);
        user.setPassword(password);
        SugarRecord.save(user);
    }

    public static void delete(Long id){
        User user = SugarRecord.findById(User.class, id);
        SugarRecord.delete(user);
    }




    public static User login(String username, String password) {
      List<User> users  = list();

        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;

    }
    public static User getUser(String username){
        for (User user : users){
            if(user.getUsername().equalsIgnoreCase(username)){
                return user;
            }
        }
        return null;
    }

}
