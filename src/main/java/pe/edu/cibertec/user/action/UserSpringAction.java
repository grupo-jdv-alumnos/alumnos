package pe.edu.cibertec.user.action;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pe.edu.cibertec.model.Autor;
import pe.edu.cibertec.service.AutorService;
import pe.edu.cibertec.service.BlogService;
import pe.edu.cibertec.service.UserService;
import pe.edu.cibertec.user.bo.UserBo;

public class UserSpringAction {

    @Autowired
    private UserService userService;
    @Resource(name = "blogService")
    private BlogService blogService;
    @Autowired
    @Qualifier("impl1")
    private AutorService autorService;
    //DI via Spring
    private UserBo userBo;

    public UserBo getUserBo() {
        return userBo;
    }

    public void setUserBo(UserBo userBo) {
        this.userBo = userBo;
    }

    public String execute() throws Exception {

        userBo.printUser();
        userService.list();
        blogService.listarBlogs();

        Autor autor = new Autor();
        autor.setNombres("Francisco");
        autor.setApePaterno("Verastegui");
        autor.setApeMaterno("Meza");
        autorService.insert(autor);
        System.out.println("Autor Id: " + autor.getIdAutor());

        return "success";

    }
}