import java.util.ArrayList;
import java.util.List;

public class StudentService {
 
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);

    }
    public void viewStudents(){
        for(Student student : students) {
            System.out.println(student.getStudentId());
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getCourse());
        }
    }
}