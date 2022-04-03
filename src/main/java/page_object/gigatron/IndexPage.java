package page_object.gigatron;

import org.openqa.selenium.By;
import page_object.BasePage;

import java.util.List;

public class IndexPage extends BasePage {
    By headerLogo = By.id("logi-img");
    By cookiesHeading = By.xpath("//h3[.='Obaveštenje o kolačićima']");
    By btnAccepCookies = By.cssSelector(".primary");
    By btnProducts = By.cssSelector(".megabtn");
    By productsList = By.cssSelector(" li[id^='main-nav']");



    public IndexPage(String browser, String urls) {
        super(browser);
        visit(urls);
    }

    public boolean logoIsDisplayed() {
        return isDisplayed(headerLogo);
    }
    public boolean acceptCookiesButtonIsDisplayed() {
        return isDisplayed(btnAccepCookies);
    }

    public String getMainTextFromCookies(){
        return getText(cookiesHeading);
    }

    public String getTextFromAcceptCookiesButton() {
        return getText(btnAccepCookies);
    }

    public void userAcceptsCookies() {
        click(btnAccepCookies);
    }
    public void openProductsMenu(){
        click(btnProducts);

    }

    public String listProducts(){
        System.out.println("List of product is:" + textValues(productsList));
        return textValues(productsList).toString().replace("[","").replace("]","");
    }
}
