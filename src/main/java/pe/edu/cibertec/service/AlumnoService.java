package pe.edu.cibertec.service;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import pe.edu.cibertec.model.Alumno;

public interface AlumnoService {


    public List<Alumno> list();

    public Alumno getById(Integer id);

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    public void insert(Alumno alumno);

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    public void update(Alumno alumno);

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public void delete(Alumno alumno);
}
