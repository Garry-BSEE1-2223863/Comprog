/** 
 * @(#)ThreeNumbersProblem_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 15/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/15
 */
import java.util.Scanner;
public class ThreeNumbersProblem_Pinto {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);

        System.out.print("Enter number x: ");
        int x = xyz.nextInt();
        System.out.print("Enter number y: ");
        int y = xyz.nextInt();
        System.out.print("Enter number z: ");
        int z = xyz.nextInt();

        if (x>y && x>z) System.out.println("The highest number is "+x);
            else if (z>y && z>x) System.out.println("The highest number is "+z);
            else if (y>x && y>z) System.out.println("The highest number is "+y);
        if (x<y && x>z) System.out.println("The median number is "+x);
            else if (y<x && y>z) System.out.println("The median number is "+y);
            else if (y>x && y<z) System.out.println("The median number is "+y);
            else if (x>y && x<z) System.out.println("The median number is "+x);
            else if (z<y && z>x) System.out.println("The median number is "+z);
            else if (z>y && z<x) System.out.println("The median number is "+z);
        if (x<y && x<z) System.out.println("The lowest number is "+x);
            else if (y<x && y<z) System.out.println("The lowest number is "+y);
            else if (z<y && z<x) System.out.println("The lowest number is "+z);

        if (x<y && x>z) System.out.println("The ascending order "+ z +" "+ x +" "+ y);
            else if (y<x && y>z) System.out.println("The ascending order "+ z +" "+ x +" "+ y);
            else if (y>x && y<z) System.out.println("The ascending order "+ x +" "+ y +" "+ z);
            else if (x>y && x<z) System.out.println("The ascending order "+ y +" "+ x +" "+ z);
            else if (z<y && z>x) System.out.println("The ascending order "+ x +" "+ z +" "+ y);
            else if (z>y && z<x) System.out.println("The ascending order "+ y +" "+ z +" "+ x);

    }
    
}
