package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    MLCInsuranceHomePage mlcInsuranceHomePage;


    @Step("Open MLC insurance home page")
    public void mlcInsurancePage(){ mlcInsuranceHomePage.open(); }


}
