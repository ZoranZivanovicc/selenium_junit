package gigatron;

import enumeration.Urls;
import org.assertj.core.api.ListAssert;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page_object.gigatron.IndexPage;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestIndexPage {
    IndexPage indexPage;


    @BeforeEach
    void setup() {
        indexPage = new IndexPage("chrome", Urls.GIGATRON_INDEX_PAGE.getUrls());
    }

    @AfterEach
    void teardown() {
        indexPage.quit();
    }


    @Test
    void gigatronPageIsDisplayed() {
        assertThat(indexPage.logoIsDisplayed()).isTrue();
    }

    @Test
    void iCanSeeCookiesInfo() {
        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(indexPage.getMainTextFromCookies()).isEqualTo("Obaveštenje o kolačićima");
        softAssert.assertThat(indexPage.acceptCookiesButtonIsDisplayed()).isTrue();
        softAssert.assertThat(indexPage.getTextFromAcceptCookiesButton()).isEqualTo("Prihvatam");
        softAssert.assertAll();
    }

    @Test
    void iCanAcceptCookies() {
        indexPage.userAcceptsCookies();
        assertThat(indexPage.acceptCookiesButtonIsDisplayed()).isFalse();

    }

    @Test
    void iCanSeeListOfProducts() {
        indexPage.userAcceptsCookies();
        indexPage.openProductsMenu();
        assertThat(indexPage.listProducts()).isEqualTo("Prenosni računari, Računari i komponente, Oprema za računare, Gaming, TV, audio, video, Mobilni telefoni i oprema, Bela tehnika, Prečišćivači vazduha, Mali kućni aparati, Sve za kuću, Fotoaparati i kamere, Sport i putovanje, Lifestyle, Muzički instrumenti i oprema, Kancelarijska oprema, Igračke, dečija i školska oprema, Alati i baštenska oprema, Izdvajamo iz ponude");



    }


}
