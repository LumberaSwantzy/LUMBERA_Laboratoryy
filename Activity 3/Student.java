public class Student extends Person { //student class inherits from person
    private String gradeLevel; //additional attributes

    //constructor
    public Student (String name, int id, String gradeLevel) {
        super(name, id); // call to person's constructor
        this.gradeLevel = gradeLevel;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Grade Level: " + gradeLevel);
    }

}
