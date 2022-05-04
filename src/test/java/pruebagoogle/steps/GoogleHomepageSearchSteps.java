package pruebagoogle.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pruebagoogle.pages.Homepage;
import pruebagoogle.pages.ResultpageConsult;
import pruebagoogle.pages.ResultpageGoogle;


public class GoogleHomepageSearchSteps {

    WebDriver driver = new ChromeDriver();
    Homepage inHomePage = new Homepage(driver);
    ResultpageGoogle inResultPage = new ResultpageGoogle(driver);
    ResultpageConsult thePageConsult = new ResultpageConsult(driver);

    @Given("I’m on the homepage")
    public void imOnTheHomepage() {
        driver.get("https://www.google.com");
    }

    @When("^I type “(.*)” into the search field$")
    public void iTypeTheNameOfTheWindIntoTheSearchField(String text) {
        inHomePage.searchFieldInputText(text);
    }


    @When("^I click the Google Search button$")
    public void iClickTheGoogleSearchButton() {
        inHomePage.clickTheGoogleSearchButton();
    }

    @Then("^I go to the search results page and the first result is “(.*)”$")
    public void iGoToTheSearchResultsPageAndTheFirsResultIsTheNameOfTheWind(String text) {
        inResultPage.theFirstResultIs(text);
    }


    @When("^I click on the first result link$")
    public void iClickOnTheFirstResultLink() {
        inResultPage.clickOnTheFirstResultLink();
    }

    @When("^the suggestions list is displayed and I click on the first suggestion in the list$")
    public void iClickOnTheFirstSuggestionInTheList() {
        inHomePage.clickOnTheFirstSuggestionInTheList();
    }

    @Then("^I go to the “(.*)” page$")
    public void iGoToThePatrickRothfussTheBooksPage(String text) {
        thePageConsult.is(text);
        driver.close();
    }


}
