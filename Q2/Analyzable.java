/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. create an interface that instantiates a grade activity type variable
 */
package Lab9.Q2;
//creating an interface for the course grades class
public interface Analyzable {
    //a get expected score method to instantiate a new grade activity type variable
    public static GradeActivity getExpectedScore(){
        GradeActivity GA = new GradeActivity();
        //returning the new grade activity type variable
        return GA;
    }
}
