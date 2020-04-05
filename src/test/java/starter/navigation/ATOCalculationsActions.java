package starter.navigation;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;


public class ATOCalculationsActions extends UIInteractionSteps {

    ATOCalculationPage atoCalculationPage;



    @Step("enter the ATO form details")
    public void enterCalculationFormDetails(String year, String income, String residency){
        $(ATOCalculationPage.SELECT_INCOME_DROPDOWN).selectByValue(year);
        $(ATOCalculationPage.SALARY_INPUT).sendKeys(income);

        if(residency != "non-resident" && residency != "partyear-resident") {
            $(ATOCalculationPage.RESIDENT_RADIO).click();
        }
         else {
            $(ATOCalculationPage.PARTYEARRESIDENT_RADIO).click();
            $(ATOCalculationPage.SELECT_PARTYEAR_DROPDOWN).selectByValue("3");
        }

        $(ATOCalculationPage.SUBMIT_BUTTON).click();

        }

        public void verifyTaxableIncome(String amount){
       assert $(ATOCalculationPage.RESULT_DIV).containsText(amount);
        }



    }




