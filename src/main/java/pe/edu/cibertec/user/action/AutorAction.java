package pe.edu.cibertec.user.action;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pe.edu.cibertec.exception.BusinessException1;
import pe.edu.cibertec.exception.BusinessException2;
import pe.edu.cibertec.model.Autor;
import pe.edu.cibertec.service.AutorService;

public class AutorAction {

    @Autowired
    @Qualifier("impl1")
    private AutorService autorService;
    private List<Autor> autores;
    private Autor autor;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public String listarAutores() throws Exception {

        autores = autorService.list();
        return "success";

    }

    public String nuevoAutor() throws Exception {
        autor = new Autor();
        return "success";
    }

    public String guardarAutor() {
        try {
            autorService.insert(autor);
        } catch (BusinessException1 ex) {
            Logger.getLogger(AutorAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BusinessException2 ex) {
            Logger.getLogger(AutorAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "success";
    }

    public String eliminarAutor() throws Exception {
        Autor autor = new Autor();
        autor.setIdAutor(id);
        try {
            autorService.delete(autor);
        } catch (Exception ex) {
            Logger.getLogger(AutorAction.class.getName()).log(Level.SEVERE, null, ex);
            return "accessDenied";
        }

        return "success";
    }
}
