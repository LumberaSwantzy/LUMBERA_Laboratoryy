import java.util.*;
public class Person {
    //private attributes common to all people
    private String name;
    private int id;
        
    // constructor
    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    //getter method
    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println ("ID: " + id);
    }
}

class SchoolTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Input for Students
        System.out.println("Enter Student Details: ");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.println("ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Grade Level: ");
        String gradeLevel = scanner.nextLine();

        // Input for Teacher
        System.out.println("Enter Teacher Details: ");
        System.out.print("Name: ");
        String teacherName = scanner.nextLine();
        System.out.println("ID: ");
        int teacherId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Subject: ");
        String subject = scanner.nextLine();

        // Input for Staff
        System.out.println("Enter Staff Details: ");
        System.out.print("Name: ");
        String staffName = scanner.nextLine();
        System.out.println("ID: ");
        int staffId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Department: ");
        String department = scanner.nextLine();

        Student student = new Student(studentName, studentId,  gradeLevel);
        Teacher teacher = new Teacher(teacherName, teacherId,  subject);
        Staff staff = new Staff(staffName, staffId,  department);

        //Display Info
        System.out.println("\nStudent Information");
        student.displayInfo();

        System.out.println("\nTeacher Information");
        teacher.displayInfo();

        System.out.println("\nStaff Information");
        staff.displayInfo();

        scanner.close();
    }
    
}
