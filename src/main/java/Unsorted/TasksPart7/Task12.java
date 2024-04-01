package Unsorted.TasksPart7;

import java.math.BigInteger;

public class Task12 {
    public static void main(String[] args) {
        final BigInteger MAXLONG = new BigInteger(Long.MAX_VALUE + "");
        int count = 0;
        BigInteger bigInteger = new BigInteger((long)Math.sqrt(Long.MAX_VALUE) + "");
        System.out.println(MAXLONG);
        while (count < 10){
            if(bigInteger.multiply(bigInteger).compareTo(MAXLONG) > 0){
                System.out.println(bigInteger.multiply(bigInteger));
                count++;
            }
            bigInteger = bigInteger.add(BigInteger.ONE);
        }
    }
    /*9223372037000250000
9223372043074251001
9223372049148252004
9223372055222253009
9223372061296254016
9223372067370255025
9223372073444256036
9223372079518257049
9223372085592258064
9223372091666259081
*/
}
