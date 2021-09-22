package school;

public class StudentFactory {

    private Student student;

    public StudentFactory withNameCpfEmail(String name, String cpf, String email) {
        this.student = new Student(new CPF(cpf), name, new Email(email));
        return this;
    }

    public StudentFactory withPhone(String ddd, String phoneNumber) {
        this.student.addPhone(ddd, phoneNumber);
        return this;
    }

    public Student create() {
        return this.student;
    }
}
