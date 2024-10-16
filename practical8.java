import java.util.*;
public class practical8 {
    public static void search(int arr[])
    { int count=0;
        for(int m=0;m<arr.length;m++)
        {
            if(arr[m]==9)
            {
                count++;
            }
            
        }
        System.out.println("The number of 9 in the array are : " +count);
    }
    public static void main(String args[])
    {Scanner sc = new Scanner(System.in);
    
     System.out.println("Enter the size of array :");
     int n = sc.nextInt();
     int arr[]=new int[n] ;
     System.out.println("Enter the array:");
     for(int i=0;i<arr.length;i++)
     {
        arr[i]= sc.nextInt();
     }
     search(arr);

    } 
}
