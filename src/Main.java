import Package.*;
import Teacher.Teacher;
import Teacher.TeacherController;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Экземпляр для контроллера.
        TeacherController tc = new TeacherController();

        // Инициализация учителей.
        Teacher t1 = tc.create(001, "Петрова", "Евгения", "Леонидовна", 46);
        t1.setSubject("Математика");
        Teacher t2 = tc.create(005, "Иванова", "Лариса", "Васильевна", 44);
        t2.setSubject("История");
        Teacher t3 = tc.create(002, "Попова", "Александра", "Борисовна", 51);
        t3.setSubject("Биология");
        Teacher t4 = tc.create(004, "Волкова", "Марина", "Михайловна", 39);
        t4.setSubject("ОБЖ");
        Teacher t5 = tc.create(003, "Александрова", "Наталья", "Алексеевна", 70);
        t5.setSubject("Химия");

        // Заполнение списка учителями.
        tc.add(t1);
        tc.add(t2);
        tc.add(t3);
        tc.add(t4);
        tc.add(t5);

        System.out.println("----Изначальный список----");
        tc.printTeachers();
        System.out.println("\n----Отсортировано по id----");
        tc.sortById();
        System.out.println("\n----Отсортировано по имени----");
        tc.sortByName();
        System.out.println("\n----Удалено по имени----");
        tc.remove("Волкова", "Марина", "Михайловна");
        tc.printTeachers();

        System.out.println("----Редактирование учителя----\n" +
                "С Петорова на Жирова\n");
        t1.setSurname("Жирова");
        System.out.println(t1);
    }
}
