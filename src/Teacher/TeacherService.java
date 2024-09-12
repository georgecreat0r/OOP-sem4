package Teacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Package.*;

public class TeacherService {

    private List<Teacher> list = new ArrayList<>();

    protected void create(int id, String surname, String name, String patronymic, int age) {
        list.add(new Teacher(id, surname, name, patronymic, age));
    }

    protected List<Teacher> sortById() {
        List<Teacher> res = new ArrayList<>(list);
        res.sort(Teacher::compareTo);
        return res;
    }

    protected List<Teacher> sortByName() {
        List<Teacher> res = new ArrayList<>(list);
        res.sort(new UserComparator<Teacher>());
        return res;
    }

    protected void remove(String surname, String name, String patronymic) {
        Iterator<Teacher> iterator = list.iterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            if (teacher.getSurname().equals(surname) && teacher.getName().equals(name) && teacher.getPatronymic().equals(patronymic)) {
                iterator.remove();
            }
        }
    }

    public List<Teacher> getList() {
        return list;
    }
}
