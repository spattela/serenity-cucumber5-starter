package starter.lifeview;

import org.openqa.selenium.By;

class LifeViewLinks {
    static By LIFE_VIEW_LINK = By.partialLinkText("LifeView");
    static By PARTNER_WITH_US = By.partialLinkText("Partnering with us");
    static By REQUEST_DEMO = By.xpath("//a[contains(@href,'lifeview-demo')]");
    static By SEARCH_BUTTON_ON_RESULT_PAGE = By.cssSelector("#search_button");
}
