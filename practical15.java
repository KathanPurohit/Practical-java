import java.util.*;

class Area 
{
    float length;
    float breadth;
    Area(float length,float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public float Return()
    {
        float area = this.length * this.breadth;
        return area;
    }
}
public class practical15
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float l,b;
        System.out.println("Enter the length : ");
        l=sc.nextFloat();
        System.out.println("Enter the breadth : ");
        b=sc.nextFloat();
        Area a = new Area(l, b);
        System.out.println(a.Return());
   
    }
}
  
