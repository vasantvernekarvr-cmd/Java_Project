public class ReverseNumber {
    public static void main(String[] args) {

        int num= 342;
        int rev= 0;

        rev= (num % 10) * 100 + ((num/10)%10)* 10+ (num/100);

        System.out.println(rev);
    }
}
