
package pe.edu.cibertec.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.model.Alumno;
import pe.edu.cibertec.model.Autor;
import pe.edu.cibertec.service.AlumnoService;
import pe.edu.cibertec.service.AutorService;


@Aspect
@Component("applicationInterceptor")
public class ApplicationInterceptor {

    @Autowired
    @Qualifier("impl2")
    AutorService service;  

    public void beforeInsertAutorInterceptor(JoinPoint joinPoint) {
        System.out.println("Intercepting " + joinPoint.getSignature().getName() + " method");
        System.out.println("Before inserting: " + joinPoint.getArgs()[0]);
    }

    @After("execution(* pe.edu.cibertec.service.impl.AutorServiceImpl.insert(pe.edu.cibertec.model.Autor)) && args(autor)")
    public void afterInsertAutorInterceptor(Autor autor) {
        System.out.println("After inserting: " + autor);
        //service.insert(autor);
    }    
 
}
