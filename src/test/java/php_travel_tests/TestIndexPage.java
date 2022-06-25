package php_travel_tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page_object.php_travel.IndexPage;

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
       // assertThat(indexPage.logoIsDisplayed()).isTrue();
        indexPage.excerciseWithDriver();
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
