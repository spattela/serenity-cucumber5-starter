package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultList extends UIInteractionSteps {
    static By RESULT_TITLES = By.cssSelector("#main .collection-list a:nth-child(1)");
    static  By FIRST_TITLE = By.xpath("//span[contains(text(),'MLC Life Insurance has developed ')]");


    @Step("Search for term {0}")
    public void clickOnthesearchedTerm() {
        new WebDriverWait(getDriver(),5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'q-autocomplete-results')]")));
        $(SearchResultList.FIRST_TITLE).click();

    }
}
