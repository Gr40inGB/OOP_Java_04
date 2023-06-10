package main.java.ru.gb.oseminar.data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User implements Comparable<Teacher> {

    static Long idGenerator = 0l;
    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = idGenerator++;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public int compareTo(Teacher o) {
        return Long.compare(this.teacherId, o.getTeacherId());
    }

    @Override
    public String toString() {
        return "Teacher " + teacherId + " " + super.toString();
    }
//    public static class TeacherComparator implements Comparator {
//        @Override
//        public int compare(Object o1, Object o2) {
//            return compare((Teacher) o1, (Teacher)o2);
//        }
//    }
}
