package HelpDesk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CommunityPage extends BaseSeleniumPage {
    @FindBy(xpath = "//input[@id='SearchPlayers']")
    public WebElement SearchButton;
    @FindBy(xpath = "//input[@class='community_home_search_players_image']")
    public WebElement Loup;



    public CommunityPage() {
        PageFactory.initElements(BaseSeleniumPage.driver, this);
    }



    public Users findTitle(String str) {
        SearchButton.click();
        SearchButton.sendKeys(str);
        System.out.println("данные введены");
        Loup.click();
        System.out.println("клилнут значок лупы");
        return new Users();
    }

}
