package pruebagoogle.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Homepage {

    WebDriver driver;
    By searchField = By.xpath(".//input[@name=\"q\"]");
    By searchButton = By.xpath(".//input[@name=\"btnK\"]");

    public Homepage(WebDriver driver){
        this.driver = driver;
    }

    public void searchFieldInputText(String text){
        driver.findElement(searchField).sendKeys(text);
    }

    public void clickTheGoogleSearchButton(){
        driver.findElement(searchField).sendKeys(Keys.TAB);
        driver.findElement(searchButton).submit();
    }

    public void clickOnTheFirstSuggestionInTheList(){
        try {
        Thread.sleep(2000);
        driver.findElement(searchField).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(searchField).sendKeys(Keys.TAB);
        driver.findElement(searchButton).submit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
