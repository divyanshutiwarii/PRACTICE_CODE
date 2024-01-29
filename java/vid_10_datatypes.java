public class vid_10_datatypes {
    public static void main(String args[]){
        
        // int a = 19;
        // float x = 3.14f;
        // char c = 'A';

        // System.out.println(c+x);

        short s = 1;
        // byte b = 2;

        // System.out.println(a+s+b);
        System.out.println(s++); //POST INCREMENT (FIRST PRINT THEN INCREMENT)
        System.out.println(s);
        System.out.println(++s); //(PRE INCREMENT - FIRST INCREMENT THEN PRINT)


        //              --------------(SIMILARLY)--------------         \\

        System.out.println(s--); //POST DECREMENT (FIRST PRINT THEN INCREMENT)
        System.out.println(s);
        System.out.println(--s); //(PRE DECREMENT - FIRST INCREMENT THEN PRINT)

        char ch = 'A';
        ++ch;
        System.out.println(ch);
    }
}
