package pe.edu.cibertec.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dao.RoleDao;
import pe.edu.cibertec.model.Role;

@Repository("roleDao")
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    EntityManager em;

    public List<Role> list() {
        Query q = em.createQuery("select r from Role r");
        return q.getResultList();
    }

    public void insert(Role role) {
        em.persist(role);
    }

    public void delete(Role role) {
        em.remove(role);
    }

    public void update(Role role) {
        em.merge(role);
    }

    public Role getById(Integer id) {
        Query q = em.createQuery("select r from Role r where r.idRole = :idRole");
        q.setParameter("idRole", id);
        return (Role) q.getSingleResult();
    }
}
