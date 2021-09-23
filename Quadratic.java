import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Quadratic {
    public static void main(String[] args) {
        double root1, root2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b ");
        double b = sc.nextDouble();

        System.out.println("Enter the value of c ");
        double c = sc.nextDouble();

        double determinant = (b*b)-(4*a*c);
        System.out.println(determinant);

        if(determinant>0){
            root1 = (-b + Math.sqrt(determinant))/(2*a);
            root2 = (-b - Math.sqrt(determinant))/(2*a);
            System.out.println("Roots are  "+ root1 +" and "+root2);
        }else if(determinant == 0){
            System.out.println("Root is : "+(-b + Math.sqrt(determinant))/(2*a));
        }
        else if( determinant < 0){
            System.out.println(" Roots are Imaginary");
        }
    }
}