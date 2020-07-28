package org.example;

import org.openqa.selenium.By;

public class HomePage extends Util
{
    private By _registerButton = By.className("ico-register");
    private By _welcomeTileText = By.xpath("//div[@class=\"topic-block-title\"]/h2");
    private By _news = By.xpath("//a[text()=\"New online store is open!\"]");
    String expected = "Welcome to our store";


    public void verifyUserIsOnHomepage()
    {
        // verifying if user is on home page
        asserttextmessage(getTextFromElement(_welcomeTileText),expected,"user on home page");

    }
    public void clickOnRegisterButton()
    {
        sleep1(1000);
        clickOnElement(_registerButton);// user clicks on register button

    }
}
