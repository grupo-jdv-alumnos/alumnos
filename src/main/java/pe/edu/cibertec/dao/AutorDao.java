/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dao;

import java.util.List;
import pe.edu.cibertec.model.Autor;

/**
 *
 * @author francisco
 */
public interface AutorDao {

    public List<Autor> list();

    public Autor getById(Integer id);

    public void insert(Autor autor);

    public void update(Autor autor);

    public void delete(Autor autor);
}
