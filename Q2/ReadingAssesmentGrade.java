/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. create a class which extends grade activity
2. create an array type variable for reading assessment grades
3. average the scores from the array and set a new final score for the whole array
4. bring code over from Lab grade class to complete this class
 */
package Lab9.Q2;
//extending the grade activity class
public class ReadingAssesmentGrade extends GradeActivity {
    //creating a private variable to house the reading assessment grade in an array
    private double[] raGrade;
    //creating a constructor class that allows the user to input a double type array
    public ReadingAssesmentGrade(double[] readGr){
        raGrade = new double[readGr.length];
        for (int i = 0; i < readGr.length; i++)
            raGrade[i] = readGr[i];
        // Set the scores to GradeActivity by finding the average of the lab grades.
        //this following part could have been done with the array reference variable labGr only
        double average = 0;
        for (int i = 0; i < raGrade.length; i++)
            average += raGrade[i];
        //Calculate 20%; All reading assessments are out of 265 marks. average is calculated out of 5
        average = (average/265)*5;
        // Set the lab average score out of 20% back to GradeActivity field 'score'.
        setScore(average);
    }

}
