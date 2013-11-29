package pe.edu.cibertec.service.impl;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.service.BlogService;

@Service("blogService")
public class BlogServiceImpl implements BlogService {

    public void listarBlogs() {
        System.out.println("Listando blogs");
    }
}
