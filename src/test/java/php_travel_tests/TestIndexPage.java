package php_travel_tests;

import enumeration.DataSet;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page_object.php_travel.IndexPage;

import static enumeration.DataSet.TEXT_FROM_LOGO;
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
        softAssert.assertThat(indexPage.textIsDisplayed()).isEqualTo(TEXT_FROM_LOGO.getDataset());
        //indexPage.excerciseWithDriver();
        softAssert.assertAll();
    }

    @Test
    void pageTitleIsCorrect() {

    }

    @Test
    void advertisingTextIsVisible() {

    }

    @Test
    void webButtonsAreEnabled() {


    }


}
