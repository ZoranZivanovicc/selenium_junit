package page_object.php_travel;

import org.openqa.selenium.By;
import page_object.BasePage;

public class IndexPage extends BasePage {

    By headersLogo = By.id("icon");
    By headersTitle = By.id("PHPTRAVELS");
    By headersSubtitle = By.id("TRAVEL_TECHNOLOGY_PARTNER");
    By ADVERTISING_TITLE = By.xpath("//h1[normalize-space(text='System you need!')]");
    By ADVERTISING_DESCRIPTION = By.xpath("//p[position()=2]");
    By BTN_DEMO = By.xpath("//a[.='Overview Demo']");
    By BTN_PRICING = By.linkText("Pricing");





    public IndexPage(String browser, String urls) {
        super(browser);
        visit(urls);
    }


    public void excerciseWithDriver() {
        System.out.println("getPageSource() method displays complete source from web page: " + getDriver().getPageSource());
        System.out.println("getCurrentUrl() method displays current url from browser:" + getDriver().getCurrentUrl());
        System.out.println("getWindowHandle() method displays current window id" + getDriver().getWindowHandle());

    }

    public boolean logoIsDisplayed() {
        return isDisplayed(headersLogo);
    }


    public String logoHasAText() {
        String logoText = getText(headersTitle) + " " + getText(headersSubtitle);
        return logoText;
    }

    public String showsTabTitle() {
       return getDriver().getTitle();
    }

    public Boolean isVisibleAdvertisingTitle() {
        return isDisplayed(ADVERTISING_TITLE);
    }


    public String getAdvertisingDescription() {
        return getText(ADVERTISING_DESCRIPTION);
    }

    public boolean demoAndPricingButtonsAreEnabled() {
        boolean demoButtonIsEnabled = isEnabled(BTN_DEMO);
        boolean pricingButtonIsEnabled = isEnabled(BTN_PRICING);
        if((demoButtonIsEnabled && pricingButtonIsEnabled)){
            return true;
        }
        else {
            return false;
        }
    }
}
