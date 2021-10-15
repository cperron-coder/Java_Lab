/*
Cooper Perron
Student Number: 251137730
Date: April.12. 2021
Task:
1. creating a class formats the final course grade and prints all of the course grades in a proper format
2. implement the interface that was created
3. get the expected score in the course
 */
package Lab9.Q2;
//implementing the interface in the class
public class CourseGrades implements Analyzable {
    //creating a private gradeActivity array type variable called grades
    private GradeActivity[] grades;
//initializing the array in a constructor method
    public CourseGrades(GradeActivity[] grades) {
        this.grades = new GradeActivity[grades.length];
        //using a for loop to instantiate the whole array sequentially
        for(int i = 0; i<grades.length;i++) {
            this.grades[i] = grades[i];
        }
    }
    //creating a method to get the expected score of the student
    public GradeActivity getExpectedScore() {
        //creating a reference variable for the final score in the course
        double finalScore = 0;
        //using a for loop to increment the final score based on the scores in all components of the course
        for(int a =0; a< grades.length;a++) {
            finalScore += grades[a].getScore();
        }
        //passing the final score to the grade activity class as a parameter
        GradeActivity G1 = new GradeActivity(finalScore);
        //returning the new grade activity variable
        return G1;
    }
    //using a String.format method to properly format the answer of the grades and properly call the scores and grades
    //for each of the components of the course respectively. Calling from different areas in the array to do this.
    public String toString() {
        return String.format("" +
                "===============================================================\n" +
                "Lab Score: %.2f out of 20,                %.2f%%      Grade: %s\n" +
                "Quiz Score: %.2f out of 20,               %.2f%%      Grade: %s\n" +
                "Reading Assessment Score: %.2f out of 5,   %.2f%%      Grade: %s\n" +
                "Midterm Score: %.2f out of 20,            %.2f%%      Grade: %s\n" +
                "Final Exam Score: %.2f out of 35,         %.2f%%      Grade: %s\n"+
                "===============================================================\n",
                grades[0].getScore(),(grades[0].getScore()/20)*100,grades[0].getGrade((grades[0].getScore()/20)*100),
                grades[1].getScore(),(grades[1].getScore()/20)*100,grades[1].getGrade((grades[1].getScore()/20)*100),
                grades[2].getScore(),(grades[2].getScore()/5)*100,grades[2].getGrade((grades[2].getScore()/5)*100),
                grades[3].getScore(),(grades[3].getScore()/20)*100,grades[3].getGrade((grades[3].getScore()/20)*100),
                grades[4].getScore(),(grades[4].getScore()/35)*100,grades[4].getGrade((grades[4].getScore()/35)*100));
    }
}