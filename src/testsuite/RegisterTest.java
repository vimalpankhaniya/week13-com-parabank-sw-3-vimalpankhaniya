package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class RegisterTest extends Utility {
    String baseurl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }

    @Test
    public void verifyThatSigningUpPageDisplay() {
        //click on the ‘Register’ link
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        // Verify the text 'Signing up is easy!';
        String expectedMessage = "Signing up is easy!";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Signing up is easy!')]"));
        String actualMessage = actualTextMessageElement.getText();
        // Verify actual and Expected
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully(){
        // Click on'Register' link
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        // Enter First name
        sendTextFromElements(By.id("customer.firstName"),"Vimal");
        // Enter Last name
        sendTextFromElements(By.id("customer.lastName"),"Pankhaniya");
        // Enter address
        sendTextFromElements(By.id("customer.address.street"),"56,Highfield ");
        //Enter city
        sendTextFromElements(By.id("customer.address.city"),"London");
        // Enter State
        sendTextFromElements(By.id("customer.address.state"),"London");
        // Enter Zip code
        sendTextFromElements(By.id("customer.address.zipCode"),"NW1 4DT");
        // Enter Phone
        sendTextFromElements(By.id("customer.phoneNumber"),"0786532778");
        //Enter SSN
        sendTextFromElements(By.id("customer.ssn"),"123456");
        //Enter Username
        sendTextFromElements(By.id("customer.username"),"Locate");
        //Enter Password
        sendTextFromElements(By.id("customer.password"),"Alfa123");
        //Enter Confirm Password
        sendTextFromElements(By.id("repeatedPassword"),"Alfa123");
        // Click on Register button
        clickElement(By.xpath("//tbody/tr[13]/td[2]/input[1]"));
        // Actual Requirements
        String expectedMessage = "Your account was created successfully. You are now logged in.";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//p[contains(text(),'Your account was created successfully. You are now logged in.')]"));
        String actualMessage = actualTextMessageElement.getText();
        // Verify actual and expected
        Assert.assertEquals(expectedMessage, actualMessage);

    }

     {
    }


    @After
    public void tearDown(){
        closeBrowser();
    }

}



