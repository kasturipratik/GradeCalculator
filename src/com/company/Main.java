package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your test score: ");
        int score = scan.nextInt();

        String grade ;//I'm not hopeful

        if (score > 89) {
            if (score < 93)
                grade = "A -";
            else if (score > 97)
                grade = "A +";
            else
                grade = "A";
        }
        else if (score > 79) {
            if (score < 83)
                grade = "B -";
            else if (score > 87)
                grade = "B +";
            else
                grade = "B";
        }
        else if (score > 69){
            if(score <73)
                grade = "C -";
            else if (score >77)
                grade = "C +";
            else
                grade ="C";
        }
        else if (score >=60) {
            if (score < 63)
                grade = "D -";
            else if (score > 67)
                grade = "D +";
            else
                grade = "B";
        }
        else {
            grade = "F";
        }
        if (score >= 60)
            System.out.println("This is your grade: " + grade);
        else
            System.out.println("Did you even look at the book?");
    }
}
