import java.util.*;
public class practa {
    public static void main(String args[])
    {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=2;i++)
        {
            System.out.println("Get array :");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<=2;i++)
        {
            System.out.println("Print arr "+arr[i]);
        }
        for(int i=0;i<=2;i++)
        {
            System.out.println("Get changed array :");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<=2;i++)
        {
            System.out.println("Print arr "+arr[i]);
        }

    }
}
