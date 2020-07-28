package org.example;

import com.sun.javafx.geom.Edge;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util {

    public static void setBrowser() {
        LoadProp loadProp = new LoadProp();
        String browserName = loadProp.getProperty("browser");
       // String url = loadProp.getProperty("url");
        {
            if (browserName.equalsIgnoreCase("Chrome")) {
                // set browser method to help reuse it
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDriver\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDriver\\geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("ie")) {
                System.setProperty("webdriver.ie.driver", "src\\test\\resources\\BrowserDriver\\IEDriverServer.exe");
                DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
                ieCapabilities.setCapability("nativeEvents", false);
                ieCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
                ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
                ieCapabilities.setCapability("disable-popup-blocking", true);
                ieCapabilities.setCapability("enablePersistentHover", true);
                ieCapabilities.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
                ieCapabilities.setCapability("requireWindowFocus", false);
                driver = new InternetExplorerDriver(ieCapabilities);


            } else {
                System.out.println(" browser name is empty or wrong" + browserName);
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.get("https://demo.nopcommerce.com");

        }
    }

        public static void setcloseBrowser ()
        {
            // close the browser once the test been run as it wont open many tabs
            driver.close();


        }
    }



