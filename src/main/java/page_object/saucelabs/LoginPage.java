package page_object.saucelabs;

import org.openqa.selenium.By;
import page_object.BasePage;

public class LoginPage extends BasePage {




    public LoginPage(String browser, String urls) {
        super(browser);
        visit(urls);
    }

}
