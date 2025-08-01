package assignments.jully31;

import java.util.Comparator;

public class MarkComparator implements Comparator<Student2> {

    @Override
    public int compare(Student2 std1, Student2 std2) {

        return Integer.compare(std2.getMarks(),std1.getMarks());
    }
}
