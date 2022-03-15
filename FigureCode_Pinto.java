/**
 * @(#)FigureCode_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 15/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/15
 */
import java.util.Scanner;
public class FigureCode_Pinto {
    public static void main(String[] args){
        int choice;
        double area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Menu: Compute Area of ");
        System.out.println("1. Trapezoid");
        System.out.println("2. Ellipse");
        System.out.println("3. Equilateral Triangle");

        System.out.print("Choice: ");
        choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Trapezoid");

                System.out.print("Enter h: ");
                int h = sc.nextInt();

                System.out.print("Enter b1: ");
                int b1 = sc.nextInt();

                System.out.print("Enter b2: ");
                int b2 = sc.nextInt();

                area = (h/2.0)*(b1+b2);
                area = (double)Math.round(area*100)/100;

                System.out.print("Area of Trapezoid is "+ area);
                break;

            case 2:
                System.out.println("Ellipse");

                System.out.print("Enter r1: ");
                int r1 = sc.nextInt();

                System.out.print("Enter r2: ");
                int r2 = sc.nextInt();

                area = Math.PI * ( r1 * r2 );
                area = (double)Math.round(area*100)/100;

                System.out.print("Area of Trapezoid is "+ area);
                break;

            case 3:
                System.out.println("Equilateral Triangle");

                System.out.print("Enter a: ");
                int a = sc.nextInt();

                area = (Math.sqrt(3) * a * a)/4.0;;
                area = (double)Math.round(area*100)/100;

                System.out.print("Area of Equilateral Triangle is "+ area);
                break;
            
            default:
                System.out.println("Wrong Choice");
        }
        
        
    }
    
}
