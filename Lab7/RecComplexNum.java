/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. create methods which instantiate a rectangular complex number
2. create a method to return the polar form from rectangular form
3. create a method which prints the rectangular form of a rectangular complex number
 */
package Lab9.Lab7;

public class RecComplexNum {
    //Instantiating private variables real and imaginary for the class
    private double real;
    private double imaginary;
    //Creating base method which assigns variable values to zero
    public RecComplexNum(){
        real =0;
        imaginary=0;
    }
    //Creating a method of RecComplexNum that accepts arguments for real and imaginary variables
    public RecComplexNum(double re, double im){
        this.real=re;
        this.imaginary=im;
    }
// created get methods for the real and imaginary portions of the complex number
    public double getReal() {
        return real;
    }
    // created get methods for the real and imaginary portions of the complex number
    public double getImaginary() {
        return imaginary;
    }

    //Creating a method which calculates the polar form of a number from rectangular form
    public PolarComplexNum getPolarFromRec(){
        //taking the magnitude of the imaginary and real numbers with the myPow and mySqrt method in MyMethod
        double mag = MyMethod.mySqrt(MyMethod.myPow(real,2)+MyMethod.myPow(imaginary,2));
        //creating a ratio to then take the tangent of
        double ratio = imaginary / real;
        //taking the tangent of the ratio
        double angle = Math.atan(ratio);
        //turning the angle from radians to degrees
        double angleDeg = Math.toDegrees(angle);
        //creating a PolarComplexNum type variable to return
        PolarComplexNum polarForm = new PolarComplexNum(mag,angleDeg);
        //Returning the newly created variable
        return polarForm;
    }
    //Creating a method which prints the rectangular form of a rectangular number
    public void displayRecForm(){
        //An if else statement to change formatting depending on the sign of the second variable
        if(imaginary<0) {
            //For when Imaginary is negative
            System.out.printf("In rectangular form %.2f %.2fi\n", real, imaginary);
        }
        else{
            //For when Imaginary is positive
            System.out.printf("In rectangular form %.2f + %.2fi\n", real, imaginary);
        }
    }
}
