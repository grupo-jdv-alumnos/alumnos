/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author JAVA-ADV-VS
 */
@Entity
@Table(name="user")
public class User {
    @Id
    @Column(name="USER_ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idUser;
    private String username;
    private String password;
    private Boolean enabled;
    @Transient
    private Integer idRole;

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }
    
    @ManyToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "user_role", 
            joinColumns = { @JoinColumn(name = "user_id")}, 
            inverseJoinColumns={@JoinColumn(name="role_id")})
    private List<Role> roles;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    
    
}
