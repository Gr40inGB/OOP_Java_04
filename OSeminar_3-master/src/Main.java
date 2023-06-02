import main.java.ru.gb.oseminar.data.Student;
import main.java.ru.gb.oseminar.data.StudentGroup;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentGroup students = new StudentGroup(List.of(new Student("String firstName",
                "String secondName",
                "String patronymic", LocalDate.now()),new Student("String firstName2",
                "String secondName",
                "String patronymic", LocalDate.now()),new Student("String firstName3",
                "String secondName",
                "String patronymic", LocalDate.now())));
     Iterator<Student> studentIterator = students.iterator();
     while (studentIterator.hasNext()){
         System.out.println(studentIterator.next().toString());
     }


    }
}
