import java.lang.String;
import java.util.Scanner;
public class practical10 {
    public static void print(char chararr[])
    {
        for(int m = 0;m<chararr.length; m++)
        {
            System.out.print(chararr[m]);
        }
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);

        String s;
        int n;
        System.out.println("Enter the string :");
        s =sc.nextLine();
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        char[] chararr = s.toCharArray();
        for(int i=chararr.length-1;i>=0;i--)
        {
            System.out.print(chararr[i]);
        }
        System.out.println();
        for(int i=0;i<chararr.length;i++)
        {
            for(int j=0;j<chararr.length-1;j++)
            {
                if(chararr[j]>chararr[j+1])
                {
                    char temp=chararr[j];
                    chararr[j]=chararr[j+1];
                    chararr[j+1]=temp;

                }
            }
        }
        print(chararr);
    } 
}