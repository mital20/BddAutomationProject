package org.example;

import org.openqa.selenium.By;

public class RegisterSuccessPage extends Util
{

    private By _registerSuccessfulMessage = By.xpath("//div[text()=\"Your registration completed\"]");
    String expectedRegisterSuccessfulMessage = "Your registration completed";

    public void verifyUserIsOnRegisterResultPage()
    {
        assertURL("registerresult");// checking if is pn register result page


    }
    public void userCanSeeSuccessfulMessage()
    {
        // getting  Your registration completed message
        asserttextmessage(getTextFromElement(_registerSuccessfulMessage),expectedRegisterSuccessfulMessage,"user can see successfull message");
        System.out.println(_registerSuccessfulMessage);
        takeScreenShot("abc");


    }

}
