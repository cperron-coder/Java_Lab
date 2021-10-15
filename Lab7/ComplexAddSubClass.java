/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. extend the subclass from the RecComplexNum class in the previous lab
2. create a class that adds complex numbers using class calls from lab 7
3. create a class that subtracts complex numbers using class calls from lab 7
4. create a class that converts the complex numbers into a printable string format
 */
package Lab9.Lab7;
//importing the RecComplexNum class to this one

//extends key word is added to the descriptors of this class to give it the properties of the parent class
public class ComplexAddSubClass extends RecComplexNum {
    //instantiating a counter variable to count how many objects are instantiated
    private static int counter=0;
    public ComplexAddSubClass(){
        //calling super to initialize the other class's methods in this class
     super();
     //incrementing the counter for each time this method is entered
     counter++;
    }
    public ComplexAddSubClass(double real, double imaginary){
        //instantiating the variables within the super method call to the previous class
        super(real,imaginary);
        //incrementing the counter for each time this method is entered
        counter++;
    }
    //creating a get counter variable to return the value of the counter
    public static int getCounter() {
        return counter;
    }
    //creating a class that adds two complex numbers
    public static ComplexAddSubClass adder(ComplexAddSubClass a, ComplexAddSubClass b){
        //getting the real and imaginary parts of the first complex number using the dot operator
        // from the super class and instantiating them as double type variables
        double r1 =a.getReal();
        double i1 =a.getImaginary();
        //getting the real and imaginary parts of the second complex number using the dot operator
        // from the super class and instantiating them as double type variables
        double r2 =b.getReal();
        double i2 =b.getImaginary();
        //adding the real and imaginary parts of the first and second complex numbers respectively
        //  and instantiating them as double type variables
        double r3 = r1+r2;
        double i3 = i1+i2;
        //creating a new complex number with the newly added real and imaginary numbers
        ComplexAddSubClass c3 = new ComplexAddSubClass(r3,i3);
        //returning the newly created complex number
        return c3;
    }
    //creating a class that subtracts two complex numbers
    public static ComplexAddSubClass subtract (ComplexAddSubClass a, ComplexAddSubClass b){
        //getting the real and imaginary parts of the first complex number using the dot operator
        // from the super class and instantiating them as double type variables
        double r1 =a.getReal();
        double i1 =a.getImaginary();
        //getting the real and imaginary parts of the second complex number using the dot operator
        // from the super class and instantiating them as double type variables
        double r2 =b.getReal();
        double i2 =b.getImaginary();
        //subtracting the real and imaginary parts of the first and second complex numbers respectively
        //  and instantiating them as double type variables
        double r3 = r1-r2;
        double i3 = i1-i2;
        //creating a new complex number with the newly subtracted real and imaginary numbers
        ComplexAddSubClass c3 = new ComplexAddSubClass(r3,i3);
        //returning the newly created complex number
        return c3;
    }
    //toString class is created which turns a complex number into a printable string
    public String toString(){
        //creating two double type variables for real and imaginary based on the real and
        // imaginary parts of the complex number in super
        double real = super.getReal();
        double imaginary = super.getImaginary();
        //creating a string type variable called s without any assigned string
        String s;
        //an if statement to create a string based on the sign of the imaginary number of super
        if(imaginary>=0){
            //if the imaginary number is positive then it is printed with a + and assigned to s
            s = String.format("%.2f + %.2fi",real, imaginary);
        }
        else{
            //if the imaginary portion is negative, then it is taken as an absolute
            // and printed with a - and assigned to s
            s = String.format("%.2f - %.2fi",real, Math.abs(imaginary));
        }
        // the s variable is returned
       return s;
    }
}
