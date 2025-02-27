import HelpDesk.BaseSeleniumPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


abstract public class BaseSeleniumTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
    }

    @AfterMethod
    public void closeDriver() {
        driver.close();
        driver.quit();
    }
}
