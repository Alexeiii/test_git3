package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;


public class TestMainPage extends BaseTest {

    @Test(description = "91")
//id тесткейсов
    void testSearch() {
    mainPageSteps.search("Cool dress!!!!!");

    }


}
