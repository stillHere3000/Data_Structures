/*
 * The Course Class. Create a new public class called Course that contains
 *      a private final integercalled MAX_ENROLLED_STUDENTS and set it equal to 5. 
 *      The class should also have a private array variable to hold the students in the course, 
 *      an enrollment variable (of type int) to hold how many students are currently enrolled in the course, 
 *      a variable of type Instructor to hold the course’s instructor 
 *      and two string values to hold its course code and the name of the course.
 *      Add a constructor that receives two strings: one for the code and one for the name. 
 *      Set the class variables and initialize the array variable. 
 *      Add an enroll(Student student) method to add a student to the course, 
 *      making sure to check that the student can be enrolled first. 
 *      Add the unenroll(Student student) method to remove the student from the course, 
 *          checking if (a) there are students in the course, and 
 *          (b) the student being removed is actually in the course. 
 *      Add the assignGrade(Student student, double grade) method to assign the student a grade in the course
 *          and change their average according to the formula (average + grade) / 2. 
 *      Add any other appropriate set and get methods, keeping in mind the principle of information hiding, and 
 *      whatwe do or don’t want our users to access or change. Finally, add a toString method to print 
 *      something like Course[code=COSC1234, name=COSC course 1, instructor=Jamie Remstone,enrolled=2]
 */

 import java.util.ArrayList;



public class Course {
    private final int MAX_ENROLLED_STUDENTS = 5;
    private int numEnrolledStudents;
    private Instructor instructor;
    private ArrayList<Student> students= new ArrayList<Student>();
    private String courseName;
    private String courseCode;
    


    public Course(String cName, String cCode) {
        //this.instructor = new instructor;
        this.courseName = cName;
        this.courseCode = cCode;
        numEnrolledStudents = 0;
    }

    public int getNumEnrolledStudents() {
        return this.numEnrolledStudents;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getCourseCode() {
        return this.courseCode;
    }
    

    public void setInstructor(Instructor newInstructor) {
        this.instructor = newInstructor;
    }
    

    public void setCourseName(String newCourseName) {
        this.courseName = newCourseName;  
    }

    public void setCourseCode(String newCourseCode) {
        this.courseCode = newCourseCode;
    }

    public boolean isEnrolled(Student s) {
        if(this.students == null){
            return false;
        }

        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).equals(s)) {
                return true;
            }
        }
        return false;
    }

    public void assignGrade(Student s, double grade) {
        for (int i = 0; i < this.numEnrolledStudents; i++) {
            if (this.students.get(i).equals(s)) {
                this.students.get(i).setGpa(grade);
            }
        }
    }



    public void enroll(Student s){
        if (this.numEnrolledStudents < MAX_ENROLLED_STUDENTS && !isEnrolled(s)){
            this.students.add(s);  
            numEnrolledStudents++;          
        }
    }

    public void unenroll(Student s){
        for (int i = 0; i < this.numEnrolledStudents; i++){
            if (this.students.get(i).equals(s) && isEnrolled(s)){
                this.students.remove(s); 
                numEnrolledStudents--;               
            }
        }
    }

    

    @Override
    public String toString() {
        return "Course[courseName=" + this.courseName + ", courseCode=" + this.courseCode + ", numEnrolledStudents=" + this.numEnrolledStudents + ", instructor=" + this.instructor + ", students=" + this.students + "]";
    }


    
}
