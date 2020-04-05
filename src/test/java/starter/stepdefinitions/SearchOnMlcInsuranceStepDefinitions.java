package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.lifeview.LifeView;
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
    LifeView lifeViewPage;


    @Steps
    SearchResultList searchResultList;


    @Given("Sergey is on the DuckDuckGo home page")
    public void sergey_is_on_the_DuckDuckGo_home_page() {
        navigateTo.mlcInsurancePage();
    }

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

    @Given("A user is on the mlc insurance page")
    public void aUserIsOnTheMlcInsurancePage() {
        navigateTo.mlcInsurancePage();
    }

    @And("He clicks on lifeview link")
    public void userClicksOnTheLifeviewLink() {
        lifeViewPage.clickLifeView();
    }


}
