import java.util.*;
public class pra{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance (in meters):");
        int d = sc.nextInt();
        System.out.println("Enter the time (in minutes):");
        int t = sc.nextInt();
        float timeInSeconds = t * 60;
        float ms = d / timeInSeconds;
        float km = (d / 1000.0f) / (t / 60.0f);
        float mls = (d / 1609.0f) / (t / 60.0f);
        System.out.println("The speed in Meters/second: " + ms + " m/s");
        System.out.println("The speed in Kilometers/hour: " + km + " km/h");
        System.out.println("The speed in Miles/hour: " + mls + " mile/h");
    }
}





