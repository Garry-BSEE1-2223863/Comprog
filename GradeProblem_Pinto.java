/** 
 * @(#)GradeProblem_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 15/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/15
 */
import java.util.Scanner;
public class GradeProblem_Pinto {
    public static void main(String[] args) {
    Scanner gra = new Scanner(System.in);
    System.out.print("Enter a grade: ");
    int grade = gra.nextInt();

    if (grade == 99 || grade == 98 || grade == 97 || grade == 96 || grade == 95 || grade == 94 || grade == 93) System.out.print("Excellent");
        else if (grade == 92 || grade == 91 || grade == 90 || grade == 89 || grade == 88 || grade == 87 ) System.out.print("Very Good");
        else if (grade == 86 || grade == 85 || grade == 84 || grade == 83 || grade == 82 || grade == 81 || grade == 80) System.out.print("Good");
        else if (grade == 79 || grade == 78 || grade == 77 || grade == 76 || grade == 75 || grade == 74 || grade == 73 || grade == 72 || grade == 71 || grade == 70) System.out.print("Fair");
        else if (grade == 69 || grade == 68 || grade == 67 || grade == 66 || grade == 65) System.out.print("Poor");
        else System.out.print("Invalid Input.");
    }


    
}
