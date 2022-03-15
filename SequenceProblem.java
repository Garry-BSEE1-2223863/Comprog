  /** @ (#) SequenceProblem_Pinto.java 
     * Pinto_Garry Jr._ A.
     * BSEE-1
     * 09/03/2022
     * MW/10:30-1:30
     * @version 1.00 2022/03/09
    */
    import java.util.Scanner;
    
    public class SequenceProblem {
    	public static void main (String[] args){
    		Scanner kbd = new Scanner(System.in);
    		
    	System.out.print("Resistor Computation");
    	
    	System.out.print("Enter Resistor 1: ");
    		int num1 = kbd.nextInt();
    	System.out.print("Enter Resistor 2: ");
    		int num2 = kbd.nextInt();
    	System.out.print("Enter Resistor 3: ");
    		int num3 = kbd.nextInt();
    	System.out.print("Enter Resistor 4: ");
    		int num4 = kbd.nextInt();
    	System.out.print("Total Resistance");
    	
    	System.out.print("Series Connection: ");
    		int sum = num1+num2+num3+num4;
    	System.out.print("Parallel Connection: ");
    		int par = (1/num1)+(1/num2)+(1/num3)+(1/num4);
    	}
    		
    
}
