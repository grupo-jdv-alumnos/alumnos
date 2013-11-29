package pe.edu.cibertec.dao;

import java.util.List;
import pe.edu.cibertec.model.Alumno;

public interface AlumnoDao {

    public List<Alumno> list();

    public Alumno getById(Integer id);

    public void insert(Alumno alumno);

    public void update(Alumno alumno);

    public void delete(Alumno alumno);
}
