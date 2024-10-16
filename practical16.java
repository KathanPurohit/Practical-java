public class practical16{
    public static void main(String args[])
    {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);
        Complex sum = c1.Add(c2);
        System.out.println("Sum: " + sum.real + " + " + sum.imag + "i");
        Complex minus = c1.Sub(c2);
        System.out.println("Substract: " + minus.real + " + " + minus.imag + "i");
        Complex mul = c1.Multi(c2);
        System.out.println("Multiplication: " + mul.real + " + " + mul.imag + "i");
    }
}
class Complex{
    int real;
    int imag;
    Complex(int r, int i){
        real = r;
        imag = i;
    }
    Complex Add(Complex obj){
        Complex temp = new Complex(0,0);
        temp.imag = this.imag + obj.imag; 
        temp.real = this.real + obj.real;
        return temp;
    }
    Complex Sub(Complex obj){
        Complex temp = new Complex(0,0);
        temp.imag = this.imag - obj.imag; 
        temp.real = this.real - obj.real;
        return temp;
    }
       Complex Multi(Complex obj){
        Complex temp = new Complex(0,0);
        temp.imag = this.imag * obj.imag; 
        temp.real = this.real * obj.real;
        return temp;
    }
}
