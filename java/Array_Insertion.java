import java.util.*;

public class Array_Insertion{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int newv;
    
    System.out.print("ENTER NUMBER OF ELEMENTS : ");
    int n = sc.nextInt();
        int Arr[]= new int[n];
        int Arrn[]= new int[n+1];

        System.out.print("\nENTER ELEMENTS : ");
        for(int i=0;i<n;i++)
        {
            Arr[i]=sc.nextInt();
        }
            System.out.print("\nENTER INDEX WHERE TO INSERT NEW VALUE : ");
            int newi = sc.nextInt();

            System.out.print("\nENTER NEW VALUE : ");
            newv = sc.nextInt();

            for(int i=0;i<n+1;i++){
                if(i<newi){
                    Arrn[i]=Arr[i];
                }
                else if (i==newi){
                    Arrn[i]=newv;
                }
                else{
                    Arrn[i]=Arr[i-1];
                }
            }
            System.out.print("\nTHE ELEMENTS ARE : ");
            for(int i=0;i<n+1;i++)
            {
            System.out.println(Arrn[i]);
            }
            sc.close();
        
    }
}