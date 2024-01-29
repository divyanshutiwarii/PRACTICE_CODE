import java.util.*;
public class input_05 {
    public static void main(String[] args) {
        //TAKING INPUT FROM USER
        Scanner Sc = new Scanner(System.in);
        
        // System.out.print("ENTER THE VALUE OF A : ");
        // int a = Sc.nextInt();
        
        // System.out.print("ENTER THE VALUE OF B : ");
        // int b = Sc.nextInt();
        
        // System.out.print("ENTER THE STRING : ");
        // String str = Sc.next(); //THIS WILL READ ONLY FIRTST WORD, ANY WORD AFTER SPACE WILL
                                   //NOT BE PRINTED
        // System.out.print(str);
        
        System.out.print("ENTER THE STRING : ");
        String str = Sc.nextLine(); //BY USING "sc.nextLine" WILL PRINT THE WHOLE STATEMENT
        System.out.println(str);

        // boolean b1;
        // b1=Sc.hasNextInt();//THIS CHECKS WHETHER THE INPUT IS INTEGER TYPE OR NOT
        // System.out.println(b1);

        Sc.close();
    }
}
