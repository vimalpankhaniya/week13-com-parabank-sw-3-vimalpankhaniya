package utility;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    public void clickElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    public void sendTextToElement(By by) {
        WebElement emailField = driver.findElement(by);
        emailField.sendKeys("text");
    }
    public String  getTextFromElement(By by){
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }

    public void sendTextFromElements(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    // **************** Alert Methods *********
    /*
     * this method will switch to alert
     */
    public void switchAlert(){

        driver.switchTo().alert();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void getTextFromAlert(){

        driver.switchTo().alert().getText();
    }
    public void sendTextToAlert (){
        driver.switchTo().alert().sendKeys("");
    }
    public void selectValueFromDropDown(By by,String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByValue(text);
    }

    public void selectByIndexFromDropDown(By by,int index){
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByIndex(index);
    }
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);


    }
    public void mouseHoverToElementAndClick(By by) {
        Actions hover = new Actions(driver);
        WebElement a = driver.findElement(by);
        hover.moveToElement(a).click().build().perform();

    }
    public void deleteElement(){

    }
}

