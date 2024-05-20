import HelpDesk.MainPage;
import HelpDesk.NamePage;
import Helpers.StringHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Helpers.StringModifier.getUniqueString;

public class MainTest extends BaseSeleniumTest {

    @Test
    public void test() {
        String title1 = getUniqueString(StringHelper.HELP_NAME);
        NamePage users = new MainPage().clickCommunity().
                findTitle(title1).
                findUser();


        Assert.assertEquals(users.getUsername(), StringHelper.HELP_NAME);


    }
}
