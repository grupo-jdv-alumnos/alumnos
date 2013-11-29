/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service.impl;

import junit.framework.TestCase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import pe.edu.cibertec.dao.impl.AutorDaoImpl;
import pe.edu.cibertec.model.Autor;

/**
 *
 * @author Francisco
 */
public class AutorServiceImplTest extends TestCase {
    
    private AutorDaoImpl dao;
    
    private AutorServiceImpl service;
    
    public AutorServiceImplTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        dao = mock(AutorDaoImpl.class);
        service = new AutorServiceImpl();
        service.setAutorDao(dao);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of list method, of class AutorServiceImpl.
     */
    public void testList() {
        
    }
    
    /**
     * Test of generateAutorSignature method, of class AutorServiceImpl.
     */
    public void testGenerateAutorSignature() {
        Autor autorParam = new Autor();
        autorParam.setIdAutor(1);
        
        Autor autorResult = new Autor();
        autorResult.setIdAutor(1);
        autorResult.setNombres("Italo");
        autorResult.setApePaterno("Mattos");
        autorResult.setApeMaterno("Piaggio");
        when(dao.getById(autorParam.getIdAutor())).thenReturn(autorResult);
        
        String expectedSignature = "Autor{idAutor=1, nombres=Italo, apePaterno=Mattos, apeMaterno=Piaggio}";
        String actualSignature = service.generateAutorSignature(autorParam);
        
        assertEquals(expectedSignature, actualSignature);
        
        verify(dao).getById(1);
        
    }
}
