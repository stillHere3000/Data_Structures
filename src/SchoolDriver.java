/**
Author: Trevor Maliro
Student ID: 239498690
Lab 1
Any and all work in this file is my own.
*/

/*
 * (a) Creates 7 students with different id numbers and names. One of these students must
have your name on it - the rest can be random. Print each one to the console.
(b) Set the student’s averages to any values you like (range from 0-100). Use a variety of
values and print the students to the console again. If you’d like to use random numbers,
you can use this code to get a random number between 0 and 100:
Math.random() * 101. Note: we don’t cast to int here because average is a double value.
(c) Creates an instructor with a different id and name to the students. Print it to the
console.
(d) Create two courses with any code and names you wish - be creative!
(e) Assign the instructor to both courses. Print the courses to the console.
(f) Assign 5 of the 7 students to the first course and the other 2 to the second. Print the
courses after you are done.
(g) Assign all students grades. Print all the students to the console.
(h) Unenroll two students (your choice) from the first course. Print the course to the
console.

 */

public class SchoolDriver {
    public static void main(String[] args) throws Exception {
        driver();
    }

    public static void driver(){
        Course course1 = new Course("MARVEL VILLIAN TRAINING 2265", "MRVL2265");
        Course course2 = new Course("MARVEL HERO TRAINING 2266", "MRVL2266");
        Instructor instructor = new Instructor(0-makeRandomID(), "Stan Lee", "Marvel Universe");
        Instructor instructor2 = new Instructor(0-makeRandomID(), "Nick Fury", "Marvel Universe");
        course1.setInstructor(instructor);      course2.setInstructor(instructor2);
        for (int i = 0; i < 7; i++) {
            Student badStudent = new Student(makeRandomID(), getMarvelBadStudentName(i));
            Student goodStudent = new Student(makeRandomID(), getMarvelGoodStudentName(i));
            setStudentAverages(badStudent);        setStudentAverages(goodStudent);
            course1.enroll(badStudent);        course2.enroll(goodStudent);
            System.out.println(badStudent);        System.out.println(goodStudent);
        }
        System.out.println(course1);        System.out.println(course2);
    }

    public static int makeRandomID(){
        return (int) (Math.random() * 101);        
    }

    public static void setStudentAverages(Student student){
        student.setAverage(Math.random() * 101);
    }

    public static String getMarvelBadStudentName(int i){
        String s="";
        switch(i){
            case 0:     s="Thanos";    break;
            case 1:     s="Loki";      break;
            case 2:     s="Ultron";    break;
            case 3:     s="Red Skull"; break;
            case 4:     s="Ronan";     break;
            case 5:     s="Hela";      break;
            case 6:     s="Killmonger"; break;
        }
        return s;
    }

    public static String getMarvelGoodStudentName(int i){
        String s="";
        switch(i){
            case 0: s="IronMan"; break;
            case 1: s="Captain America"; break;
            case 2: s="Thor"; break;
            case 3: s="Hulk"; break;
            case 4: s="Black Widow"; break;
            case 5: s="Hawkeye"; break;
            case 6: s="Black Panther"; break;            
        }
        return s;
    }


}
