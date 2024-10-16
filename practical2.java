import java.util.*;
import java.lang.String;
public class practical2 {
    public static void min(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0 ; j<arr.length-1 ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
       {
        System.out.println(arr[i]);
        }
    }
    public static void array(int arr[])
    {Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt(); 
            
        }
       
    } 
    public static void main(String args[])
    {
        int[] arr = new int[4];
        array(arr);
        min(arr);
       
    }
}
 