package TasksPart7;

import java.math.BigInteger;

public class Task14 {
    public static void main(String[] args) {
        System.out.println("p \t 2^p - 1");
        System.out.println("--------------------");
        for (int p = 2; p<=100; p++){
            BigInteger bigInteger = BigInteger.TWO;
            BigInteger result = bigInteger;
            for (int i = 0 ; i < p - 1 ; i++){
                result = result.multiply(bigInteger);
            }
            result = result.subtract(new BigInteger("1"));
            System.out.println(p + " \t " + result);
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
