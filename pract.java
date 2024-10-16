import java.util.*;
public class pract {
    static int sum;
    public static void main(String args[])
    {  Scanner sc = new Scanner(System.in);
         int[] month = new int[3];
         

         for(int i=0;i<=2;i++)
         {
            System.out.println("Enter your expence per day :"+("(")+(i+1)+(")"));
            month[i] = sc.nextInt();
             sum += month[i];
        }
        System.out.println("Your total expence are :"+ sum);
        
        } 

}

