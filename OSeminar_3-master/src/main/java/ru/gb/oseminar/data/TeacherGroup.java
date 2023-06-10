package main.java.ru.gb.oseminar.data;

import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {
    List<Teacher> teacherList;

    public TeacherGroup(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teacherList=" + teacherList +
                '}';
    }


    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }
}
