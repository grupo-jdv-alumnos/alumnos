/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dao;

import java.util.List;
import pe.edu.cibertec.model.User;

/**
 *
 * @author francisco
 */
public interface UserDao {

    User getById(Integer id);

    List<User> list();

    void insert(User user);

    void update(User user);

    void delete(User user);
}
