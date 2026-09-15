public class Main {
   public static void main(String[] args){
   
    StudentService studentService = new StudentService();

    Student s1 = new Student(101,"Ritesh",22,"CSE");
    studentService.addStudent(s1);
    studentService.viewStudents();
   }
}