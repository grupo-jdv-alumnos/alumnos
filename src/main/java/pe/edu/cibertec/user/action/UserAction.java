package pe.edu.cibertec.user.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.cibertec.model.Role;
import pe.edu.cibertec.model.User;
import pe.edu.cibertec.service.RoleService;
import pe.edu.cibertec.service.UserService;

public class UserAction extends ActionSupport {

    @Autowired
    private UserService service;
    @Autowired
    private RoleService roleService;
    private List<User> usuarios;
    private List<Role> roles;
    private User usuario;
    private Integer id;

    public String listarUsuarios() throws Exception {

        usuarios = service.list();
        return SUCCESS;
    }

    public String nuevoUsuario() {
        usuario = new User();
        roles = roleService.listRoles();
        return SUCCESS;
    }

    public String insertarUsuario() {
        service.insert(usuario);
        return SUCCESS;
    }

    public String eliminarUsuario() {
        usuario = new User();
        usuario.setIdUser(id);
        try {
            service.delete(usuario);
        } catch (Exception ex) {
            Logger.getLogger(UserAction.class.getName()).log(Level.SEVERE, null, ex);
            return "accessDenied";
        }
        return SUCCESS;
    }

    public List<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<User> usuarios) {
        this.usuarios = usuarios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}