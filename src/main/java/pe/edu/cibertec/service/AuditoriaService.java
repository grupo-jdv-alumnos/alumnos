package pe.edu.cibertec.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.model.Auditoria;

@Service("auditoriaService")
public interface AuditoriaService {

    public List<Auditoria> list();

    public Auditoria getById(Integer id);

    public void insert(Auditoria auditoria);

    public void update(Auditoria auditoria);

    public void delete(Auditoria auditoria);
}
