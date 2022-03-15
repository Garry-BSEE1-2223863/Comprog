/** 
 * @(#)YearProblem_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 15/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/15
 */
import java.util.Scanner;
public class YearProblem_Pinto {
    public static void main(String[] args) {
        Scanner yer = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = yer.nextInt();

        if (year%100 == 0) System.out.print("It is a century year.");
            else if (year%4 == 0) System.out.print("It is a leap year.");
            else System.out.print("It is an ordinary year.");
        
    }
    
}
