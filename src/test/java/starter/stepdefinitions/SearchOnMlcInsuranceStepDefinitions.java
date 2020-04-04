package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResult;
import starter.search.SearchResultList;

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
    SearchResultList searchResultList;



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
}
