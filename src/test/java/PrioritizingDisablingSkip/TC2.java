package PrioritizingDisablingSkip;

import org.testng.annotations.Test;

public class TC2 {
    @Test(priority = 0)
    void  test1(){
        System.out.println("Test one ");
    }
    @Test(priority = 1)
    void test2(){
        System.out.println("Test two ");
    }

    @Test(priority = 2)
    void test3(){
        System.out.println("Test Three");
    }
    @Test(priority = 3)
    void test4(){
        System.out.println("Test Four");
    }
    @Test(priority = 3)
    void test5(){
        System.out.println("Test Five");
    }





}
