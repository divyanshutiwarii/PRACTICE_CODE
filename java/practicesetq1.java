import java.util.*;

public class practicesetq1 {
    public static void main(String[] argsS){

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter First Number = ");
        int val1 = sc.nextInt();

        System.out.print("\nEnter Second Number = ");
        int val2 = sc.nextInt();

        System.out.print("\nEnter Third Number = ");
        int val3 = sc.nextInt();

        int sum = val1 + val2 + val3;

        System.out.print("\nSUM IS  = ");
        System.out.print(sum);

        sc.close();
    }
}
