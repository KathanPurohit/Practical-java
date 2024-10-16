import java.util.*;
import java.lang.String;
public class practical7 {
    public static void stringsub(String s,int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.print(s.substring(0,3));
        }
    }
    public static void main(String args[])
    {   Scanner sc = new Scanner(System.in);

        String s;
        int n;
        System.out.println("Enter the string :");
        s =sc.nextLine();
        System.out.println("Enter the number of iteration :");
        n =sc.nextInt();
        stringsub(s,n);
    }
}
