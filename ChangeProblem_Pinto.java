/** 
 * @(#)ChangeProblem_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 15/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/15
 */
import java.util.Scanner;
public class ChangeProblem_Pinto {
    public static void main(String[] args){
        Scanner cha = new Scanner(System.in);

        System.out.print("Enter the purchases which is less than 100: ");
        int pur = cha.nextInt();

        int change = 100- pur;
        System.out.println("Your change is "+ change);

        System.out.println("Breakdown of Change:");
        int ch1 = change/50;
        System.out.println("P50: "+ ch1);
        int ch2 = (change%50)/20;
        System.out.println("P20: "+ ch2);
        int ch3 = ((change%50)%20)/10;
        System.out.println("P10: "+ ch3);
        int ch4 = (((change%50)%20)%10)/5;
        System.out.println("P5: "+ ch4);
        int ch5 = ((((change%50)%20)%10)%5)/1;
        System.out.println("P1: "+ ch5);

    }


}
