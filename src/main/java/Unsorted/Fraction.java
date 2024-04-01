package Unsorted;

public class Fraction {
    private final int dividend;
    private final int divisible;

    public Fraction(int dividend , int divisible) throws NullDenominatorException {
            this.dividend = dividend;
            if ( divisible == 0) {
                throw new NullDenominatorException("деление на 0!");
            }
            this.divisible = divisible;
    }
    @Override
    public String toString(){
        return dividend + "/" + divisible;
    }
}
