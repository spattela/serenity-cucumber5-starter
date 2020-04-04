package starter.search;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;




import java.util.List;
import java.util.stream.Collectors;

public class SearchResult extends UIInteractionSteps {
    public List<String> titles() {
        return findAll(SearchResultList.RESULT_TITLES)
                .stream()
                .map(WebElementFacade::getTextContent)
                .filter(text -> !text.equalsIgnoreCase("Ad"))
                .collect(Collectors.toList());
    }

}
