/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. create a class that extends the name class
2. accept the student number and course info
3. return all of the information in a formatted string
 */
package Lab9.Q2;
//extending this class off of the Name class
public class StudentInfo extends Name{
    //creating two class variables for student number and course info of the student
    private int studentNumber;
    private CourseAndInstructor courseInfo;
    //calling the super class in the constructor method
    public StudentInfo(){
        super();
    }
    //a constructor method which accepts all of the user input variables
    public StudentInfo(String fN,String lN, int sN, CourseAndInstructor cInfo){
        //passing the first and last name to the super class
        super(fN,lN);
        //instantiating the course info and the student number as the local variables
        this.courseInfo = cInfo;
        this.studentNumber = sN;
    }
    //using the super.toString method and the local variables, formatting a string to return to the user
    public String toString(){
        String string = "Student Info:\n"+super.toString()+"\nStudent Number:  "+studentNumber+"\n"+courseInfo;
        return string;
    }
}
