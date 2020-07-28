package org.example;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.testng.ITestResult;

public class Hooks extends Util
{
    BrowserManager browserManager = new BrowserManager();

    @Before
    public void openBrowser()
    {
        browserManager.setBrowser();}// calling browser method to open home page


    @After
    public  void closeBrowser(){

        browserManager.setcloseBrowser();// calling browser method to close the browser
    }
}