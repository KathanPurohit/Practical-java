import java.util.Scanner;



import java.lang.String;
public class practical9 {
    public static void charat(String s)
    {
        for(int i=0;i<s.length();i++)
        { 
            System.out.print(s.charAt(i));
            System.out.print(s.charAt(i));
            
        }
    }
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);

        String s;
        int n;
        System.out.println("Enter the string :");
        s =sc.nextLine();
       charat(s);
    }
    }

