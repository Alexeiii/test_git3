package tests.login;

import org.testng.annotations.Test;
import tests.BaseTest;
import ui.steps.login.LoginPageSteps;
import ui.steps.login.SignUpPageSteps;

public class TestSignUp extends BaseTest {

    @Test
    void testSignUp(){
        LoginPageSteps loginPageSteps = mainPageSteps.clickSigninButton();
        SignUpPageSteps signUpPageSteps =
                loginPageSteps.performEmailRegistration("wewew@gmail.com");

    }
}
