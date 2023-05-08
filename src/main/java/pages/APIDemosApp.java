package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementHelper;

public class APIDemosApp {
    ElementHelper elementHelper;

    By actionBar = By.id("android:id/action_bar_title");
    By appTitle = By.xpath("//*[@resource-id=\"android:id/action_bar_title\"]");
    By app = By.xpath("//android.widget.TextView[@content-desc=\"App\"]");
    By alarm = By.xpath("//android.widget.TextView[@content-desc=\"Alarm\"]");
    By actionBarTab = By.xpath("//android.widget.TextView[@content-desc=\"Action Bar\"]");
    By getActionBarUsage = By.xpath("//android.widget.TextView[@content-desc=\"Action Bar Usage\"]");
    By searchIcon = By.id("android:id/search_button");
    By searchBox = By.id("android:id/search_src_text");
    By searchText=By.xpath("//*[@resource-id='android:id/content']/android.widget.TextView");


    public APIDemosApp(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkAppPageOpen() {
        elementHelper.checkElement(actionBar);
    }

    public String getApiDemosTitle() {
        return elementHelper.getText(appTitle);
    }

    public void clickToElement() {
        elementHelper.clickElement(app);
        elementHelper.findElement(alarm);
    }
    public void clickApp(){
        elementHelper.clickElement(app);
    }
    public void clickActionBar(){
        elementHelper.clickElement(actionBarTab);
    }
    public void clickActionBarUsage(){
        elementHelper.clickElement(getActionBarUsage);
    }
    public void clicksearchIcon(){
        elementHelper.clickElement(searchIcon);
    }
    public void sendKeyToSearchBox(String text){
     elementHelper.sendKeys(searchBox,text);
    }
    public void assertText(String text){
        Assert.assertTrue(elementHelper.findElement(searchText).getText().contains(text));
        System.out.println(elementHelper.findElement(searchText).getText());
        System.out.println(text);
    }
}
