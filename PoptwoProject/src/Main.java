

import fraction.FractionImpl;

public class Main {

    public static void main(String[] args) {
// first test to see if the gcd is working and the new object is created.
        FractionImpl Fraction = new FractionImpl(8,-12);
        FractionImpl Fraction2 = new FractionImpl(30,40);
        FractionImpl Fraction3 = new FractionImpl(30,40);
        FractionImpl Fraction4 = new FractionImpl(1,2);
        FractionImpl Fraction5 = new FractionImpl(5,8);
        //FractionImpl Fraction6 = new FractionImpl(1,0);
        // exception thrown
        FractionImpl Fraction7 = new FractionImpl(2,10);
        FractionImpl Fraction8 = new FractionImpl(0,1);
        FractionImpl Fraction9 = new FractionImpl(3,10);

//        tests not working this way below? must fix.
        //Fraction3.add(Fraction2);

// TESTING taking a fraction in as a string.
        FractionImpl Fraction10 = new FractionImpl("   4/8       ");
        FractionImpl Fraction11 = new FractionImpl("   4/8");
        FractionImpl Fraction12 = new FractionImpl("14/8         ");
        //FractionImpl Fraction13 = new FractionImpl("14/0");
        //exception is thrown
        FractionImpl Fraction14 = new FractionImpl("1");


//  passed
        System.out.println(Fraction8.toString());
        System.out.println(Fraction.toString());
        System.out.println(Fraction);
        System.out.println(Fraction2);
        System.out.println(Fraction3);
//        Tests for string parameter fractions
        System.out.println(Fraction10);
        System.out.println(Fraction11);
        System.out.println(Fraction12);
        //System.out.println(Fraction13);
        System.out.println(Fraction14);


        //        Tests for add method

        System.out.println(Fraction3.add(Fraction2));
        System.out.println(Fraction4.add(Fraction5));
        System.out.println(Fraction7.add(Fraction8));
        System.out.println(Fraction7.add(Fraction9));
        System.out.println(Fraction7.add(Fraction9));



//                Tests for subtraction








    }
}

