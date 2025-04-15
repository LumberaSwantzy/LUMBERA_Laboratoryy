public class Staff extends Person { //staff class inherits from person
    private String department; // attribute specific to staff

    //constructor
    public Staff(String name, int id, String department){
        super(name, id);
        this.department = department;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
