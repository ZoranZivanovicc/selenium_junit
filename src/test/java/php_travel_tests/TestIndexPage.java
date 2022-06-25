package php_travel_tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page_object.php_travel.IndexPage;

import static enumeration.DataSet.*;
import static enumeration.Urls.PHP_TRAVELS_INDEX;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestIndexPage {
    IndexPage indexPage;


    @BeforeEach
    void setup() {
        indexPage = new IndexPage("chrome", PHP_TRAVELS_INDEX.getUrls());
    }

    @AfterEach
    void teardown() {
        indexPage.quit();
    }


    @Test
    void phpTravelPageIsDisplayed() {
        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(indexPage.logoIsDisplayed()).isTrue();
        softAssert.assertThat(indexPage.logoHasAText()).isEqualTo(TEXT_FOR_LOGO.getDataset());
        softAssert.assertAll();
    }

    @Test
    void pageTitleIsCorrect() {
        assertThat(indexPage.showsTabTitle()).isEqualTo(TITLE_FOR_PHP_TRAVEL_INDEX_PAGE.getDataset());

    }

    @Test
    void advertisingTextIsVisible() {
        assertThat(indexPage.isVisibleAdvertisingTitle()).isTrue();
        assertThat(indexPage.getAdvertisingDescription()).isEqualTo(ADVERTISING_DESCRIPTION.getDataset());


    }

    @Test
    void webButtonsAreEnabled() {
        assertThat(indexPage.demoAndPricingButtonsAreEnabled()).isTrue();



    }


}
