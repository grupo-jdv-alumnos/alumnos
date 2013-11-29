package pe.edu.cibertec.user.action;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.cibertec.model.Role;
import pe.edu.cibertec.service.RoleService;

public class RoleAction {

    @Autowired
    private RoleService service;
    private List<Role> roles;
    private Role role;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String listarRoles() {
        roles = service.listRoles();
        return "success";
    }

    public String nuevoRol() {
        role = new Role();
        return "success";
    }

    public String insertarRol() {
        service.insert(role);
        return "success";
    }

    public String eliminarRol() {
        role = new Role();
        role.setIdRole(id);
        try {
            service.delete(role);
        } catch (Exception ex) {
            Logger.getLogger(RoleAction.class.getName()).log(Level.SEVERE, null, ex);
            return "accessDenied";
        }
        return "success";
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
