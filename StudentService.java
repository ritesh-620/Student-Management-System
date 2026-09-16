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
    public void searchStudentById(int studentId){
        for(Student student : students){
            if(student.getStudentId() == studentId){
               System.out.println("ID: " + student.getStudentId() );
               System.out.println("Name: " + student.getName());
               System.out.println("Age: " + student.getAge());
               System.out.println("Course: " + student.getCourse());

               return;
            }
        }
        System.out.println("Student not found! ");
    }
}