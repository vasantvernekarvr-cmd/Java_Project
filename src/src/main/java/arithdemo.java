public class arithdemo {
    public static void main(String[] args) {
        int num= 67499;
        int sum = 0;

        sum = sum + (num % 10);
        num = num / 10;
        System.out.println(sum);
    }
}
