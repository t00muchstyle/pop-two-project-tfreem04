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
//        if (this.numerator > this.denominator){
//            int noWhole =
//            this.numerator = this.numerator % this.denominator;
//        }
        //converting top heavy fractions ? ?? COME BACK TO LATER
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
        else {
            String[] fs = fraction.split("/");
            this.numerator = Integer.parseInt(f, 0);
            this.denominator = Integer.parseInt(f, 1);
            if (this.denominator == 0) {// throw an IllegalArgumentException if the denominator is zero
                throw new IllegalArgumentException("not possible to use denominator zero");
            }
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {
        //
        int f_num = ((FractionImpl) f).numerator, f_denom = ((FractionImpl) f).denominator;

        numerator = (this.numerator)*f_denom + f_num*this.denominator;
        // Calculate denominator of the sum - bd
        denominator = this.denominator*f_denom;

        Fraction answer = new FractionImpl(numerator, denominator);
        return answer;
    }
    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {

        int f_num = ((FractionImpl) f).numerator, f_denom = ((FractionImpl) f).denominator;
        numerator = (this.numerator*f_denom) - (f_num * denominator);
        denominator=(this.denominator *f_denom)-(f_denom*this.denominator);

        Fraction answer = new FractionImpl(numerator,denominator);

        return answer;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {

        int f_num = ((FractionImpl) f).numerator, f_denom = ((FractionImpl) f).denominator;
        numerator = (this.numerator*f_num);
        denominator = (this.denominator*f_denom);

        Fraction answer = new FractionImpl(numerator, denominator);

        return answer;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {

        int f_num = ((FractionImpl) f).numerator, f_denom = ((FractionImpl) f).denominator;
        numerator = (this.numerator*f_denom);
        denominator=(this.denominator*f_num);
        Fraction answer = new FractionImpl(numerator, denominator);
        return answer;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        int a;
        if (this.numerator <0){
            a = this.numerator * -1;
            Fraction absolute = new FractionImpl(a, denominator);
            return absolute;
        }
        else{
            return new FractionImpl(this.numerator,this.denominator);
        }
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
        int temp;
        temp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = temp;
        return new FractionImpl(this.numerator,this.denominator);
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
                 FractionString = String.format("%d/%d", this.numerator, this.denominator);
            }
            else if (this.numerator <0){
                FractionString =String.format("-%d",this.numerator);
            }
        }
        else{
            FractionString =String.format("%d",this.numerator);
        }

        return FractionString;
}
}
