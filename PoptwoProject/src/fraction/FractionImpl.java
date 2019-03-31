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
////    returning a new fraction object answer
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
//   returning a new fraction object answer
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
//    returning a new fraction object answer
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

    // returns the absolute value of a fraction
    // turns a negative fraction positive by multiplying the numerator by -1.
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

    // negates the fraction to the equivalent negative value by changing the sign of the numerator.
    // returns the negative version of the fraction

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
    // equals method takes an object as the parameter
    // and checks to see if the object has the say parameters as fraction
    //if so it check to see if the value of each object matches.
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

    // inverse uses an instance of fraction and swaps the numerator with the denominator to return an inverse of the object.
    //
    public Fraction inverse() {
        // a temp value is created to make the switch
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

    //This method returns:
    //A negative int if this is less than o.
    //Zero if this is equal to o.
    //A positive int if this is greater than o.
    public int compareTo(Fraction o) {

        int comp ;
        // if the parameters do match with a Fraction object then compare the numerators and denominators.
        FractionImpl CompareOther = new FractionImpl(String.valueOf(o));// converts obj to string so it can be passed and a new fraction created.
        if (this.denominator < CompareOther.denominator){
        comp= 1;}
        else if(this.numerator == CompareOther.numerator && this.denominator
                == CompareOther.denominator) {
            comp = 0;
        }
        else{
            comp=-1;
        }
        return comp;
    }

    /**
     * @inheritDoc
     */
    //@Override
    //returns the string version of a fraction obj
    public String toString() {
        // uses the numerator and denominator and returns the string values
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
