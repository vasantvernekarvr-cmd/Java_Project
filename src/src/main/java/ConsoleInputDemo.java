
import java.util.Scanner;

public class ConsoleInputDemo {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("provide number : ");
        int num = console.nextInt();

        int rem = num % 10;
        int div = num / 10;

        System.out.println(rem + div);

    }
}
