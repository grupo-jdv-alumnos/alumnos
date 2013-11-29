package pe.edu.cibertec.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dao.RoleDao;
import pe.edu.cibertec.model.Role;
import pe.edu.cibertec.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDao dao;

    public List<Role> listRoles() {
        return dao.list();
    }

    @Transactional
    public void insert(Role role) {
        dao.insert(role);
    }

    @PreAuthorize("hasRole('ROLE_SUPER_USER')")
    @Transactional
    public void delete(Role role) {
        role = dao.getById(role.getIdRole());
        dao.delete(role);
    }
}
