import java.util.Scanner;

public class LearningMath1 {
/*
    public static void main(String[] args) {
        
        double x = 3.14;
        double y = -10;

        // Shows the maximum value
        double z = Math.max(x, y);

        System.out.println("z = " + z);


        // Shows the minimum value
        double u = Math.min(x, y);

        System.out.println("u = " + u);


        // Shows the value of a double value
        double q = Math.abs(y);

        System.out.println("q = " + q);

    } 

 */
   
/*
    public static void main(String[] args) {

        double x = 3.14;
        double y = 10;

        //
        double b = Math.sqrt(x);

        System.out.println(b);

        //
        double r = Math.round(y);

        System.out.println(r);

        //
        double c = Math.ceil(x);

        System.out.println(c);

        //        
        double f = Math.floor(y);

        System.out.println(f);


   }
} */

// Program that will find a Hypotenuse of a triangle
    public static void main(String[] args) {

        // We ask the user for side x and side y

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();
        
        z = Math.sqrt((x*x)+(y*y));
        
        System.out.println("The hypotenuse is: " + z);

        scanner.close();
        
    }
}
