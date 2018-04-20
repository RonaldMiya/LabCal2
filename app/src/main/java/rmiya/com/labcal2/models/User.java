package rmiya.com.labcal2.models;

import com.orm.dsl.Table;

/**
 * Created by Alumno on 20/04/2018.
 */

@Table
public class User {

    private Long id;
    private String username;
    private String email;
    private String password;
    private String fullname;

    public User() {
    }

    public User(String username, String password, String fullname, String email) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }

}
