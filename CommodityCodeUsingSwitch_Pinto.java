/** 
 * @(#)CommodityCodeUsingSwitch_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 15/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/15
 */
import java.util.Scanner;
public class CommodityCodeUsingSwitch_Pinto {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

     
    double QuantityofCommodity; 
    double UnitPrice; 
    double AmounttobePaid = 1; 
    
    System.out.print("Enter commodity code: ");
    
    int CommodityCode = input.nextInt();
    
    
    
    switch (CommodityCode) {
        case 1:
            
    
            System.out.print("Enter quantity of commodity: ");
        
            QuantityofCommodity = input.nextInt();
        
            System.out.print("Enter unit price: ");
       
            UnitPrice = input.nextDouble();
            AmounttobePaid = (QuantityofCommodity * UnitPrice) - (UnitPrice * 0.15 * QuantityofCommodity);
            
            System.out.println("Amount to be paid is P"+ (Math.round(AmounttobePaid*100.0)/100.0));
            break;
            
        case 2:
            System.out.print("Enter quantity of commodity: ");
    
            QuantityofCommodity = input.nextInt();
        
            System.out.print("Enter unit price: ");
       
            UnitPrice = input.nextDouble();
            AmounttobePaid = (QuantityofCommodity * UnitPrice) + (UnitPrice * 0.12 * QuantityofCommodity);
            System.out.println("Amount to be paid is P"+(Math.round(AmounttobePaid*100.0)/100.0));
            break;
            
        case 3:
            System.out.print("Enter quantity of commodity: ");
    
            QuantityofCommodity = input.nextInt();
        
            System.out.print("Enter unit price: ");
       
            UnitPrice = input.nextDouble();
            AmounttobePaid = QuantityofCommodity * UnitPrice;
            System.out.println("Amount to be paid is P"+AmounttobePaid);
            break;
            
        default:             
            System.out.println("Invalid Code");
            break;
    }
}

}

