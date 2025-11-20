package t1;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        // String name = new String("Ramesh");
        Scanner scan = new Scanner(System.in); // enter
        // int age = Integer.parseInt(scan.nextLine());
        int age = scan.nextInt();
        System.out.println("Your age is "+(age+1));
    }
}
