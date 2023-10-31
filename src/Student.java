/*
 * The Student Class. 
 *  Create a new public class called Student that extends the Person class.
 *      Create a private double variable for the student’s average (this should be initialized to zero)
 *      and a constructor that takes in the person’s id and name. (Hint: The only line in this constructor should be a super call). 
 *      Implement the appropriate set and get methods. Override the toString
 *      method to display something like Student[id=2345, name=Anna Templeton, GPA=78.85%]
 */

public class Student extends Person {

    private double gpa;
    private double grade;
    private double average;

    public Student(int id, String name) {
        super(id, name);
        gpa = 0.0; grade = 0.0;
    }
    
    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double newGpa) {
        this.gpa = newGpa;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double newGrade) {
        this.grade = newGrade;
    }

    public double getAverage() {
        return this.average;
    }

    public void setAverage(double newAverage) {
        this.average = newAverage;
    }

    @Override
    public String toString() {
        return "Student[id=" + this.getId() 
                + ", name=" + this.getName() 
                + ", gpa=" + this.gpa 
                +", average= "+this.average+ "]";
    }

}
