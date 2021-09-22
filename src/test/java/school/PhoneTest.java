package school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneTest {

    @Test
    void shouldNotCreatePhoneWithDDDsInvalids() {
        assertThrows(IllegalArgumentException.class,
                () -> new Phone(null, "1232132"));

        assertThrows(IllegalArgumentException.class,
                () -> new Phone("", "1232132"));

        assertThrows(IllegalArgumentException.class,
                () -> new Phone("1", "1232132"));

        assertThrows(IllegalArgumentException.class,
                () -> new Phone("123", "1232132"));
    }

    @Test
    void shouldNotCreatePhoneNumberWithInvalidNumbers() {
        assertThrows(IllegalArgumentException.class,
                () -> new Phone("11", "1232132"));

        assertThrows(IllegalArgumentException.class,
                () -> new Phone("11", null));
    }

    @Test
    void shouldBeCreatePhoneValid() {
        String ddd = "11";
        String number = "969276455";
        Phone phone = new Phone(ddd, number);
        assertEquals(ddd, phone.getDdd());
        assertEquals(number, phone.getNumber());
    }
}
