/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. create a class which extends grade activity
2. create an array type variable for quiz grades
3. average the scores from the array and set a new final score for the whole array
4. bring code over from Lab grade class to complete this class
 */
package Lab9.Q2;
//extending from the GradeActivity class
public class QuizGrade extends GradeActivity {
    //creating a new reference value of double type array for quizGrades
    private double[] quizGrades;
    //creating a constructor class which accepts a user input of a double type array
    public QuizGrade (double[] quizGr){
        //using a for loop to copy over the values of the input array to the local variable quizGrades array
        quizGrades = new double[quizGr.length];
        for (int i = 0; i < quizGr.length; i++)
            quizGrades[i] = quizGr[i];
        // Set the scores to GradeActivity by finding the average of the lab grades.
        //this following part could have been done with the array reference variable labGr only
        double average = 0;
        for (int i = 0; i < quizGrades.length; i++)
            average += quizGrades[i];
        //Calculate 20%; Each lab was graded out of 10
        average = (average / quizGrades.length/1)*2;
        // Set the lab average score out of 20% back to GradeActivity field 'score'.
        setScore(average);
    }

}
