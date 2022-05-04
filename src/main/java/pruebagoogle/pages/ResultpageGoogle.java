package pruebagoogle.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ResultpageGoogle {

    WebDriver driver;
    By firstResult = By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3");


    public ResultpageGoogle(WebDriver driver){
                this.driver = driver;
    }

    public void theFirstResultIs(String text){

        System.out.println(driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3[text()=\""+text+"\"]")).getText().trim());

        if (!text.trim().equals(driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3[text()=\""+text+"\"]")).getText().trim())){
            new Error("EL resultado no fue encontrado");
        };

    }

    public void clickOnTheFirstResultLink(){
        driver.findElement(firstResult).click();
    }

}
