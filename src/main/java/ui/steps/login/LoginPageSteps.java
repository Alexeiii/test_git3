package ui.steps.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ui.objects.login.LoginPage;
import ui.steps.MainPageSteps;

public class LoginPageSteps extends MainPageSteps {
    private LoginPage loginPage;

    public LoginPageSteps(WebDriver driver){
        super(driver);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    public SignUpPageSteps performEmailRegistration(String email){
        loginPage.getEmailAddressRegistrationInput().clear();
        loginPage.getEmailAddressRegistrationInput().sendKeys(email);
        loginPage.getEmailAddressRegistrationButton().click();
        return new SignUpPageSteps(driver);
    }



}
