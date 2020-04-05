package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    MLCInsuranceHomePage mlcInsuranceHomePage;
    MLCInsuranceRequestDemoPage mlcInsuranceRequestDemoPage;


    @Step("Open MLC insurance home page")
    public void mlcInsurancePage(){ mlcInsuranceHomePage.open(); }

    @Step("Click on Request Demo button")
    public void  mlcRequestDemoPage(){}


}
