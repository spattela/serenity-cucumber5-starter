package starter.navigation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;


class LifeViewPage extends PageObject {

    @FindBy(css ="#main .collection-list a:nth-child(1)" )
    WebElementFacade searchResult;

    public LifeViewPage(WebDriver driver){
        super(driver);
    }


}
