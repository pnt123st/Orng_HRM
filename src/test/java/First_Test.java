import org.testng.annotations.Test;

public class First_Test extends TestBase{
    //WebDriver driver;

    @Test
    public void test_01(){
        startLoginPage().loginToPIMPage();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
