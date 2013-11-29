package pe.edu.cibertec.interceptor;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.model.Alumno;
import pe.edu.cibertec.model.Auditoria;
import pe.edu.cibertec.model.Autor;
import pe.edu.cibertec.service.AuditoriaService;

@Aspect
@Component("auditoriaInterceptor")
public class AuditoriaInterceptor {

    @Autowired
    AuditoriaService service;

    public void beforeDeleteAutorInterceptor(JoinPoint joinPoint) {
        Autor autor = (Autor) joinPoint.getArgs()[0];
        Auditoria auditoria = new Auditoria();
        auditoria.setFecha(new Date());
        auditoria.setValor("Eliminado: " + autor.toString());
        service.insert(auditoria);
    }

    @After("execution(* pe.edu.cibertec.dao.impl.AutorDaoImpl.delete(pe.edu.cibertec.model.Autor)) && args(autor)")
    public void afterDeleteAutorInterceptor(Autor autor) {
        Auditoria auditoria = new Auditoria();
        auditoria.setFecha(new Date());
        auditoria.setValor("Eliminado: " + autor.toString());
        service.insert(auditoria);
    }

    public void beforeDeleteAlumnoInterceptor(JoinPoint joinPoint) {
        Autor autor = (Autor) joinPoint.getArgs()[0];
        Auditoria auditoria = new Auditoria();
        auditoria.setFecha(new Date());
        auditoria.setValor("Eliminado: " + autor.toString());
        service.insert(auditoria);
    }

    @After("execution(* pe.edu.cibertec.dao.impl.AlumnoDaoImpl.delete(pe.edu.cibertec.model.Alumno)) && args(alumno)")
    public void afterDeleteAlumnoInterceptor(Alumno alumno) {
        Auditoria auditoria = new Auditoria();
        auditoria.setFecha(new Date());
        auditoria.setValor("Eliminado: " + alumno.toString());
        service.insert(auditoria);
    }
    @After("execution(* pe.edu.cibertec.dao.impl.AlumnoDaoImpl.update(pe.edu.cibertec.model.Alumno)) && args(alumno)")
    public void afterUpdateAlumnoInterceptor(Alumno alumno) {
        Auditoria auditoria = new Auditoria();
        auditoria.setFecha(new Date());
        auditoria.setValor("Actualizado: " + alumno.toString());
        service.insert(auditoria);
    }
}
