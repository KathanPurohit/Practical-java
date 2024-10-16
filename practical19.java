import java.util.Scanner;

public class practical19 {
    public static void main(String args[])

    { Scanner sc =new Scanner(System.in);
           Rectangle[] shape = new Rectangle[10];
           System.out.println("Enter the 1 for rectangle and 2 for Square :");
        int r = sc.nextInt();
        
        switch(r)
        {
        case 1:
        for(int i=0;i<5;i++){
            
            System.out.println("Enter the length and breadth :");
            int l = sc.nextInt();
            int b = sc.nextInt();
            shape[i] = new Rectangle(l, b);
            shape[i].area();
            shape[i].perimeter(); 
        }
        break;
        case 2:
        for(int m=5;m<10;m++){
          
            System.out.println("Enter the side :");
            int s = sc.nextInt();
            shape[m] = new Square(s);
            shape[m].area();
            shape[m].perimeter(); 
        }
        break;
        }
    
       
    }
   
}
class Rectangle{
    int length;
    int breadth;
    Rectangle(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    void area()
    {
        System.out.println("Area :" + length*breadth);
    }
    void perimeter()
    {
        System.out.println("Perimeter :" + 2*(length+breadth));
    }
}
class Square extends Rectangle{

    Square(int side)
    {
        super(side,side);
    }
    @Override
    void area()
    {
        System.out.println("Area :" + length*breadth);
    }
    @Override
    void perimeter()
    {
        System.out.println("Perimeter :" + 2*(length+breadth));
    }
}
