import java.util.Scanner;

public class PrintThreeNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first Input value");
        String a =  sc.nextLine();
        System.out.println("Enter a Second Input value");
        String b = sc.nextLine();
        System.out.println("Enter a Third Input value");
        String c = sc.nextLine();

        System.out.println(" \" "+"Hi"+" , "+c +" , "+ b +" ,and " + a+" ... " +" \" ");
    }
}
