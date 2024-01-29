import java.util.*;

public class pattern1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE VALUE : ");
        int n = sc.nextInt();

        for(int row = 1; row<=n;row++){
            for(int col = 1; col<=row;col++){
     
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n"); 
        }

        for(int row1 = 1; row1<=n;row1++){
        for(int col1 = 1; col1<=n-row1+1;col1++){
 
            System.out.print("*");
            System.out.print(" ");
        }
        System.out.print("\n"); 
    }

    // for(int row1 = 1;row1<=n;row1++){
        
    //     int space = n-1;
    //     while (space!=0) {
    //     System.out.print(" ");
    //     space = space - 1;
    //     }
    //     for(int col1 = 1; col1<=n-row1+1; col1++){
    //         System.out.print("*");
    //         System.out.print(" ");    
    // }
    // System.out.print("\n");

sc.close();
}
}
