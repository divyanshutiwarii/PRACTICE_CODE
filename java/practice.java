import java.util.*;

public class practice{
    public static void main(String[] args) {
        Scanner pi = new Scanner(System.in);

        System.out.print("ENTER YOUR NAME : ");
        String ch = pi.next();
        System.out.println(ch);

        System.out.println("ENTER YOUR OBJECTIVE : ");
        String ch1 = pi.nextLine();
        System.out.println(ch1);

        int a,b,sum;

        System.out.print("ENTER FIRST NUMBER : ");
        a = pi.nextInt();
        
        System.out.print("ENTER SECOND NUMBER : ");
        b = pi.nextInt();
        
        sum = a + b;
        
        System.out.print("THE SUM IS : ");
        System.out.println(sum);

        pi.close();
    }
}