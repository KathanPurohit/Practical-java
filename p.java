import java.util.*;
public class p
{
    public static void main(String []args)
    { float current_balance = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account number :");
        int acc_no = sc.nextInt();
        if(acc_no == 1234)
        {
            System.out.println("Your bank balance is : $"+current_balance);
        }
        else
        {
            System.out.println("Account don't exits");
        }
    }
}




