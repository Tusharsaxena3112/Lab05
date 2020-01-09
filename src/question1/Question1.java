package question1;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if ((a ^ b) == (a | b)) {
            System.out.println("Y");
        }
        else {
            System.out.println("Bye");
        }
    }
}
