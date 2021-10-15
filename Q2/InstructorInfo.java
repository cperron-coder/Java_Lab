/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. Create a class that extends the name class for the instructor
2. receive the variables of name and office location
3. format these variables into a string variable which can be returned to the user
 */
package Lab9.Q2;
public class InstructorInfo extends Name {
    //creating a private class variable referencing the office number of the instructor
    private String officeNumber;
    //a constructor class calling the super of the name class
    public InstructorInfo(){
        super();
    }
    //a constructor class that receives all the variables
    public InstructorInfo (String fN,String lN, String oL){
        //passing the first and last name variables to the super class
        super(fN,lN);
        //instantiating the office location variable withing the method
        this.officeNumber = oL;
    }
    //manipulating the super.toString method and the instantiated variable to create a new string type variable
    public String toString(){
        String nameWithOffice = "\nInstructor's Info:\n"+super.toString()+"\nOffice Location: "+officeNumber;
        //returning the new string type variable to the user
        return nameWithOffice;
    }


}
