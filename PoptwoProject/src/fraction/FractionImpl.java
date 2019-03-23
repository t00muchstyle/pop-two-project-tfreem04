package fraction;

public class FractionImpl implements Fraction {
    private int numerator; // sets the numerator value of the fraction
    private int denominator; // sets the denominator value of the fraction


    public  FractionImpl(int numerator, int denominator) {

        this.numerator = numerator;
        this.denominator = denominator;
        if (this.denominator ==0) {// throw an IllegalArgumentException if the denominator is zero
            throw new IllegalArgumentException("not possible to use denominator zero");
        }
        else {
            int gcd = 1;
            for (int i = 1; i <= this.numerator && i <= this.denominator; i++) {
                if (this.numerator % i == 0 && this.denominator % i == 0)
                    gcd = i;
            }
            this.numerator /= gcd;
            this.denominator /= gcd;
        }
        if (this.numerator == 0) {
            this.denominator = 1;
        }

    }
    /**
     * The parameter is the numerator and <pre>1</pre> is the implicit denominator.
     *
     * @param wholeNumber representing the numerator
     */
    public FractionImpl(int wholeNumber) {
        this.denominator = 1;

        this.numerator = wholeNumber;
        }

    /**
     * The parameter is a <pre>String</pre> containing either a whole number, such as `5` or `-3`, or a fraction,
     * such as "8/-12".
     * Allow blanks around (but not within) integers.
     * The constructor should throw an <pre>ArithmeticException</pre>
     * if given a string representing a fraction whose denominator is zero.
     * <p>
     * You may find it helpful to look at the available String API methods in the Java API.
     *
     * //@param fraction the string representation of the fraction
     */

    public FractionImpl(String fraction) {
        // takes in a string fraction and removes white spaces before and after characters
        String f = fraction.replaceAll("\\s+"," ");
        if (f.length() <=2){
            this.numerator = Integer.parseInt(f);
            this.denominator = 1;
            // if the string is less than 2 which includes negative numbers it will return the integer vale and assign to numerator
        }
        // otherwise splits the sting at / to give the numerator and denominator
        else{
            String [] fs = fraction.split("/");
            this.numerator = Integer.parseInt(f,0);
            this.denominator = Integer.parseInt(f,1  );
        }

        //System.out.printf("%s",toString(this.numerator,this.denominator));
//        String SFraction = "";
//        SFraction = toString(numerator,denominator);



    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {
        int a=this.numerator;
        int b=this.denominator;

        int f_num = ((FractionImpl) f).numerator, f_denom = ((FractionImpl) f).denominator;

       return null ;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * @inheritDoc
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction inverse() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(Fraction o) {
        return 0;
    }

    /**
     * @inheritDoc
     */
    //@Override

    public String toString() {
        // takes the numerator and denominator and returns the string values
        //checks if the denominator is 1
        String FractionString = "";
        if (this.denominator !=1){
            if (this.numerator >0) {
                 FractionString = String.format("%denominator/%denominator", this.numerator, this.denominator);
            }
            else if (this.numerator <0){
                FractionString =String.format("-%denominator",this.numerator);
            }
        }
        else{
            FractionString =String.format("%denominator",this.numerator);
        }

        return FractionString;
}
}
