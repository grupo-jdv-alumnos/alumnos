package pe.edu.cibertec.user.bo.impl;

import pe.edu.cibertec.user.bo.TestBo;
import pe.edu.cibertec.user.bo.UserBo;

public class UserBoImpl implements UserBo{

    private TestBo test;
    
    public void printUser(){
            System.out.println("printUser() is executed..." + test.getSaludo());
    }

    public TestBo getTest() {
        return test;
    }

    public void setTest(TestBo test) {
        this.test = test;
    }
    
    
	
}