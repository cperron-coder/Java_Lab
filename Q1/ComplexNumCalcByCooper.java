/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. ask user to input complex numbers
2. ask user to add subtract multiply divide or exit the program
3. use a switch statement to fulfill their choice
4. continue this in an infinite loop until the program is exited
5. create a method which automizes data entry and can be called
6. call upon new class to multiply and divide numbers
 */
package Lab9.Q1;
//importing MyMethod class from the previous lab
import java.util.Scanner;
import Lab9.Lab7.*;

public class ComplexNumCalcByCooper {
    //creating a new scanner variable
    public static Scanner input = new Scanner(System.in);
    //creating a new complex number type array of size two
    public static ComplexAddSubClass[] recArray = new ComplexAddSubClass[2];
    public static ComplexMultiDivideClass [] polarArray = new ComplexMultiDivideClass[2];
    public static ComplexMultiDivideClass mdResult;
    public static PolarComplexNum pcn;


    public static void main(String[] args) {
        //printing the header method from the MyMethod class
        MyMethod.printHeader(9, 1);
        //creating a choice variable for the switch statement
        int choice;
        //a infinite while loop to run the program
        while (true) {
            //A print statement that provides the user with three choices for the program add, subtract or exit
            System.out.print("" +
                    "******** Complex Number Calculator ********* \n" +
                    "******************************************** \n" +
                    "1) Adder \n" +
                    "2) Subtractor \n" +
                    "3) Multiplier \n" +
                    "4) Divider \n"+
                    "5) Exit! \n" +
                    "*************************************\n" +
                    "What conversion would you like to perform?: ");
            //taking the users input and assigning it to the choice variable
            choice = input.nextInt();
            //A switch statement that uses the users entered value as the argument
            switch (choice) {
                //case for the add option
                case 1:
                    //calling the dataEntry method to create a new array
                dataEntry();
                //creating a new complex number using the adder method from the previous class and the entered variables
                ComplexAddSubClass added = ComplexAddSubClass.adder(recArray[0],recArray[1]);
                //printing the user entered complex numbers and the final added complex number using a printf statement
                    // using array calls and the added variable all dot operated with the toString method which makes
                    // the numbers formatted printable strings
                    System.out.printf("" +
                            "Here is your result of (a+b)\n " +
                            "------------------------------\n" +
                            "a = %s \n" +
                            "b = %s\n" +
                            "a + b = %s\n",recArray[0].toString(),recArray[1].toString(),added.toString());
                    //breaking the switch statement
                break;
                case 2:
                    //calling the dataEntry method to create a new array
                    dataEntry();
                    //creating a new complex number using the subtract method from the previous class and
                    // the entered variables
                    ComplexAddSubClass subtracted = ComplexAddSubClass.subtract(recArray[0],recArray[1]);
                    //printing the user entered complex numbers and the final subtracted complex number
                    // using a printf statement using array calls and the subtracted variable all dot operated
                    // with the toString method which makes the numbers formatted printable strings
                    System.out.printf("" +
                            "Here is your result of (a+b) \n" +
                            "------------------------------\n" +
                            "a = %s \n" +
                            "b = %s\n" +
                            "a - b = %s\n",recArray[0].toString(),recArray[1].toString(),subtracted.toString());
                    //breaking the switch statement
                    break;
                case 3:
                    //calling the dataEntry method to create a new array
                    dataEntry();
                    //creating new polar complex number values for each of the input rectangular complex numbers and
                    // inputing them into a new polar complex number array.
                    for(int i=0; i<recArray.length;i++){
                        RecComplexNum recComplex = new RecComplexNum(recArray[i].getReal(),recArray[i].getImaginary());
                        pcn = recComplex.getPolarFromRec();
                        polarArray [i] = new ComplexMultiDivideClass(pcn.getMagnitude(),pcn.getAngle());
                    }
                    //multiplying the two polar complex numbers from the array together by calling them and using
                    // dot operator method to multiply them. then assigning this to a new variable
                    ComplexMultiDivideClass multiplyResult = mdResult.multiply(polarArray[0],polarArray[1]);
                    //assigning both the magnitude and angle of the new complex number to variables
                     double magM = multiplyResult.getMagnitude();
                    double angleM = multiplyResult.getAngle();
                    //creating a new polar complex number reference variable with the magnitude and angle
                    PolarComplexNum inPolarM = new PolarComplexNum(magM, angleM);
                    //converting the new polar complex number to rectangular form using getRecFrom Polar method
                    // and assigning to a reference variable
                    RecComplexNum inRecM = inPolarM.getRecFromPolar();
                    //a formatted print statement which prints the requested variables in the format provided
                    System.out.printf("" +
                                    "Here is your result of (a x b) \n" +
                            "------------------------------\n" +
                            "a = %s "+"; in Polar Form => Magnitude: %f, Angle: %f degrees\n"+
                            "b = %s "+"; in Polar Form => Magnitude: %f, Angle: %f degrees\n"+
                            "a x b = (In Polar) Magnitude: %f, Angle: %f degrees\n" +
                            "a x b = (In Rectangular) ",
                            recArray[0].toString(),polarArray[0].getMagnitude(),polarArray[0].getAngle(),
                            recArray[1].toString(),polarArray[1].getMagnitude(),polarArray[1].getAngle(),
                            multiplyResult.getMagnitude(),multiplyResult.getAngle());
                            inRecM.displayRecForm();
                            //breaking the statement when the code is complete
                    break;
                case 4:
                    //calling the dataEntry method to create a new array
                    dataEntry();
                    //creating new polar complex number values for each of the input rectangular complex numbers and
                    // inputing them into a new polar complex number array.
                    for(int i=0; i<recArray.length;i++){
                        RecComplexNum recComplex = new RecComplexNum(recArray[i].getReal(),recArray[i].getImaginary());
                        pcn = recComplex.getPolarFromRec();
                        polarArray [i] = new ComplexMultiDivideClass(pcn.getMagnitude(),pcn.getAngle());
                    }
                    //dividing the two polar complex numbers from the array together by calling them and using
                    // dot operator method to divide them. then assigning this to a new variable
                    ComplexMultiDivideClass divideResult = mdResult.divide(polarArray[0],polarArray[1]);
                    //assigning both the magnitude and angle of the new complex number to variables
                    double magD = divideResult.getMagnitude();
                    double angleD = divideResult.getAngle();
                    //creating a new polar complex number reference variable with the magnitude and angle
                    PolarComplexNum inPolarD = new PolarComplexNum(magD, angleD);
                    //converting the new polar complex number to rectangular form using getRecFrom Polar method
                    // and assigning to a reference variable
                    RecComplexNum inRecD = inPolarD.getRecFromPolar();
                    //a formatted print statement which prints the requested variables in the format provided
                    System.out.printf("" +
                                    "Here is your result of (a x b) \n" +
                                    "------------------------------\n" +
                                    "a = %s "+"; in Polar Form => Magnitude: %f, Angle: %f degrees\n"+
                                    "b = %s "+"; in Polar Form => Magnitude: %f, Angle: %f degrees\n"+
                                    "a / b = (In Polar) Magnitude: %f, Angle: %f degrees\n" +
                                    "a / b = (In Rectangular) ",
                            recArray[0].toString(),polarArray[0].getMagnitude(),polarArray[0].getAngle(),
                            recArray[1].toString(),polarArray[1].getMagnitude(),polarArray[1].getAngle(),
                            divideResult.getMagnitude(),divideResult.getAngle());
                    inRecD.displayRecForm();
                    //breaking the code
                    break;
                case 5:
                    //printing the number of objects that have been instantiated using a printf
                    // statement and the dot operator with the getCounter method
                    System.out.printf("%d ComplexAddSubClass Objects have been instantiated in this program\n", ComplexAddSubClass.getCounter());
                    System.out.printf("%d ComplexMultiDivideClass Objects have been instantiated in this program\n", ComplexMultiDivideClass.getPolarCounter());
                    //breaking the switch statement immediately
                    break;
                case 6:
                    //Printing an error statement if the number given is not chosen (default error choice)
                    System.out.println("\nInvalid Choice! Enter Any Number Between 1 and 3\n");
                    break;
            }
            //An if statement that displays an error statement if the number is not one of the choices and is not 4
            if (4 < choice || choice <= 0)
                System.out.println("\nInvalid Choice! Enter Any Number Between 1 and 3\n");
            //An if statement that exits the while loop if the choice "exit" is chosen
            if(choice==3)
                break;
        }
        //calling the printFooter method from the MyMethod class from the previous lab with my name
                MyMethod.printFooter("Cooper Perron");
            }
            //creating a data entry class
        public static void dataEntry () {
        //a for loop to ask user to fill the whole array of size 2
            for (int i = 0; i < recArray.length; i++) {
                //asking the user for the real part of the complex number
                System.out.print("Please enter the real value of the complex number: ");
                //assigning the user input to a variable
                double r = input.nextDouble();
                //asking the user for the imaginary part of the complex number
                System.out.print("Please enter the imaginary value of the complex number: ");
                //assigning the user input to a variable
                double im = input.nextDouble();
                //creating a new complex number with the user inputted values and assigning it to a space in the array
                recArray[i] = new ComplexAddSubClass(r, im);
            }
        }
    }

