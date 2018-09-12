package ui.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ui.objects.MainPage;
import ui.steps.login.LoginPageSteps;

public class MainPageSteps {
    private MainPage mainPage;
    protected WebDriver driver;

    public MainPageSteps (WebDriver driver){
        this.driver = driver;
        this.mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    public void search(String searchQuery){
        mainPage.getInputSearch().clear();
        mainPage.getInputSearch().sendKeys(searchQuery);
        mainPage.getSearchSubmitButton().click();
    }

    public LoginPageSteps clickSigninButton(){
        mainPage.getSigninButton().click();
        return new LoginPageSteps(driver);


    }

}
