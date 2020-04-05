package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.lifeview.LifeView;
import starter.navigation.ATOCalculationsActions;
import starter.navigation.LifeViewActions;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResult;
import starter.search.SearchResultList;

import static org.assertj.core.api.Assertions.assertThat;
import static starter.matchers.TextMatcher.textOf;

public class ATOCalcStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    ATOCalculationsActions atoCalculationsActions;



    @Given("a user is on the ATO page")
    public void aUserIsOnTheATOPage() { navigateTo.atoCalculationPage(); }



    @When("user selects {string} as the financial year with taxable income of {string} and status as {string}")
    public void userSelectsAsTheFinancialYearWithTaxableIncomeOfAndStatusAs(String year, String income, String residency) {
        atoCalculationsActions.enterCalculationFormDetails(year,income,residency);
    }

    @Then("user should see {string} as the taxable amount")
    public void userShouldSeeAsTheTaxableAmount(String taxableamount) {
        atoCalculationsActions.verifyTaxableIncome(taxableamount);

    }




}
