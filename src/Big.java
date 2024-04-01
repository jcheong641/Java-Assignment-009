import java.math.BigInteger;
public class Big {
    public static BigInteger factorial(int n) {
        BigInteger b = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            b = b.multiply(BigInteger.valueOf(i)); }
        return b;
    }
    public static void answerFactorial() {
        for (int i = 0; i <= 30; i++) {
            System.out.println(i + "! = " + factorial(i)); }
    }
    public static void main(String[] args) {
        answerFactorial();
    }
}