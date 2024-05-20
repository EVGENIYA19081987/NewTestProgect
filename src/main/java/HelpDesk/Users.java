package HelpDesk;
import HelpDesk.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Users extends BaseSeleniumPage {
    List<WebElement> usersName = BaseSeleniumPage.driver.findElements(By.xpath("//div[@id='search_results']"));


    public Users() {
        PageFactory.initElements(BaseSeleniumPage.driver, this);
    }


    public NamePage findUser() {
        if (usersName.size() >= 2) {
            System.out.println("Элементов в списке больше двух");
        }
        return new NamePage();
    }
}
