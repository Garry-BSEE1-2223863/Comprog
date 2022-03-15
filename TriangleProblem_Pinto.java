/** 
 * @(#)TriangleProblem_Pinto.java
 * Pinto, Garry Jr., A.
 * BSEE-1
 * 15/03/2022
 * 2992-COMPROG MW 10:30-1:30
 * @version 1.00 2022/03/15
 */
import java.util.Scanner;
public class TriangleProblem_Pinto {
    public static void main(String[] args){
        Double A;
        Double s;
        Double rins;
        Double rcirc;
        Double arins;
        Double arcirc;
        Scanner tri = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangle");
        System.out.print("Enter side a: ");
        int a = tri.nextInt();
        System.out.print("Enter side b: ");
        int b = tri.nextInt();
        System.out.print("Enter side c: ");
        int c = tri.nextInt();

        
        s = (a+b+c)/2.0;
        A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        rins = A/s;
        rcirc = (a*b*c)/(4*A);
        arins = Math.PI*Math.pow(rins, 2);
        arcirc = Math.PI*Math.pow(rcirc, 2); 
        System.out.println("The area of the triangle is "+ A);
        System.out.println("The area of the largest inscribe circle is "+ arins);
        System.out.println("The area of the largest circumscribed circe is "+ arcirc);
    }
    
}
