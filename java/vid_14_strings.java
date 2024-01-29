public class vid_14_strings {
    public static void main(String args[]) {
       
        String name = "DIVYANSHU";
        System.out.println(name);
        
        //TO FIND THE LENGTH OF THE STRING
        int length = name.length();
        System.out.println(length);
        
        //TO CONVERT THE STRING IN LOWER CASE
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        
        //TO CONVERT THE STRING IN UPPER CASE
        String Ustring = name.toUpperCase();
        System.out.println(Ustring);
        
        //TO TRIM THE SPACES BETWEEN THE STRING
        String nontrimmedstring = "            divyanshu              ";
        System.out.println(nontrimmedstring);
        nontrimmedstring = nontrimmedstring.trim();
        System.out.println(nontrimmedstring);

        //THE .substring() is used to print the string from the given index number
        System.out.println(name.substring(2));

        //THE .substring() is used to print the string from the given STARTING
        //index number TO END index number
        //THE INDEX NUMBER STARTS FROM 0
        System.out.println(name.substring(2,8));

        //THIS WILL CHANGE THE OLD CHARACTER WITH GIVEN NEW CHARACTER
        System.out.println(name.replace('D','c'));

        //THIS WILL REPLACE THE TATGETED STRING INTO NEW STRING
        System.out.println(name.replace("DIV","ABC"));

        //THIS RETURNS TRUE IF THE NAME STARTS WITH THE GIVEN STRING OR CHAR
        //ELSE RETURNS FALSE
        System.out.println(name.startsWith("DIV"));
        System.out.println(name.endsWith("D"));

        //THIS RETURNS THE RESPECTED INDEX VALUE
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));

        //THIS RETURNS THE INDEX NO. OF THE CHARACTER
        System.out.println(name.indexOf("N"));

        //THIS RETURNS THE INDEX NO. FROM GIVEN POSITION i.e. STARTS THE SEARCH FROM A GIVEN 
        //STARTING POINT
        String modifiedname = "DIVDIVYANSHU";
        System.out.println(modifiedname.indexOf("D",1));


        




        


    }
}
