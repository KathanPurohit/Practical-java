class Shape{
    void displayS(){
        System.out.println("This is shape");
    }
}
class Rectangle extends Shape{
   
    void displayR()
    {
        System.out.println("This is rectangle shape");
    }
}
class Circle extends Shape{
   
    void displayC()
    {
        System.out.println("This is circular shape");
    }
}
class Square extends Rectangle{
 
    void displaysq()
    {
        System.out.println("Square is a rectangle");
    }
}
public class practical20 {
    public static void main(String args[]){
        Square s = new Square();
        s.displayS();
        s.displayR();
        s.displaysq();
    }
    }
  
