package pruebagoogle.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultpageConsult {

    WebDriver driver;
    By resultName = By.id("firstHeading");

    public ResultpageConsult(WebDriver driver){
        this.driver = driver;
    }

    public void is(String text){
        System.out.println(driver.findElement(resultName).getText().trim());

        if (!text.trim().equals(driver.findElement(resultName).getText().trim())){
            new Error("EL resultado no fue encontrado");
        };
    }

}
