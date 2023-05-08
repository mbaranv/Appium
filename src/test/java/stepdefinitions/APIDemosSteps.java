package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.APIDemosApp;
import utils.DriverManager;

public class APIDemosSteps {

    APIDemosApp apiDemosApp = new APIDemosApp(DriverManager.getDriver());


    @Given("Check that the application is opened.")
    public void checkThatTheApplicationIsOpened() {
        apiDemosApp.checkAppPageOpen();
    }

    @Given("Check that the title of application is {string}")
    public void checkThatTheTitleOfApplicationIs(String text) {
        String title = apiDemosApp.getApiDemosTitle();
        Assert.assertEquals(title, text, "Title is not same");
    }

    @When("Check that the App tab is clicked")
    public void checkThatTheAppTabIsClicked() {
        apiDemosApp.clickToElement();

    }

    @When("Click to App tab")
    public void clickToAppTab() {
        apiDemosApp.clickApp();
    }

    @And("Click to Action Bar")
    public void clickToActionBar() {
        apiDemosApp.clickActionBar();
    }

    @And("Click to Action Bar Usage")
    public void clickToActionBarUsage() {
        apiDemosApp.clickActionBarUsage();
    }

    @And("Click to Search icon")
    public void clickToSearchIcon() {
        apiDemosApp.clicksearchIcon();
    }

    @And("Send to {string} and search")
    public void sendToAndSearch(String text ) {
        apiDemosApp.sendKeyToSearchBox(text);
    }

    @Then("Check to {string} at result")
    public void checkToAtResult(String text) {
        apiDemosApp.assertText(text);
    }
}
