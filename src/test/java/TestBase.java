import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import java.time.Duration;

public class TestBase {

    public static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= Browser.getDriver();
        driver.navigate().to(Info.URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().deleteAllCookies();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    public LoginPage startLoginPage(){
        return PageFactory.initElements(driver, LoginPage.class);
    }

}
