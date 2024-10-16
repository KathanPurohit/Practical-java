public class practical17{
    public static void main(String args[])
    {
        parent p = new parent();
        p.parentdisplay();
        children c = new children();
        c.childredisplay();
        System.out.println("Call from children class object.");
        c.parentdisplay();
    }

}
class parent
{
    void parentdisplay()
    {
        System.out.println("THIS IS PARENT CLASS.");
    }
}
class children extends parent
{
    void childredisplay()
    {
        System.out.println("this is the children class");
    }
}

