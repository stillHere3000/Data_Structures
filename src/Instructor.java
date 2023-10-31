/*
 * The Instructor Class. 
 *      Create a new public class called Instructor that extends the Person class.
 *      Create a private string variable for the instructor’s department and a constructor that takes in the person’s id, name, and department. 
 *      (Hint: There should only be two lines of code in this constructor). 
 *      Implement the appropriate set and get methods. 
 *      Override the toString method to display something like Instructor[id=3456, name=Jamie Remstone, department=Computer Science]
 */

public class Instructor extends Person{
    private String department;
    
    public Instructor(int id, String name, String department){
        super(id, name);
        this.department = department;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setDepartment(String newDepartment){
        this.department = newDepartment;
    }

    @Override
    public String toString(){
        return "Instructor[id=" + this.getId() + ", name=" + this.getName() + ", department=" + this.department + "]";
    }

   

}
