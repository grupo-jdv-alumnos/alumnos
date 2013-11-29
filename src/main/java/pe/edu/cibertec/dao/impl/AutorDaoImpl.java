package pe.edu.cibertec.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dao.AutorDao;
import pe.edu.cibertec.model.Autor;

@Repository("autorDao")
public class AutorDaoImpl implements AutorDao {

    @PersistenceContext
    private EntityManager em;

    public List<Autor> list() {
        Query q = em.createQuery("select a from Autor a");
        return q.getResultList();
    }

    public Autor getById(Integer id) {
        Query q = em.createQuery("select a from Autor a where a.idAutor = :idAutor");
        q.setParameter("idAutor", id);
        return (Autor) q.getSingleResult();
    }

    public void insert(Autor autor) {
        em.persist(autor);

    }

    public void update(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(Autor autor) {
        em.remove(autor);
    }
}
