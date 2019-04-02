package fraction;

public class FractionImpl implements Fraction {
    private int numerator; // sets the numerator value of the fraction
    private int denominator; // sets the denominator value of the fraction

    // gives the lowest common denominator of 2 integer numbers
    public FractionImpl(int numerator, int denominator) {
        boolean dnegative = false;
        boolean nnegative = false;
        if (denominator == 0) {// throw an IllegalArgumentException if the denominator is zero
            throw new IllegalArgumentException("not possible to use denominator zero");
        }
        if (denominator < 0) {//checks if denominator is less than 0
            dnegative = true;
            denominator = denominator * -1;
        }
        if(numerator <0) {
            nnegative = true;
            numerator = Math.abs(numerator);
        }
        int gcd = 1;
        for (int i = 1; i <= numerator && i <= denominator; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        this.numerator =numerator/gcd;
        this.denominator =denominator/gcd;
        if (numerator == denominator) {
            this.numerator = 1;
            this.denominator =1;
        }

        if (dnegative == true) {

            this.numerator = numerator / gcd;
            this.denominator = denominator / gcd;
            this.numerator = this.numerator * -1;
        }
        else if (nnegative == true) {
            this.numerator = numerator / gcd;
            this.denominator = denominator / gcd;
            this.numerator = this.numerator *-1;
        }
    }

    //Takes and integer and creates the fraction value of this whole number
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
        //get the fraction f denominator and numerator values
        int f_num = ((FractionImpl) f).numerator, f_denom = ((FractionImpl) f).denominator;

        int AnswerNum = (this.numerator) * f_denom + f_num * this.denominator;
        // Calculate denominator of the sum - bd
        int AnswerDen = this.denominator * f_denom;
        Fraction answer = new FractionImpl(AnswerNum, AnswerDen);

        return answer;
    }

    /**
     * @inheritDoc
     */
    @Override
//    takes an object of type fraction and subtracts a fraction from this object
////    returning a new fraction object answer
    public Fraction subtract(Fraction f) {

        int f_num = ((FractionImpl) f).numerator, f_denom = ((FractionImpl) f).denominator;

        // calculates the new numerator value
        int AnswerNum = (this.numerator) * f_denom - f_num * this.denominator;
        //calculates the new denominator value
        int AnswerDen = (this.denominator * f_denom);
//  returns the new fractions in its lowest form

        Fraction answer = new FractionImpl(AnswerNum, AnswerDen);



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
        //calculates the numerator value after multiplying
        int AnswerNum = (this.numerator) * f_num;

        //calculates the denominator after multiplying
        int AnswerDen = (this.denominator) * f_denom;

        Fraction answer = new FractionImpl(AnswerNum, AnswerDen);

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
        //calculates the numerator after dividing
        int AnswerNum = (this.numerator * f_denom);
        // calculates the denominator after dividing
        int AnswernumDen = (this.denominator * f_num);
        Fraction answer = new FractionImpl(AnswerNum, AnswernumDen);
        return answer;
    }

    /**
     * @inheritDoc
     */
    @Override

    // returns the absolute value of a fraction
    // turns a negative fraction positive by multiplying the numerator by -1.
    public Fraction abs() {
        int answerNum = this.numerator;
        int answerDen =this.denominator;
        if (this.numerator < 0) {
            answerNum = this.numerator * -1;
            answerDen= this.denominator;
            Fraction absolute = new FractionImpl(answerNum,answerDen);
            return absolute;
        } else {
            return new FractionImpl(answerNum, answerDen);
        }
    }

    /**
     * @inheritDoc
     */
    @Override

    // negates the fraction to the equivalent negative value by changing the sign of the numerator.
    // returns the negative version of the fraction

    public Fraction negate() {
        int answerNum;
        int answerDen= this.denominator;
        //if(this.numerator>0){
        answerNum = this.numerator * -1;
        Fraction negateF = new FractionImpl(answerNum, answerDen);


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
        int AnswerNum = this.numerator;
        int AnswerDen = this.denominator;
        temp = AnswerNum;
        AnswerNum = AnswerDen;
        AnswerDen = temp;
        return new FractionImpl(AnswerNum,AnswerDen);
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
            } else if (this.numerator == 0) {
                FractionString =String.format("0/1");

            }
        }
        else{
            FractionString =String.format("%d/%d",this.numerator,this.denominator);
        }

        return FractionString;
    }
}
