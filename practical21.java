class Degree{
    void getDegree(){
        System.out.println("I got a degree");
    }
}
class UnderGraduate extends Degree
{   @Override
    void getDegree(){
        System.out.println("I am undergraduate");
    }
}
class PostGraduate extends Degree{
    @Override
    void getDegree(){
        System.out.println("I am postgraduate");
    }
}
public class practical21 {
    public static void main(String[] args) {
        Degree d = new Degree();
        PostGraduate p = new PostGraduate();
        UnderGraduate u = new UnderGraduate();
        d.getDegree();
        p.getDegree();
        u.getDegree();
    }
    
}
