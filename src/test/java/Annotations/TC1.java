package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {

    @BeforeClass
    void beforeClass(){
        System.out.println("Run Before the Test Method Execute");
    }
    @AfterClass
    void  afterClass(){
        System.out.println("Run After the Test Method Execute");
    }
    @BeforeMethod
    void  beforeMethod(){
        System.out.println("Run Before the Test  Execute");
    }

    @AfterClass
    void afterMethod(){
        System.out.println("Run After the Test  Execute");
    }
    @Test
    void testOne(){
        System.out.println("This is my test-01");
    }
    @Test
    void testTwo(){
        System.out.println("This is my test-02");
    }


}
