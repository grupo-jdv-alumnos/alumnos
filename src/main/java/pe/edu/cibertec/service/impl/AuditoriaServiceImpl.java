package pe.edu.cibertec.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dao.AuditoriaDao;
import pe.edu.cibertec.model.Auditoria;
import pe.edu.cibertec.service.AuditoriaService;

@Service("auditoriaService")
public class AuditoriaServiceImpl implements AuditoriaService {

    @Autowired
    AuditoriaDao dao;

    public List<Auditoria> list() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Auditoria getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Transactional
    public void insert(Auditoria auditoria) {
        dao.insert(auditoria);
    }

    public void update(Auditoria auditoria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(Auditoria auditoria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
