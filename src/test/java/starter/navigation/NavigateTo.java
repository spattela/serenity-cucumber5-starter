package starter.navigation;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class NavigateTo {

    MLCInsuranceHomePage mlcInsuranceHomePage;
    MLCInsuranceRequestDemoPage mlcInsuranceRequestDemoPage;
    ATOCalculationPage atoCalculationPage;


    @Step("Open MLC insurance home page")
    public void mlcInsurancePage(){ mlcInsuranceHomePage.open(); }

    @Step("Click on Request Demo button")
    public void  mlcRequestDemoPage(){}

    @Step("Open ATO calculation page")
    public void atoCalculationPage(){atoCalculationPage.open();}


}
