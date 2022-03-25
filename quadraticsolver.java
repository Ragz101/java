import java.util.Scanner;
import  java.lang.Math;

public class quadraticsolver{
    public  static void main (String[] args) {
        Scanner quad = new Scanner(System.in);
        System.out.println("ENTER A: ");
        double a = quad.nextDouble();
        if (a==0)
        {
            System.out.println(" The equation provided is NOT a quadratic equation");
        }
        System.out.println("ENTER B: ");
        double b = quad.nextDouble();
        System.out.println("ENTER C: ");
        double c = quad.nextDouble();
        double d = b*b-4*a*c;
        double dsrt = Math.sqrt(d);
        double r1,r2;
        if (d>0)
        {
           r1= (-b+dsrt)/2*a;
           r2= (-b-dsrt)/2*a;
           System.out.println("The roots of this equation are: " + r1 + "and" + r2);
        } 
        else if (d==0)
        {
            r1=-b/2*a;
            System.out.println("The roots of this equation are: "+ r1 );
        }
        else 
        {
            System.out.println("No real roots exist");
        }
        quad.close();

    }
}