package page_object;

import org.openqa.selenium.By;

public class OrdersPage extends BasePage {
    String param;
    By usernameInput = By.id("user-name");
    By passwordInput = By.id("password");
    By submitButton = By.id("login-button");
    By headerLogo = By.cssSelector(".app_logo");



    public OrdersPage(String browser, String urls) {
        super(browser);
        visit(urls);
    }

    public void with(String username, String password) {
        type(usernameInput, username);
        type(passwordInput, password);
        click(submitButton);

    }



    public String getErrorMessage(String orderName) {
        By orderTitle = By.xpath("//div[.='"+orderName+"']");
        return getText(orderTitle);

    }
}
