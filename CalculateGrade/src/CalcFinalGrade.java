import java.util.Scanner;
import java.lang.Math;

public class CalcFinalGrade {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//quizzes
		double quiz1 = scanner.nextDouble();
		System.out.println("Quiz 1: " + quiz1);
		double quiz2 = scanner.nextDouble();
		System.out.println("Quiz 2: " + quiz2);
		double quiz3 = scanner.nextDouble();
		System.out.println("Quiz 3: " + quiz3);
		double quiz4 = scanner.nextDouble();
		System.out.println("Quiz 4: " + quiz4);
		double quiz5 = scanner.nextDouble();
		System.out.println("Quiz 5: " + quiz5);
		
		/*double[] quizGrades = {quiz1,quiz2,quiz3,quiz4,quiz5};
		double min = quizGrades[0];
		

		for (int i = 1; i < quizGrades.length; i++) {
		    if (quizGrades[i] < min)
		    {
		        min = quizGrades[i];
		        System.out.println("Lowest quiz grade is: "+ min);
		    }
		}*/
		double lowest = Math.min(quiz1, Math.min(quiz2, Math.min(quiz3, Math.min(quiz4, quiz5))));

		System.out.println("The lowest variable is: " + lowest);

		double avgQuizGrade = (((quiz1+quiz2+quiz3+quiz4+quiz5)-lowest)/4)*0.20;
		System.out.println("Average quiz grade is: " + avgQuizGrade);
		
		

				
		//assignments
		double  assignment1 = scanner.nextDouble();
		System.out.println("assignment 1: " + assignment1);
		double  assignment2 = scanner.nextDouble();
		System.out.println("assignment 2: " + assignment2);
		double  assignment3 = scanner.nextDouble();
		System.out.println("assignment 3: " + assignment3);
		double  assignment4 = scanner.nextDouble();
		System.out.println("assignment 4: " + assignment4);
		double  assignment5 = scanner.nextDouble();
		System.out.println("assignment 5: " + assignment5);
		
		/*double[] assignmentGrades = {assignment1,assignment2,assignment3,assignment4,assignment5};
		double min2 = assignmentGrades[0];
		

		for (int i = 1; i < assignmentGrades.length; i++) {
		    if (assignmentGrades[i] < min2) {
		        min2 = assignmentGrades[i];
		        System.out.println("Lowest assignment grade is: "+ min2);
		    }
		}*/
		double lowest2 = Math.min(quiz1, Math.min(quiz2, Math.min(quiz3, Math.min(quiz4, quiz5))));

		System.out.println("The lowest variable is: " + lowest2);
		
		double avgAssignmentGrade = ((((assignment1+assignment2+assignment3+assignment4+assignment5)-lowest2)/4)*0.30);
		System.out.println("Average assignment grade is: " + avgAssignmentGrade);
		
		//midterms
		double midterm1 = scanner.nextDouble();
		System.out.println("First midterm grade is: "+ midterm1);
		double midterm2 = scanner.nextDouble();
		System.out.println("First midterm grade is: "+ midterm2);
		
		double avgMidtermGrade = ((midterm1*0.15)+(midterm2*0.15));
		System.out.println("Average midterm grade is: "+ avgMidtermGrade);

		//Final Exam
		double finalExam = scanner.nextDouble();
		System.out.println("Final exam grade is: "+ finalExam);
		
		double avgFinalGrade = (finalExam*0.20);
		System.out.println("Average midterm grade is: "+ avgFinalGrade);
		
		System.out.println("*******************************");
		
		double totalScore = (avgQuizGrade+avgAssignmentGrade+avgMidtermGrade+avgFinalGrade);
		System.out.println("Final Grade is :" + totalScore);
		
		if (totalScore>=93){
			System.out.println("Final letter grade is A.");
		}else if (totalScore>=90 && totalScore<93) {
			System.out.println("Final letter grade is A-.");
		}else if (totalScore>=87 && totalScore<90) {
			System.out.println("Final letter grade is B+.");
		}else if (totalScore>=83 && totalScore<87) {
			System.out.println("Final letter grade is B.");
		}else if (totalScore>=80 && totalScore<83) {
			System.out.println("Final letter grade is B-.");
		}else if (totalScore>=77 && totalScore<80) {
			System.out.println("Final letter grade is C+.");
		}else if (totalScore>=73 && totalScore<77) {
			System.out.println("Final letter grade is C.");
		}else if (totalScore>=70 && totalScore<73) {
			System.out.println("Final letter grade is C-.");
		}else if (totalScore>=67 && totalScore<70) {
			System.out.println("Final letter grade is D+.");
		}else if (totalScore>=60 && totalScore<67) {
			System.out.println("Final letter grade is D.");
		}else {
			System.out.println("Final letter grade is F.");
		}	
		
	}


	
}
