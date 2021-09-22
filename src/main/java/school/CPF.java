package school;

public class CPF {

    private String cpfNumber;

    public CPF(String cpfNumber) {
        if (cpfNumber == null || !cpfNumber.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("CPF Invalid!");
        }
        this.cpfNumber = cpfNumber;
    }

    public String getCpfNumber() {
        return cpfNumber;
    }
}
