/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. print header
2. prompt user to make selection of calculation
3.use a switch statement to filter the users choice
4. prompt user to enter the variables of the respective number based on choice
5. transform the input variables into the opposite form using other classes
6. print result and loop the program until the user exits
7. print footer statement
 */
package Lab9.Lab7;

import java.util.Scanner;

public class DemoComplexNumberCooper {
    public static void main(String[] args) {
        //Calling the header method which proper variables
        MyMethod.printHeader(6,1);
        //creating a new RecComplexNum type reference variable
        RecComplexNum RCN = new RecComplexNum();
        //creating a new PolarComplexNum type reference variable
        PolarComplexNum PCN = new PolarComplexNum();
        //creating and instantiating variables real,imaginary,magnitude and angle with value 0
        double real=0;
        double imaginary=0;
        double magnitude = 0;
        double angle = 0;
        //creating a new scanner type variable "input"
        Scanner input = new Scanner(System.in);
        //creating an integer type variable choice
        int choice;
        //A while loop that will repeat forever unless broken by the user input
        while(true) {
            //A print statement that provides the user with three choices for the program
            System.out.print("" +
                    "**** Complex Number Conversion ***** \n" +
                    "************************************* \n" +
                    "1) Rectangular/Cartesian to Polar \n" +
                    "2) Polar to Rectangular/Cartesian \n" +
                    "3) Exit! \n" +
                    "*************************************\n" +
                    "What conversion would you like to perform?: ");
            //taking the users input and assigning it to the choice variable
            choice = input.nextInt();
            //A switch statement that uses the users entered value as the argument
            switch (choice) {
                //Selection 1 for rectangular to polar conversion
                case 1:
                    //prompts the user to enter the real and imaginary values for the rectangular form
                    System.out.print("\nConverting Rectangular/Cartesian To Polar:\n" +
                            "Enter real value:");
                    //assigning input to the real variable
                    real = input.nextDouble();
                    System.out.print("Enter imaginary value: ");
                    //assigning user input to the imaginary variable
                    imaginary = input.nextDouble();
                    //creating a new rectangular complex number with the user inputs
                    RCN = new RecComplexNum(real, imaginary);
                    //getting the polar form of that number and assigning it to a polar complex number variable
                    PCN = RCN.getPolarFromRec();
                    //An if else statement that formats based on the negative sign in the rectangular form
                    if(imaginary<0){
                        //for when imaginary number is negative
                        System.out.printf("Result in Polar Form\n" +
                                "---------------------------------\n" +
                                "Given Rectangular Form A = %.2f %.2fi.\n", real, imaginary);
                        //calling on displayPolarForm method with new polarComplexNum type variable
                        PCN.displayPolarForm();
                    }
                    else{
                        //for when imaginary is positive
                        System.out.printf("Result in Polar Form\n" +
                                "---------------------------------\n" +
                                "Given Rectangular Form A = %.2f + %.2fi.\n", real, imaginary);
                        //calling on displayPolarForm method with new polarComplexNum type variable
                        PCN.displayPolarForm();
                    }
                    break;
                case 2:
                    //Prompting the user to enter the magnitude and angle of a polar number
                    System.out.print("\nConverting Polar to Rectangular/Cartesian:\n" +
                            "Enter magnitude value:");
                    //assigning user input to magnitude
                    magnitude = input.nextDouble();
                    System.out.print("Enter angle value: ");
                    //assigning user input to angle
                    angle = input.nextDouble();
                    //creating a new polar complex number with angle and magnitude attributes
                    PCN = new PolarComplexNum(magnitude, angle);
                    //getting the rectangular form from that polar complex number and
                    //assigning it to a RecComplexNum variable
                    RCN = PCN.getRecFromPolar();
                    //Printing the given polar form
                    System.out.printf("Result in Rectangular Form\n" +
                            "---------------------------------\n" +
                            "Given Polar Form A = Magnitude: %.2f, Angle: %.2f.\n", magnitude, angle);
                    //Calling on displayRecForm method with new recComplexNum variable
                    RCN.displayRecForm();
                    break;
                case 3:
                    //breaking the switch statement immediately
                    break;
                case 4:
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
            //Calling the print footer method with my name as an argument
            MyMethod.printFooter("Cooper Perron");
        }

    }

