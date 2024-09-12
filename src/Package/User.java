package Package;

public class User<T extends User> implements Comparable<T>{
    protected int id;
    protected String surname;
    protected String name;
    protected String patronymic;
    protected int age;

    public User(int id, String surname, String name, String patronymic, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(T user) {
        if (user.id > this.id) {
            return -1;
        } else if (user.id < this.id) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Уникальный идентификатор пользователя: " + id +
                "\nФамилия: " + surname +
                "\nИмя: " + name +
                "\nОтчество: " + patronymic +
                "\nВозраст: " + age +
                "\n";
    }
}
