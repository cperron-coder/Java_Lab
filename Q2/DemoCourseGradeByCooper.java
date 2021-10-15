/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. input grades for each component of the course
2. predict the grade for the final exam
3. in a formatted manner, display the scores and grades of each component of the course as well as the
   the expected course grade and final exam grade
4. call the footer method
 */
package Lab9.Q2;
//importing lab 7 for the myMethod class
import Lab9.Lab7.*;
public class DemoCourseGradeByCooper {
    public static void main(String[] args) {
        //calling the printHeader method with the appropriate numbers for each component of this lab
        MyMethod.printHeader(9,2);
        //creating a new course and instructor type variable with the appropriate information
        CourseAndInstructor course = new CourseAndInstructor("Programming Fundamentals", "Quazi","Rahman","TEB361");
        //creating a new student info type variable with my info
        StudentInfo student = new StudentInfo("Cooper","Perron",251137730,course);
        //creating three different arrays with my lab, quiz, and reading assessment grades respectfully
        double [] labG = new double[]{23,30,19,28,29,29,30,29,29};
        double [] QuizG = new double[]{9,10,10,8.5,6,6};
        double [] readG = new double[]{28,21,15,20,15,19,20,21,18,22,31};
        //creating a new grade activity type variable for my midterm grade
        GradeActivity midterm = new GradeActivity(18.38);
        //creating a new finalexam type variable with the information for my final exam
        FinalExam finalExam = new FinalExam(50,2,24,8,100);
        //creating new variables for my lab, quiz and reading assessment grades and passing the corresponding arrays to those classes
        LabGrade labGrade = new LabGrade(labG);
        QuizGrade quizGrade = new QuizGrade(QuizG);
        ReadingAssesmentGrade readGrade = new ReadingAssesmentGrade(readG);
        //creating a new grade activity type variable to house all of the grades for each component of the course
        GradeActivity[] gA = new GradeActivity[5];
        //using a for loop to initialize all of the places in the array as grade activity variables
        for(int i =0; i>gA.length; i++){
            gA[i]= new GradeActivity();
        }
        //assigning the respective variables to places in the new grade activity array
        gA[0]= labGrade;
        gA[1]= quizGrade;
        gA[2]= readGrade;
        gA[3]= midterm;
        gA[4]= finalExam;
        //creating a new variable for my course grades
        CourseGrades myCourse = new CourseGrades(gA);
        //printing the student and myCourse reference variables using the .toString method within each of the respective classes
        System.out.println(student.toString());
        System.out.print(myCourse.toString());
        //printing out the formatted expected score for the course using the .getScore method and then the .getGrade method
        //using the .getScore value
        System.out.printf("Expected Course Score: %.2f  Grade: %s\n",
                myCourse.getExpectedScore().getScore(),
                myCourse.getExpectedScore().getGrade(myCourse.getExpectedScore().getScore()));
        //calling the print footer method with my name and partners name which will be printed
        MyMethod.printFooter("Cooper Perron");


    }
}
