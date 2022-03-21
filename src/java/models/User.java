
package models;

import java.io.Serializable;


public class User implements Serializable {
    private String email;
    private int active;
    private String firstname;
    private String lastname;
    private String password;
    private int role;

    public User() {
        email = "";
        firstname = "";
        lastname = "";
        password = "";
    }

    public User(String email, int active, String firstname, String lastname, String password, int role) {
        this.email = email;
        this.active = active;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    

    
}
