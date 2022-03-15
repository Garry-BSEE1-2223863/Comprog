/** 
 * @(#)AngletoRadianProblem_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 15/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/15
 */
import java.util.Scanner;
public class AngletoRadianProblem_Pinto {
    public static void main(String[] args) {
        double rad;
        double sum;
        Scanner ang = new Scanner(System.in);

        System.out.print("Enter an angle expressed in Degrees: ");
        int deg = ang.nextInt();

        System.out.print("Enter an angle expressed in Minutes: ");
        int min = ang.nextInt();

        System.out.print("Enter an angle expressed in Seconds: ");
        int sec = ang.nextInt();

        sum = deg + (min/60) + (sec/3600);
        rad = Math.PI*(sum/180);
        System.out.print("The equivalent angle in radians is "+ rad);




    }
}
