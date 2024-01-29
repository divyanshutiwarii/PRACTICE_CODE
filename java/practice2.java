import java.util.*;
public class practice2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter students name : ");
        String name = in.nextLine();

        System.out.print("\n****ENTER MARKS****\n");

        System.out.print("\nENTER MATHS MARKS : ");
        int math = in.nextInt();

        System.out.print("\nENTER SCIENCE MARKS : ");
        int science = in.nextInt();

        System.out.print("\nENTER ENGLISH MARKS : ");
        int english = in.nextInt();

        System.out.print("\nENTER HINDI MARKS : ");
        int hindi = in.nextInt();

        System.out.print("\nENTER SST MARKS : ");
        int sst = in.nextInt();

        int total = math + science + english + hindi + sst;

        System.out.print("\n\nSudent Name = ");
        System.out.print(name); 

        System.out.print("\n\nTotal Marks = ");
        System.out.print(total);

        int percentage = (total*100)/500;

        System.out.print("\n\nTotal percentage = ");
        System.out.print(percentage);
        
        if(total<250){
            System.out.println("FAIL");
        }
        else{
            System.out.println("\n\nPASS");
        }

        in.close();

    }
}
