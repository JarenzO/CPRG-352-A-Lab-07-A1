
package models;

import java.io.Serializable;


public class Role implements Serializable {
    private String roleID;
    private String roleName;

    public Role() {
        roleID = "";
        roleName = "";
    }

    public Role(String roleID, String roleName) {
        this.roleID = roleID;
        this.roleName = roleName;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    
    
}
