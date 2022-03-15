/**
 * @(#)PipeProblems_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 15/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/15
 */
import java.util.Scanner;
public class PipeProblems_Pinto {
    public static void main(String[] args){
    double thick;
    double outDia;
    double inDia;
    Scanner asl = new Scanner(System.in);

    System.out.print("Enter Outside Diameter: ");
    outDia = asl.nextDouble();
    
    System.out.print("Enter Inside Diameter: ");
    inDia = asl.nextDouble();

    thick = (outDia - inDia)/ 2.0;

    System.out.println("The thickness of the wall of the pipe is "+ thick);
    }

    
}
