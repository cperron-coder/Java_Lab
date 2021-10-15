/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. Instantiate complex numbers into the class
2. using the extends method pull information from the polar complex number class to convert values to polar form
3. multiply the polar complex numbers and divide them using respective methods within the class
4. create a toString method which formats the polar complex number in a string form
 */

package Lab9.Q1;
import Lab9.Lab7.*;
//extending the class from PolarComplexNum so that the values can be multiplied and divided
public class ComplexMultiDivideClass extends PolarComplexNum {
    //creating a counter value to track the number of objects instantiated within the class
    public static int polarCounter;
    //creating a constructor class to call the super method and add to the counter variable
    public ComplexMultiDivideClass(){
        super();
        polarCounter++;
    }
    //constructor for the class that instantiates the input variables in the super class and increments the counter
    public ComplexMultiDivideClass(double magnitude, double angle){
        //passing input variables to super class
        super(magnitude, angle);
        polarCounter++;
    }
    //a simple get method to return the polar counter variable to the user
    public static int getPolarCounter() {
        return polarCounter;
    }
    //A method to multiply two polar complex numbers together by multiplying the magnitudes and adding the angles
    public static ComplexMultiDivideClass multiply(ComplexMultiDivideClass a, ComplexMultiDivideClass b){
        //returning the newly multiplied complex number
        return new ComplexMultiDivideClass((a.getMagnitude()*b.getMagnitude()), (a.getAngle()+b.getAngle()));
    }
    //a method to divide complex numbers by dividing the magnitudes and subtracting the angles
    public static ComplexMultiDivideClass divide(ComplexMultiDivideClass a, ComplexMultiDivideClass b){
        //returning the newly divided complex number
        return new ComplexMultiDivideClass((a.getMagnitude()/b.getMagnitude()), (a.getAngle()-b.getAngle()));
    }
    // toString method which takes the newly created polar complex number and formats it in a string to return
    public String toString(){
            return String.format("Magnitude: %.2f, Angle: %.2f degrees", getMagnitude(), getAngle());
    }
}

