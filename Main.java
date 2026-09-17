
import java.util.Scanner;

public class Main {
   public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
   
    StudentService studentService = new StudentService();

    while (true) { 
        System.out.println("\n==== Student Management System =====");
        System.out.println("1. Add student");
        System.out.println("2. view Student");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student Course");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");

        int choice = sc.nextInt();
         switch (choice) {
            case 1:
                System.out.println("Enter Student ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.println("Enter Name: ");
                String name = sc.nextLine();

                System.out.println("Enter Age: ");
                int age = sc.nextInt();

                sc.nextLine();

                System.out.println("Enter Course: ");
                String course = sc.nextLine();
                
                Student student = new Student(id,name,age,course);
                studentService.addStudent(student);
                
                System.out.println("Student Added Successfully! ");

                break;

            case 2: 
               studentService.viewStudents();
               break;

            case 3:
               System.out.println("Enter student Id: ");
               int studentid = sc.nextInt();
               studentService.searchStudentById(studentid);
               break;

            case 4:
               System.out.println("Enter student Id: ");
               int studentId = sc.nextInt();

               sc.nextLine();

               System.out.println("Enter New Course: ");
               String newCourse = sc.nextLine();

               studentService.updateStudentCourseById(studentId, newCourse);
               break;

            case 5: 
               System.out.println("Enter Student Id: "); 
               int studentIdDelete = sc.nextInt();
               studentService.deleteStudentById(studentIdDelete); 
               break;

            case 6:
               System.out.println("Exiting...");
               sc.close();
               return;

            default:
               System.out.println("Invalid Choice");
         }
      }
   }
}