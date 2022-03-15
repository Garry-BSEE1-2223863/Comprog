/** 
 * @(#)PowerLossProblem_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 15/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/15
 */
import java.util.Scanner;
public class PowerLossProblem_Pinto {
    public static void main(String[] arg){
        Double watt; 
        Scanner elc = new Scanner(System.in);

        System.out.print("Enter the current flowing through the cable: ");
        double amp = elc.nextDouble();

        System.out.print("Enter the resistance flowing through the cable: ");
        double ohm = elc.nextDouble();

        watt = ohm * Math.pow(amp,2);
        System.out.print("Power loss is "+ watt);

    }
}
