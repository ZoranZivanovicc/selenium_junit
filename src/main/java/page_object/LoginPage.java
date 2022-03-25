package page_object;

import enumeration.Urls;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    By usernameInput = By.id("ap_email");
    By passwordInput = By.id("ap_password");
    By continueButton = By.id("continue");
    By submitButton = By.id("signInSubmit");
    By successBox = By.id("glow-ingress-block");
    By textForWrongCredential = By.className("a-alert-heading");

    public LoginPage(String browser, int timeoutSec) {
        this(browser);
        setTimeoutSec(timeoutSec);
    }

    public LoginPage(String browser) {
        super(browser);
        visit(Urls.AM_SIGNIN.getUrls());
    }

    public void with(String username, String password) {
        type(usernameInput, username);
        click(continueButton);
        type(passwordInput, password);
        click(submitButton);

    }
    public void withWrongUserName(String username) {
        type(usernameInput, username);
        click(continueButton);
    }

    public boolean successBoxPresent() {
        return isDisplayed(successBox);
    }
    public String getTexForWrongUser(){
        return getText(textForWrongCredential);

    }
}
