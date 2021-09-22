package school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {

    @Test
    void shouldNotCreateAnEmailWithAddressInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailIncorrect"));

    }

    @Test
    void shouldCreateAnEmail() {
        Email emailValid = new Email("email_valid@test.com");

        assertEquals(emailValid.getEmailAddress(), "email_valid@test.com");
    }
}
