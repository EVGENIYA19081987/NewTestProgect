package HelpDesk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import providers.DataProviders;

public class MainPage extends BaseSeleniumPage{

    @FindBy(xpath = "//div[@class='responsive_page_content']//a[@data-tooltip-content='.submenu_Community']")
    public WebElement ButtonCommunity;

    public MainPage() {

        BaseSeleniumPage.driver.get(DataProviders.URL);
        PageFactory.initElements(BaseSeleniumPage.driver,this);

    }

    public CommunityPage clickCommunity() {
        ButtonCommunity.click();
        System.out.println("Открыта страница сообщества");
        return new CommunityPage();
    }

}
