package starter.lifeview;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LifeView extends UIInteractionSteps {

    @Step("Click on Life View")
    public void clickLifeView() {
        $(LifeViewLinks.PARTNER_WITH_US).click();
        $(LifeViewLinks.LIFE_VIEW_LINK).click();
        $(LifeViewLinks.REQUEST_DEMO).click();

    }

}
