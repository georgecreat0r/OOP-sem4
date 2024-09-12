package Teacher;

import Package.*;

public class Teacher extends User{

    private String subject;

    public Teacher(int id, String surname, String name, String patronymic, int age) {
        super(id, surname, name, patronymic, age);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Уникальный идентификатор учителя: " + id +
                "\nФамилия: " + surname +
                "\nИмя: " + name +
                "\nОтчество: " + patronymic +
                "\nВозраст: " + age +
                "\nПредмет: " + subject +
                "\n";
    }
}
