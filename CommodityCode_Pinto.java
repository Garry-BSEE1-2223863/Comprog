/**
 * @(#)CommodityCode_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 15/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/15
 */
import java.util.Scanner;
public class CommodityCode_Pinto {
    public static void main(String[] args){
       
        System.out.print("Enter commodity code: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'J' || ch == 'K' || ch == 'L'){
            System.out.print("Enter quantity of commodity: ");
            double qu = sc.nextDouble();
            System.out.print("Enter unit price: ");
            double up = sc.nextDouble();
            double amount = qu * up;
            if(ch == 'J') amount = 0.92 * amount;
            else if(ch == 'K') amount = 1.11 * amount;
            System.out.printf("Amount to be paid is P %2.2f", amount);
        }
        else
        System.out.print("Invalid Code");

    }
    
}
