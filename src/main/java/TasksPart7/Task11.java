package TasksPart7;

import java.math.BigInteger;

public class Task11 {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger("10000000000000000000000000000000000000000000000000");
        bigNum = bigNum.add(BigInteger.ONE);
        System.out.println("\\" + bigNum);
        int count = 1;
        while (count<=10){
            if(bigNum.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
                    bigNum.remainder(new BigInteger("3")).equals(BigInteger.ZERO)){
                System.out.println(bigNum);
                count++;
            }
            bigNum = bigNum.add(BigInteger.ONE);
        }
    }

}
