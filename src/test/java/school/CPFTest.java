package school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CPFTest {
    @Test
    void shouldNotCreateCPFInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("123a12321"));

    }


    @Test
    void shouldCreateCPF() {
        String cpfNumber = "369.718.288-94";

        CPF cpf = new CPF(cpfNumber);
        assertEquals(cpfNumber, cpf.getCpfNumber());
    }
}
