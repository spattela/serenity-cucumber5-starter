package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class ATOCalculationPage extends PageObject {
    static By SELECT_INCOME_DROPDOWN = By.id("ddl-financialYear");
    static By SELECT_PARTYEAR_DROPDOWN = By.id("ddl-residentPartYearMonths");
    static By SALARY_INPUT = By.id("texttaxIncomeAmt");
    static By RESIDENT_RADIO = By.id("vrb-resident-span-0");
    static By NONRESIDENT_RADIO = By.id("vrb-resident-span-1");
    static By PARTYEARRESIDENT_RADIO = By.id("vrb-resident-span-2");

    static By SUBMIT_BUTTON = By.id("bnav-n1-btn4");
    static By RESULT_DIV = By.xpath("//div[contains(@class,'white-block')]");



}
