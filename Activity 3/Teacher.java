public class Teacher extends Person { //teacher class inherits from person
    private String subject; //attribute specific for teacher

    //constructor
    public Teacher (String name, int id, String subject){
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
    
}
