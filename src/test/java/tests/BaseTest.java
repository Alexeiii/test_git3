package tests;

import listeners.CustomListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import ui.steps.MainPageSteps;

@Listeners (CustomListener.class)
public class BaseTest {
    public MainPageSteps mainPageSteps;
    public WebDriver driver;

    @BeforeMethod
    public void prepareEnv(){
        System.out.println("Preparing enviroment!");
        System.setProperty("webdriver.chrome.driver",
                "D:\\AutoTest\\sel\\src\\main\\resources\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("marionette", true);

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        mainPageSteps = new MainPageSteps(driver);

    }

    @AfterMethod
    public void cleanupEnv(){

        System.out.println("Clean up enviroment!");
        //driver.quit();

    }
}
