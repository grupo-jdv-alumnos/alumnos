package pe.edu.cibertec.user.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.cibertec.model.Alumno;
import pe.edu.cibertec.service.AlumnoService;

public class AlumnoAction extends ActionSupport{

    @Autowired
    private AlumnoService alumnoService;
    private List<Alumno> alumnos;
    private Alumno alumno;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public String listarAlumnos() throws Exception {
        alumnos = alumnoService.list();
        return "success";

    }

    public String nuevoAlumno() throws Exception {
        alumno = new Alumno();
        return "success";
    }
    public String cargarAlumno() throws Exception {
        
        
        try {
            alumno=alumnoService.getById(id);
        } catch (Exception ex) {
            Logger.getLogger(AutorAction.class.getName()).log(Level.SEVERE, null, ex);
            return "accessDenied";
        }
        return "success";    
    }

    public String guardarAlumno() {
        if(alumno.getCodigo()==null){
             alumnoService.insert(alumno);
        }else{
            alumnoService.update(alumno);
        }
       
        return "success";
    }

    public String eliminarAlumno() throws Exception {
        Alumno alumno = new Alumno();
        alumno.setCodigo(id);
        try {
            alumnoService.delete(alumno);
        } catch (Exception ex) {
            Logger.getLogger(AutorAction.class.getName()).log(Level.SEVERE, null, ex);
            return "accessDenied";
        }
        return "success";
    }
    
    @Override
    public void validate() {
        if(alumno!=null){
            if(alumno.getAppaterno().equals("")){
                addFieldError("alumno.appaterno", "Ingrese Apellido paterno");
            }
        }
        
    }
}
