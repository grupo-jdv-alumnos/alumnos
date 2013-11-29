package pe.edu.cibertec.service;

import java.util.List;
import pe.edu.cibertec.model.Role;

public interface RoleService {

    List<Role> listRoles();

    void insert(Role role);

    void delete(Role role);
}
