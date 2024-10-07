import org.testng.annotations.Test;

public class LoginTestCase {

    @Test
    public  void validCredinatil(){
        System.out.println("Entered Correct Username and password");
    }

    @Test
     public  void   invalidCredinatil(){
         System.out.println("Entered Wrong Username and password");
    }
}
