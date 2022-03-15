/** 
 * @(#)ElectricalBillProblem_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 15/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/15
 */
import java.util.Scanner;
public class ElectricalBillProblem_Pinto {
    public static void main(String[] args) {
        Double KWH;
        Double overKWH;
        Scanner bil = new Scanner(System.in);

        
        System.out.print("Enter Electric Consumption: ");
        int hour = bil.nextInt();
        
        KWH = 30.12*hour;
        overKWH = ((hour-400)*25.23)+(KWH*400);

        if (hour<= 400) System.out.print("Electric Bill is "+ KWH);
        else System.out.print("Electric Bill is "+ overKWH);

    

    }
}
