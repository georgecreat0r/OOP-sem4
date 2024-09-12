package Package;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int res = o1.getSurname().compareTo(o2.getSurname());
        if (res == 0) {
            res = o1.getName().compareTo(o2.getName());
            if (res == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return res;
            }
        } else {
            return res;
        }
    }
}
