package fraction;

public class FractionImpl implements Fraction {
    private int numerator; // sets the numerator value of the fraction
    private int denominator; // sets the denominator value of the fraction

    // gives the lowest common denominator of 2 integer numbers
    public FractionImpl(int numerator, int denominator) {
        boolean negative = false;
        if (denominator == 0) {// throw an IllegalArgumentException if the denominator is zero
            throw new IllegalArgumentException("not possible to use denominator zero");
        }
        if (denominator < 0) {
            negative = true;
            denominator = denominator * -1;
        }
        int gcd = 1;
        for (int i = 1; i <= numerator && i <= denominator; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        if (negative == true) {

            this.numerator = numerator / gcd;
            this.denominator = denominator / gcd;
            this.numerator = this.numerator * -1;
        } else {
            this.numerator = numerator / gcd;
            this.denominator = denominator / gcd;
        }
    }
//        if (this.numerator > this.denominator){
//            int noWhole =
//            this.numerator = this.numerator % this.denominator;
//        }
    //converting top heavy fractions ? ?? COME BACK TO LATER

    //Takes and integer and creates the fraction value of this wholenumber
    public FractionImpl(int wholeNumber) {
        this.denominator = 1;
        this.numerator = wholeNumber;
    }

    //  takes a string version of a fractions and converts the string to integers
//   sets the vale for the numerator and denominator
//    removes all whites space from the string
//    throws and exception if the denominator is 0
    public FractionImpl(String fraction) {
        // takes in a string fraction and removes white spaces before and after characters
        String f = fraction.replace(" ", "");
        if (f.length() <= 2) {
            this.numerator = Integer.parseInt(f);
            this.denominator = 1;
            // if the string is less than 2 which includes negative numbers it will return the integer vale and assign to numerator
        }
        // otherwise splits the sting at / to give the numerator and denominator
        else {
            String[] fs = f.split("/", 3);
            this.numerator = Integer.parseInt(String.valueOf(fs[0]));
            this.denominator = Integer.parseInt(String.valueOf(fs[1]));
            if (this.denominator == 0) {// throw an IllegalArgumentException if the denominator is zero
                throw new IllegalArgumentException("not possible to use denominator zero");
            }
        }
    }

    /**
     * @inheritDoc
     */
    @Override
//    takes an object of type fraction and adds a fraction to this object
////    returning a new fraction object
    public Fraction add(Fraction f) {
        //
        int f_num = ((FractionImpl) f).numerator, f_denom = ((FractionImpl) f).denominator;

        numerator = (this.numerator) * f_denom + f_num * this.denominator;
        // Calculate denominator of the sum - bd
        denominator = this.denominator * f_denom;
        Fraction answer = new FractionImpl(numerator, denominator);

        return answer;
    }

    /**
     * @inheritDoc
     */
    @Override
//    takes an object of type fraction and substracts a fraction from this object
////    returning a new fraction object
    public Fraction subtract(Fraction f) {

        int f_num = ((FractionImpl) f).numerator, f_denom = ((FractionImpl) f).denominator;
        numerator = (this.numerator) * f_denom - f_num * this.denominator;
        denominator = (this.denominator * f_denom);

        Fraction answer = new FractionImpl(numerator, denominator);

        return answer;
    }

    /**
     * @inheritDoc
     */
    @Override
    //    takes an object of type fraction and multiply's a fraction to this object
//   returning a new fraction object
    public Fraction multiply(Fraction f) {

        int f_num = ((FractionImpl) f).numerator, f_denom = ((FractionImpl) f).denominator;
        numerator = (this.numerator) * f_num;
        denominator = (this.denominator) * f_denom;

        Fraction answer = new FractionImpl(numerator, denominator);

        return answer;
    }

    /**
     * @inheritDoc
     */
    @Override
    //    takes an object of type fraction and divides a fraction to this object
////    returning a new fraction object
    public Fraction divide(Fraction f) {

        int f_num = ((FractionImpl) f).numerator, f_denom = ((FractionImpl) f).denominator;
        numerator = (this.numerator * f_denom);
        denominator = (this.denominator * f_num);
        Fraction answer = new FractionImpl(numerator, denominator);
        return answer;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        int a;
        if (this.numerator < 0) {
            a = this.numerator * -1;
            Fraction absolute = new FractionImpl(a, denominator);
            return absolute;
        } else {
            return new FractionImpl(this.numerator, this.denominator);
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        int a;
        //if(this.numerator>0){
        a = this.numerator * -1;
        Fraction negateF = new FractionImpl(a, denominator);


        return negateF;
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
        if (obj == null){
            return false;
        }

        if (obj instanceof Fraction == false) {//if obj parameters do not match a Fraction object then return false
            return false;
        }
            // if the parametes do match with a Fraction object then compare the numerators and denominators.
        FractionImpl other = new FractionImpl(String.valueOf(obj));// converts obj to string so it can be passed and a new fraction created.
        return this.numerator == other.numerator && this.denominator
                 == other.denominator;

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
                FractionString =String.format("%d/%d",this.numerator,this.denominator);
            }
        }
        else{
            FractionString =String.format("%d",this.numerator);
        }

        return FractionString;
}
}
