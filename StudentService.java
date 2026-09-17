import java.util.ArrayList;
import java.util.List;

public class StudentService {
 
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        for(Student s: students){
           if(s.getStudentId() == student.getStudentId()){ 
              System.out.println("Studetn Id already exists! ");
              return ; 
           }
        }
        students.add(student);

    }
    public void viewStudents(){
        if(students.isEmpty()){
            System.out.println("No Student Found! ");
            return ;
        }
        for(Student student : students) {
            System.out.println(student);
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
    public void updateStudentCourseById(int studentId, String newCourse){
        for(Student student : students){
            if(student.getStudentId() == studentId){
               student.setCourse(newCourse);
               System.out.println("Course updated successfully! ");
            }
        }
    }
    public void deleteStudentById(int studentIdDelete){
        for(Student student: students){
            if(student.getStudentId() == studentIdDelete){
              students.remove(student);
              System.out.println("Student Removed Successfully! ");
              return;
            }        
        }
    }
}