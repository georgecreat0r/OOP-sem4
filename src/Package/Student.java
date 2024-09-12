package Package;

public class Student extends User {

    public Student(int id, String surname, String name, String patronymic, int age) {
        super(id, surname, name, patronymic, age);
    }




    @Override
    public String toString() {
        return "Уникальный идентификатор студента: " + id +
                "\nФамилия: " + surname +
                "\nИмя: " + name +
                "\nОтчество: " + patronymic +
                "\nВозраст: " + age +
                "\n";
    }
}
