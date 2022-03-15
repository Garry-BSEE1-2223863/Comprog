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
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        Double KWH;
        Double overKWH;
    
        System.out.print("Enter Electric Consumption: ");
        int kwh = kbd.nextInt();

        KWH = kwh*30.12;
        overKWH =((kwh-400)*25.23)+(400*30.12);
        if ( kwh<=400) System.out.print("Electrical bill is P"+KWH);
        else if (kwh > 400) System.out.print("Electrical bill is P"+overKWH);
    
    }
}
