package pe.edu.cibertec.service;

import java.util.List;
import pe.edu.cibertec.model.User;

public interface UserService {

    public List<User> list();

    public void insert(User user);

    public void delete(User user);
}
