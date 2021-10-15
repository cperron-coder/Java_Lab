/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. create a class that receives first and last name variables
2. combine them in a string format and return it to the user
 */
package Lab9.Q2;

public class Name {
    //creating two class variables for the first and last name
    private String firstName;
    private String lastName;
    //instantiating these variables as a default null value
    public Name(){
        firstName = null;
        lastName = null;
    }
    //accepting user input for the variables in the constructor method
    public Name(String fN, String lN){
        //instantiating the variables with values input
        this.firstName = fN;
        this.lastName = lN;
    }
    //combining the variables in a string to create a new string variable to return to the user
    public String toString(){
        String fullName = "Name: "+firstName+" "+lastName;
        //returning the string variable to the user
        return fullName;
    }
}
