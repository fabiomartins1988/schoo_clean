package school;

public class Phone {

    private String ddd;
    private String number;

    public Phone(String ddd, String number) {
        if (ddd == null || number == null) {
            throw new IllegalArgumentException("DDD and Number is mandatory");
        }
        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD invalid!");
        }

        if (!number.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Number invalid!");
        }
        this.ddd = ddd;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getDdd() {
        return ddd;
    }
}
