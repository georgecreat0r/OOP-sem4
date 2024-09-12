package Package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group implements Iterable<Student>{

    private int num;
    private int groupSize;
    private int startYear;

    private List<Student> students = new ArrayList<>();

    public Group(int num, int startYear) {
        this.num = num;
        this.groupSize = 0;
        this.startYear = startYear;
    }

    public void add(Student student) {
        students.add(student);
    }

    protected void createStudent(int id, String surname, String name, String patronymic, int age) {
        students.add(new Student(id, surname, name, patronymic, age));
        this.groupSize++;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new GroupIterator(this);
    }

    @Override
    public String toString() {
        return "Группа № " + num +
                "\nКоличество учащихся: " + groupSize +
                "\nДата создания: " + startYear +
                "\n";
    }

    public void printStudents() {
        System.out.println("Учащиеся группы №" + num + "\n");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
