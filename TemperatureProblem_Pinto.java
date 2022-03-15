/** 
 * @(#)TemperatureProblem_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 15/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/15
 */
import java.util.Scanner;
public class TemperatureProblem_Pinto {
    public static void main(String[] args) {
        double fah;
        double cel;
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a temperature in degrees Fahrenheit: ");
        fah = kbd.nextInt();

        cel = 5*(fah-32)/9;
        System.out.print("The Equivlent temperature in degrees Celcius is "+ cel);
        
    }
    
}
