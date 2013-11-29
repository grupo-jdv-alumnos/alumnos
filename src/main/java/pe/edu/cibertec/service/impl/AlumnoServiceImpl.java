package pe.edu.cibertec.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dao.AlumnoDao;
import pe.edu.cibertec.model.Alumno;
import pe.edu.cibertec.service.AlumnoService;

@Service("alumnoService")
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    AlumnoDao alumnoDao;

    public List<Alumno> list() {
        return alumnoDao.list();
    }

    public Alumno getById(Integer id) {
        Alumno alumno=new Alumno();
        alumno=alumnoDao.getById(id);
        return alumno;
    }

    @Transactional
    public void insert(Alumno alumno) {
        alumnoDao.insert(alumno);
        //throw new BusinessException1("Exception de tipo 1 que genera rollback");
        //throw new BusinessException2("Exception de tipo 2 que no genera rollback");
    }
    
    @Transactional
    public void update(Alumno alumno) {
        alumnoDao.update(alumno);
    }

    @Transactional
    public void delete(Alumno alumno) {
        alumno = alumnoDao.getById(alumno.getCodigo());
        alumnoDao.delete(alumno);
    }
}
