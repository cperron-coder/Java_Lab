/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. create methods which calculate the sine and cosine of input angles using the provided calculations
2. create a print header method
3. create a print footer method
 */
package Lab9.Lab7;

public class MyMethod {
    //Basic power method
    public static double myPow (double x, int y){
        double p = x;
        for(int n=1;n<y;n++){
            p=p*x;
        }
        return(p);
    }
    //method that calculates the sine of an input angle
    public static double mySin(double x){
        //creating sin variable and instantiating
        double sin = 0;
        //creating a for loop to simulate a sum function
        for(int n=0; n<=20; n++)
        {
            //creating a reference variable p1 to perform an exponential function
            double p1 = 1;
            //Creating a for loop to multiply the number of times specified in the exponent
            for(int i = 1; i<=n; i++){
                p1=p1*(-1);
            }
            //Performing a factorial function with reference variable p2
            double p2 = 1;
            //creating a for loop that includes the arguments in the given expression
            for(int j=1; j<=2*n+1;j++){
                p2*=j;
            }
            //performing a final exponential function with variable as the base and exponent
            double p3 = 1;
            for(int k=1; k<=2*n+1;k++){
               p3=p3*x;
            }
            //Organizing the preceding calculations to calculate the sine of the input angle
            sin= sin+((p1/p2)*p3);
        }
        //returning the sine
        return sin;
    }
    //creating a method to calculate the cosine of the input angle
    public static double myCos(double x){
        //creating and instantiating a variable for cosine
        double cos = 0;
        //creating a for loop to simulate a sum function
        for(int n=0; n<=20; n++)
        {
            //creating a reference variable p1 to perform an exponential function
            double p1 = 1;
            //a for loop to ensure that the total exponential function is performed
            for(int i = 1; i<=n; i++){
                p1=p1*(-1);
            }
            //creating a reference variable and performing a factorial function
            double p2 = 1;
            for(int j=1; j<=2*n;j++){
                p2*=j;
            }
            //creating a reference variable and performing an exponential function
            double p3 = 1;
            for(int k=1; k<=2*n;k++){
                p3=p3*x;
            }
            //organizing the preceding equations to determine the cosine of the input angle
            cos= cos+((p1/p2)*p3);
        }
        //returning the cosine
        return cos;
    }
    //creating method to calculate the square root of a number using the Babylonian method
    public static double mySqrt(double n) {
        //initializing variables for lastGuess and newGuess and setting tolerance
        double lastGuess = 1;
        double nextGuess = 0;
        double tolerance = 1E-4;
        //creating a for loop to compare the guesses of the square root while continuously incrementing the next guess
        for (int i=0; i<n; i++){
            //a formula to calculate the next guess
            nextGuess = (lastGuess+(n/lastGuess))/2;
            //if absolute value of the difference is under the tolerance, the loop will break and the answer recorded
            if (Math.abs(nextGuess - lastGuess) <= tolerance) {
                break;
                // if the absolute value of the difference is greater than the tolerance, the loop will continue to execute
            } else {
                lastGuess = nextGuess;
            }
        }
        //once the answer is found it is returned to the method call
        return (nextGuess);
    }

    //print header method with two parameters defined as integers for labNum and quesNum
    public static void printHeader(int labNum, int quesNum) {
        //astrix bar printed with simple print line function to proceed message
        System.out.println("***********************************");
        //println function used to print custom message with variables "\t" and "\s" used to properly format
        System.out.println("\t Cooper Perron\n\t Thomas Aiello");
        System.out.println("\t Lab #" + labNum + ",\s Question #" + quesNum);
        //astrix bar printed with simple print line function at the end of message
        System.out.println("***********************************");
    }
    public static void printFooter(String name) {
        //printf function used to add astrix's to either side of the variable name
        System.out.printf("*** Good Bye from %s and Thomas Aiello***",name);
    }
}

