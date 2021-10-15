/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. create methods which instantiate a polar complex number
2. create a method to return the rectangular form from polar form
3. create a method which prints the polar form of a polar complex number
 */
package Lab9.Lab7;

public class PolarComplexNum {
    //Creating private variables magnitude and angle for the class
    private double magnitude;
    private double angle;
    //Creating a base method which instantiates the variables as zero
    public PolarComplexNum(){
        magnitude=0;
        angle=0;
    }
    //Creating a method which takes arguments for the variables magnitude and angle and instantiates them
    public PolarComplexNum(double mag,double ang){
        this.magnitude=mag;
        this.angle=ang;
    }
    //created methods to get both angle and magnitude respectively
    public double getAngle() {
        return angle;
    }
    public double getMagnitude() {
        return magnitude;
    }
    //Creating a method which calculates the rectangular form from polar form
    public RecComplexNum getRecFromPolar(){
        //calculating real value with the magnitude and the previously created myCos method
        double real = magnitude*MyMethod.myCos(Math.toRadians(angle));
        //calculating real value with the magnitude and the previously created mySin method
        double imaginary = magnitude*MyMethod.mySin(Math.toRadians(angle));
        //Creating a new RecComplexNum type variable with the attributes of real and imaginary that were calculated
        RecComplexNum rec = new RecComplexNum(real,imaginary);
        //returning the new variable
        return rec;
    }
    //A method which displays the polar form of a polar number using a printf statement
    public void displayPolarForm(){
        System.out.printf(" Magnitude: %.2f, Angle: %.2f.\n",magnitude,angle);
    }

}
