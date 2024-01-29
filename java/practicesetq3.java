import java.text.DecimalFormat;
import java.util.Scanner;

public class practicesetq3 {
    public static void main(String[] args) {

        //PROGRAM TO CONVERT METER INTO KILOMETER 
        
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.000");
        System.out.print("ENTER KILOMETER VALUE : ");
        double km = sc.nextDouble();

        double miles = km*0.6213711922;

        System.out.print("\nIN MILES THE VALUE IS : ");
        System.out.print(df.format(miles) + " MILES ");
        
        
        //System.out.print("ENTER VALUE : ");
        //int a = sc.nextInt();

        // boolean b1;
        // b1 = sc.hasNextInt();
        // System.out.println(b1);

        sc.close();
    }
    
}
