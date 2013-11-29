package pe.edu.cibertec.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dao.AutorDao;
import pe.edu.cibertec.exception.BusinessException1;
import pe.edu.cibertec.exception.BusinessException2;
import pe.edu.cibertec.model.Autor;
import pe.edu.cibertec.service.AutorService;

@Service("autorService")
@Qualifier("impl1")
public class AutorServiceImpl implements AutorService {

    @Autowired
    AutorDao autorDao;

    public List<Autor> list() {
        return autorDao.list();
    }

    public Autor getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void insert(Autor autor) throws BusinessException1, BusinessException2 {

        autorDao.insert(autor);
        //throw new BusinessException1("Exception de tipo 1 que genera rollback");
        throw new BusinessException2("Exception de tipo 2 que no genera rollback");
    }

    public void update(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Transactional
    public void delete(Autor autor) {
        autor = autorDao.getById(autor.getIdAutor());
        autorDao.delete(autor);
    }

    public String generateAutorSignature(Autor autor) {
        autor = autorDao.getById(autor.getIdAutor());
        return autor.toString();
    }

    public AutorDao getAutorDao() {
        return autorDao;
    }

    public void setAutorDao(AutorDao autorDao) {
        this.autorDao = autorDao;
    }
}
