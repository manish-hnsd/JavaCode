import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"manish","CSE"));
        students.add(new Student(2,"manoj","IT"));
        return students;
    }
    public void printStudent(){
        getStudents().forEach(System.out::println);
    }
}
