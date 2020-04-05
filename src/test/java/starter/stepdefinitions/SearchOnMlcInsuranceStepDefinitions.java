package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.navigation.LifeViewActions;
import starter.lifeview.LifeView;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResult;
import starter.search.SearchResultList;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import static org.assertj.core.api.Assertions.assertThat;
import static starter.matchers.TextMatcher.textOf;

public class SearchOnMlcInsuranceStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchResult searchResult;

    @Steps
    LifeView lifeViewPage;


    @Steps
    SearchResultList searchResultList;

    @Steps
    LifeViewActions lifeViewActions;




    @When("^s?he (?:searches|has searched) for \"(.*)\"")
    public void i_search_for(String term) {
        searchFor.term(term);
    }


    @When("^s?he (?:searches|has searched) again for \"(.*)\"")
    public void i_search_again_for(String term) {
        searchFor.termOnSearchResultsPage(term);
    }

    @Then("all the result titles should contain the word {string}")
    public void all_the_result_titles_should_contain_the_word(String expectedTerm) {
        assertThat(searchResult.titles())
                .allMatch(title -> textOf(title).containsIgnoringCase(expectedTerm));
    }

    @Given("a user is on the mlc insurance page")
    public void aUserIsOnTheMlcInsurancePage() {
        navigateTo.mlcInsurancePage();
    }

    @And("user clicks on the lifeview link")
    public void userClicksOnTheLifeviewLink() {
        searchResultList.clickOnthesearchedTerm();
    }

    @Then("user should be navigated to lifeview landing page")
    public void userShouldBeNavigatedToLifeviewLandingPage() {
        lifeViewActions.checkPageIsLoaded();
    }


    @When("the user clicks on Request a demo button")
    public void theUserClicksOnRequestADemoButton() {
        lifeViewActions.clickOnRequestDemoPage();
    }




    @Then("a form is displayed to enter the following user details such as <name>,<company>,<email>,<phone>,<request details>")
    public void aFormIsDisplayedToEnterTheFollowingUserDetailsSuchAsNameCompanyEmailPhoneRequestDetails(String name, String company, String email , String phone, String request_details) {
        lifeViewActions.enterReqFormDetails(name,company,email,phone ,request_details);
    }


    @Then("a form is displayed to enter the following user details such as {string},{string},{string},{string},{string}")
    public void aFormIsDisplayedToEnterTheFollowingUserDetailsSuchAs(String name, String company, String email, String phone, String text) {
        lifeViewActions.enterReqFormDetails(name,company,email,phone ,text);
    }
}
