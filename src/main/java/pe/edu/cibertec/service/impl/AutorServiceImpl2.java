/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.model.Autor;
import pe.edu.cibertec.service.AutorService;

/**
 *
 * @author Francisco
 */
@Service("autorService2")
@Qualifier("impl2")
public class AutorServiceImpl2 implements AutorService{

    public List<Autor> list() {
        System.out.println("Ahora con Servicio 2");
        return new ArrayList();
    }

    public Autor getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void insert(Autor autor) {
        System.out.println("Guardando con Impl2");
    }

    public void update(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String generateAutorSignature(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
