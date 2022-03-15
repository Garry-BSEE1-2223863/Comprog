/**
 * @(#)DecisionControlStructureIfProblem_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 14/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/14
 */
import java.util.Scanner;

public class DecisionControlStructureIFProblem_Pinto2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner keyIn = new Scanner(System.in); 
        //Specify the data type of the vaiables 
        String CommodityCode; //use to hold the commodity code
        double QuantityofCommodity; //use to hold the value of quantity of commodity
        double UnitPrice; //use to hold the value of unit price
        double AmounttobePaid = 1; //use to hold the value of the amount to be paid
        //promt the user to enter the commodity code
        System.out.print("Enter commodity code: ");
        //promt the user to accept input of the commodity code
        CommodityCode = input.nextLine();
        //promt the user to enter the value of quantity of commodity
        System.out.print("Enter quantity of commodity: ");
        //promt the user to accept input of the quantity of commodity
        QuantityofCommodity = keyIn.nextInt();
        //promt the user to enter the value of unit price
        System.out.print("Enter unit price: ");
        //promt the user to accept imput of the unit price 
        UnitPrice = keyIn.nextDouble();
        //evaluate commodity code and solve the amount to be paid
        
        switch (CommodityCode.charAt(0)) {
            case 'K':
                
                AmounttobePaid = (UnitPrice * 0.11 * QuantityofCommodity) + (QuantityofCommodity * UnitPrice);
                System.out.println("Amount to be paid is P"+ (Mat.hround(AmounttobePaid*100.0)/100.0));
                break;
                
            case 'J':
                
                AmounttobePaid = (QuantityofCommodity * UnitPrice) - (UnitPrice * 0.08 * QuantityofCommodity);
                System.out.println("Amount to be paid is P"+AmounttobePaid);
                break;
                
            case 'L':
                
                AmounttobePaid = QuantityofCommodity * UnitPrice;
                System.out.println("Amount to be paid is P"+AmounttobePaid);
                break;
                
            default:             
                System.out.println("Invalid Code");
                break;
        }
    }
}
    