import java.util.*;
 
public  class practical12 {
      public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your amount in pound :");
        int a=sc.nextInt();
        int b=Integer.parseInt(args[0]);
        int  ans = a*100;
        int  an = b*100;
        System.out.println("Your amount in rupess : " + ans);
        System.out.println("Your amount in rupess : " + an);
    }
}
