import java.text.DecimalFormat;
import java.util.Scanner;

public class DecisionControlStructureIFProblem_Pinto {
    public static void main(String[] args){
        Scanner kbl = new Scanner(System.in);
        char code = kbl.nextchar();
        if(code == K || code == J || code == L)
        System.out.print("Enter commodity code: "+code);
        else System.out.print("Invalid Code");
}
