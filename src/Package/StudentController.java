package Package;

import java.util.ArrayList;
import java.util.List;

public class StudentController implements UserController<Student> {

    private GroupService gs = new GroupService();

    private StreamService ss = new StreamService();

    private StudentView sv = new StudentView();

    // Список потоков.
    List<GroupStream> list = new ArrayList<>();

    // Инициализация потока.
    public GroupStream initStream(int i) {
        return ss.initStream(i);
    }

    // Добавление потока в список.
    public void addStream(GroupStream groupStream) {
        list.add(groupStream);
    }

    // Возвращает список потоков.
    public List<GroupStream> getStreamList() {
        return list;
    }

    // Сортировка списка потоков.
    public List<GroupStream> sortStreamList(List<GroupStream> list) {
        return ss.sortStreamList(list);
    }

    public void removeStudent(String surname, String name, String patronymic, Group group) {
        gs.removeStudent(surname, name, patronymic, group);
    }

    public List<Student> sortById(Group group) {
        List<Student> list = gs.sortById(group);
        sv.sendOnConsole(list);
        return list;
    }

    public List<Student> sortByName(Group group) {
        List<Student> list = gs.sortByName(group);
        sv.sendOnConsole(list);
        return list;
    }

    @Override
    public Student create(int id, String surname, String name, String patronymic, int age) {
        return gs.createStudent(id, surname, name, patronymic, age);
    }

}
