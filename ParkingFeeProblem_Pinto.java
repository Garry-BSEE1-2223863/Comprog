/** 
 * @(#)ParkingFeeProblem_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 15/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/15
 */
import java.util.Scanner;
public class ParkingFeeProblem_Pinto {
    public static void main(String[] args) {
        Scanner fee = new Scanner(System.in);
        System.out.print("Enter number of hours: ");
        int hour = fee.nextInt();

        int over =((hour-4)*15)+35;
        int max = 250;
        if (hour<= 4) System.out.print("Parking Fee: P 35");
        else if (hour > 8) System.out.print("Parking Fee: P "+ max);
        else if (hour>= 5 || hour<= 8) System.out.print("Parking Fee: P "+ over);
            
    }
}
