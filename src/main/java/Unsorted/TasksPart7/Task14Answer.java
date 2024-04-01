package Unsorted.TasksPart7;
import java.math.*;

public class Task14Answer {
    public static void main(String[] args) {
        final BigInteger TWO = new BigInteger("2");
        BigInteger bigNum = TWO;

        for (long p = 2; p <= 100; p++) {
            bigNum = bigNum.multiply(TWO);

            if (isPrime(bigNum.subtract(BigInteger.ONE))) {
                System.out.println(p + "\t" +
                        bigNum.subtract(BigInteger.ONE));
            }
        }
    }

    public static boolean isPrime(BigInteger num) {
        if (num.compareTo(BigInteger.ONE) == 0 ||
                num.compareTo(new BigInteger("2")) == 0) {
            return true;
        }

        BigInteger halfNum = num.divide(new BigInteger("2"));

        for (BigInteger divisor = new BigInteger("2");
             divisor.compareTo(halfNum) <= 0;
             divisor = divisor.add(BigInteger.ONE)) {
            if (num.remainder(divisor).equals(BigInteger.ZERO)) {
                return false;
            }
        }

        return true;
    }
}

