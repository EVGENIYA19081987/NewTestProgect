package HelpDesk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NamePage extends BaseSeleniumPage {
    @FindBy(xpath = "//input[@id='search_text_box']")
    public WebElement inputBox;
    @FindBy(xpath = "//div[@class='header_real_name ellipsis']")
    private WebElement namePage;
    @FindBy(xpath = "//a[text()='Black8'][1]")
    public WebElement userName;

    public NamePage() {
        PageFactory.initElements(BaseSeleniumPage.driver, this);
    }

    public String getName() {
        return namePage.getText();
    }

    public String getUsername() {
        return userName.getText();
    }
}
