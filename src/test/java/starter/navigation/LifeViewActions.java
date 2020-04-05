package starter.navigation;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LifeViewActions extends UIInteractionSteps {

    MLCInsuranceLifeViewPage mlcInsuranceLifeViewPage;



    @Step("CHeck if Life view page is loaded")
    public void checkPageIsLoaded(){

        mlcInsuranceLifeViewPage.isLoaded();

    }

    @Step("Search for term {0}")
    public void clickOnRequestDemoPage() {
        $(MLCInsuranceLifeViewPage.REQ_DEMO_BUTTON).click();


    }

    @Step("enter the Request demo form details")
    public void enterReqFormDetails(String name , String company , String email, String phone,String reqDetails ){
        $(MLCInsuranceLifeViewPage.NAME_FIELD).sendKeys(name);
        $(MLCInsuranceLifeViewPage.COMPANY_FIELD).sendKeys(company);
        $(MLCInsuranceLifeViewPage.EMAIL_FIELD).sendKeys(email);
        $(MLCInsuranceLifeViewPage.PHONE_FIELD).sendKeys(phone);
        $(MLCInsuranceLifeViewPage.PREFERRED_CONTACT_TIME_PM).click();
        $(MLCInsuranceLifeViewPage.REQUEST_DETAILS).sendKeys(reqDetails);


    }




}
