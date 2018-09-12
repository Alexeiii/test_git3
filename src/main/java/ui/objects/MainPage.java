package ui.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    protected WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy (name ="submit_search")
    private WebElement searchSubmitButton;

    @FindBy (id ="search_query_top")
    private WebElement inputSearch;

    @FindBy(className = "login")
    private WebElement signinButton;

    public WebElement getSearchSubmitButton() {
        return searchSubmitButton;
    }

    public WebElement getInputSearch() {

        return inputSearch;
    }


    public WebElement getSigninButton() {
        return signinButton;
    }
}
