package swap;

public class SwaptoNumbersWithoutUsingThird {
    public static void main(String[] args) {
        int a =20;
        int b=30;

        a= a + b;
        b= a - b;
        a= b - a;

        System.out.println(
                "Swap the number, "  + "a is " + a + " and b is " +b);
    }

}
