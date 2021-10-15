/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. create a class which receives course and instructor info (name, office location, course name)
2. create a method to combine these variables into a string type variable and return it to the user
 */
package Lab9.Q2;
//extending the class from the instructor info class
public class CourseAndInstructor extends InstructorInfo{
    //creating private type variable for the class
    private String courseName;
    //calling the super class
    public CourseAndInstructor(){
        super();
    }
    //creating a constructor class which takes the arguments listed
    public CourseAndInstructor(String cN, String fN, String lN, String oL){
        //passing the last three variables to the super class
        super(fN,lN,oL);
        //instantiating a course name variable to be returned
        this.courseName = cN;
    }
    public String toString(){
        //using toString call from super and new variable, creating a string to return to the user
       String string = "Course Name: "+courseName+super.toString();
        return string;
    }
}
