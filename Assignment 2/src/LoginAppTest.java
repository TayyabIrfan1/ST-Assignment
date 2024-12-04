import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LoginAppTest {


    @Test
    void ValidEmail_ValidPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("janesmith@example.com","password456");
        assertEquals("Jane Smith", result);
    }

    @Test
    void InvalidEmail_InvalidPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("ehtasham@example.com","password");
        assertNull(result);
    }


    @Test
    void InvalidEmail_ValidPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("ehtasham@example.com","password456");
        assertNull(result);
    }




    @Test
    void EmptyEmailPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("","");
        assertNull(result);
    }
    @Test
    void ValidEmail_InvalidPassword() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("janesmith@example.com","password123");
        assertNull(result);
    }
}

