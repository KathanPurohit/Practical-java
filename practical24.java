import java.util.Scanner;

public class practical24 {
    public static void main(String args[]){
        int x,y,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number x & y :");
        x = sc.nextInt();
        y = sc.nextInt();
        try{
            a = x/y;
        }
        catch(ArithmeticException e){
            System.out.println("Exception occoured" + e);
        }
        finally{
            a = x/y;
            System.out.println("Output : " + a);
        }
    }
}
