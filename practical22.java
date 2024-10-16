interface Advancearitmatic{
    
   public int divisor_sum(int  n);
}
class MyCalculater implements Advancearitmatic{
    int m;
    int sum = 0;
    @Override
    public int divisor_sum(int n) {
        for (int i = 1; i<=n; i++ ){
          
            if(n%i == 0)
            {
                sum += i;
            }
        }
        return sum;
    }
}
public class practical22 {

    public static void main(String[] args) {
        MyCalculater m1 = new MyCalculater();
        int r = 6;
        System.out.println("the sum of the divisor : " + m1.divisor_sum(r));
        int o = 25;
        System.out.println("the sum of the divisor : " + m1.divisor_sum(o));
        int p = 12;
        System.out.println("the sum of the divisor : " + m1.divisor_sum(p));
    }
}
