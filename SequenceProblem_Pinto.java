/**
 * @(#)SequenceProblem_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 14/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/14
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class SequenceProblem_Pinto {
 public static void main(String[] args){
     Scanner kbd = new Scanner(System.in);
     double doubleNumber;
     System.out.println("Resistor Computation");

     System.out.print("Enter Resistor 1: ");
     double res1 = kbd.nextDouble();

     System.out.print("Enter Resistor 2: ");
     double res2 = kbd.nextDouble();

     System.out.print("Enter Resistor 3: ");
     double res3 = kbd.nextDouble();

     System.out.print("Enter Resistor 4: ");
     double res4 = kbd.nextDouble();
     System.out.println("Total Resistance");
    
     double sum = (res1 + res2 + res3 + res4);
     sum = Math.round(sum*100.0)/100.0;
     System.out.println("Series Connection: "+sum);
     double par= 1/((1/res1) + (1/res2) + (1/res3) + (1/res4)); 
     System.out.println("Parallel Connection: "+par);
 }
    
}
