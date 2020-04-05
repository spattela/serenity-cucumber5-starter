package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


class MLCInsuranceLifeViewPage extends PageObject {
    static By REQ_DEMO_BUTTON = By.xpath("//span[contains(text(),'Request a demo')]");
    static By NAME_FIELD = By.xpath("//input[contains(@id,'wffm0635571898ed434b8db4317b0d7a8d19_Sections_0__Fields_0__Value')]");
    static By COMPANY_FIELD = By.xpath("//input[contains(@id,'wffm0635571898ed434b8db4317b0d7a8d19_Sections_0__Fields_1__Value')]");
    static By EMAIL_FIELD = By.xpath("//input[contains(@id,'wffm0635571898ed434b8db4317b0d7a8d19_Sections_0__Fields_2__Value')]");
    static By PHONE_FIELD = By.xpath("//input[contains(@id,'wffm0635571898ed434b8db4317b0d7a8d19_Sections_0__Fields_3__Value')]");
    static By PREFERRED_CONTACT_TIME_PM = By.xpath("//input[contains(@value,'PM')]");
    static By REQUEST_DETAILS = By.xpath("//textarea[contains(@id,'wffm0635571898ed434b8db4317b0d7a8d19_Sections_0__Fields_6__Value')]");

    public void isLoaded(){
       assert  findBy("//ul[@itemprop='breadcrumb']").getText().equals("home / Patnering with us /Superannuation funds / lifeview");

    }



    }


