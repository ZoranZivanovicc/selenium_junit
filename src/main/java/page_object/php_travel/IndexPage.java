package page_object.php_travel;

import org.openqa.selenium.By;
import page_object.BasePage;

public class IndexPage extends BasePage {


    public IndexPage(String browser, String urls) {
        super(browser);
        visit(urls);
    }


    public void excerciseWithDriver() {
        System.out.println("getPageSource() method displays complete source from web page: " + getDriver().getPageSource());
        System.out.println("getCurrentUrl() method displays current url from browser:" + getDriver().getCurrentUrl());
        System.out.println("getWindowHandle() method displays current window id" + getDriver().getWindowHandle());

    }
}
