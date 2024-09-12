package Teacher;

import Package.*;

import java.util.List;

public class TeacherController implements UserController<Teacher> {

    TeacherService ts = new TeacherService();
    TeacherView tv = new TeacherView();

    @Override
    public Teacher create(int id, String surname, String name, String patronymic, int age) {
        return new Teacher(id, surname, name, patronymic, age);
    }

    public void add(Teacher teacher) {
        ts.getList().add(teacher);
    }

    public List<Teacher> sortById() {
        List<Teacher> list = ts.sortById();
        tv.sendOnConsole(list);
        return list;
    }

    public List<Teacher> sortByName() {
        List<Teacher> list = ts.sortByName();
        tv.sendOnConsole(list);
        return list;
    }

    public void remove(String surname, String name, String patronymic) {
        ts.remove(surname, name, patronymic);
    }

    public void printTeachers() {
        tv.sendOnConsole(ts.getList());
    }

}
