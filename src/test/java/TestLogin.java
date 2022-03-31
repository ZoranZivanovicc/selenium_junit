import enumeration.Users;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page_object.LoginPage;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestLogin {
 LoginPage login;

    @BeforeEach
    void setup() {
        login = new LoginPage("chrome");
    }

    @AfterEach
    void teardown() {
        login.quit();
    }

    @Test
    void testLoginSuccess() {
        login.with(Users.ZORAN.getUserName(), Users.ZORAN.getPassword());
        assertThat(login.successBoxPresent()).isTrue();
    }

    @Test
    void testLoginFailure() {
        login.withWrongUserName("bad-user");
        assertThat(login.getTexForWrongUser()).isEqualTo("There was a problem");
    }
}
