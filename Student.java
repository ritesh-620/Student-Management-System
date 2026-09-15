public class Student {
    private int studentId;
    private String name;
    private int age;
    private String course;

    public Student(int studentId, String name,int age,String course){
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public int getStudentId(){
        return studentId;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }

    
}