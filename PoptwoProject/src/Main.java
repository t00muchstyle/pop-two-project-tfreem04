

import fraction.FractionImpl;

public class Main {

    public static void main(String[] args) {
//// first test to see if the gcd is working and the new object is created.
//        FractionImpl Fraction = new FractionImpl(8, -12);
//        FractionImpl Fraction2 = new FractionImpl(30, 40);
//        FractionImpl Fraction3 = new FractionImpl(30, 40);
//        FractionImpl Fraction4 = new FractionImpl(1, 2);
//        FractionImpl Fraction5 = new FractionImpl(5, 8);
//        //FractionImpl Fraction6 = new FractionImpl(1,0);
//        // exception thrown
//        FractionImpl Fraction7 = new FractionImpl(2, 10);
//        FractionImpl Fraction8 = new FractionImpl(0, 1);
//        FractionImpl Fraction9 = new FractionImpl(3, 10);
//
//////        tests not working this way below? must fix.
////        //Fraction3.add(Fraction2);
////
////// TESTING taking a fraction in as a string.
//        FractionImpl FractionStr10 = new FractionImpl("   4/8       ");
//        FractionImpl FractionStr11 = new FractionImpl("   4/8");
//        FractionImpl FractionStr12 = new FractionImpl("14/8         ");
//        FractionImpl Fraction17 = new FractionImpl("2/3    ");
//        FractionImpl Fraction18 = new FractionImpl("                         100/     400");
//
//        //FractionImpl FractionStr13 = new FractionImpl("14/0");
//        //exception is thrown
//        FractionImpl FractionStr14 = new FractionImpl("1");
//        FractionImpl Fraction15 = new FractionImpl(2, 4);
//        FractionImpl Fraction16 = new FractionImpl(1, 4);
//
////  passed
//        System.out.println(Fraction8.toString());
        //System.out.println(FractionStr10.toString());
//        System.out.println(Fraction);
//        System.out.println(Fraction2);
//        System.out.println(Fraction3);
//
//        //Tests for string parameter fractions
        //System.out.println(FractionStr10);
        // System.out.println(FractionStr11);
//        System.out.println(FractionStr12);
//        // exception thrown System.out.println(FractionStr13);
//        System.out.println(FractionStr14);
//
//
//        //        Tests for add method
//
//        FractionImpl FractionAdd7 = new FractionImpl(2, 10);
//        FractionImpl FractionAdd8 = new FractionImpl(0,1);
//        FractionImpl FractionAdd9 = new FractionImpl(3,10);
//        FractionImpl FractionAdd5 = new FractionImpl(8,-12);
//        FractionImpl FractionAdd2 = new FractionImpl(20,40);
//        FractionImpl FractionAdd3 = new FractionImpl(20,40);
//        FractionImpl FractionAdd4 = new FractionImpl(1,2);
//
//        System.out.println(FractionAdd3.add(FractionAdd2));
//        System.out.println(FractionAdd4.add(FractionAdd5));
//        System.out.println(FractionAdd7.add(FractionAdd8));
//        System.out.println(FractionAdd7.add(FractionAdd9));
//        System.out.println(FractionAdd7.add(FractionAdd9));
////
//
//
////                Tests for subtraction
//        FractionImpl FractionSub7 = new FractionImpl(5,10);
//        FractionImpl FractionSub8 = new FractionImpl(1,1);
//        FractionImpl FractionSub9 = new FractionImpl(6,8);
//        FractionImpl FractionSub5 = new FractionImpl(8,-12);
//        FractionImpl FractionSub2 = new FractionImpl(30,40);
//        FractionImpl FractionSub3 = new FractionImpl(40,50);
//        FractionImpl FractionSub6 = new FractionImpl(1,2);
//
//        System.out.println(FractionSub3.subtract(FractionSub2));
//        System.out.println(FractionSub5.subtract(FractionSub6));
//
//        System.out.println(FractionSub7.subtract(FractionSub8));
//        System.out.println(FractionSub8.subtract(FractionSub9));
//
//        //                Tests for Multiply

//        FractionImpl FractionMul4 = new FractionImpl(6,8);
//        FractionImpl FractionMul3 = new FractionImpl(5,10);
//        FractionImpl FractionMul2 = new FractionImpl(1,1);
//        FractionImpl FractionMul1 = new FractionImpl(6,8);
//
//        System.out.println(FractionMul3.multiply(FractionMul2));
//        System.out.println(FractionMul1.multiply(FractionMul4));
//        System.out.println(FractionMul7.multiply(FractionMul9));
//        System.out.println(FractionStr10.multiply(FractionStr10));
//        System.out.println(Fraction17.multiply(Fraction16));

//        System.out.println(Fraction7.multiply(Fraction9));
//
//
//        //                Tests for Division
////
//        FractionImpl FractionDiv1 = new FractionImpl(7,8);
//        FractionImpl FractiondDiv2 = new FractionImpl(3,4);
//        FractionImpl FractiondDiv3 = new FractionImpl(9,10);
//        FractionImpl FractiondDiv4 = new FractionImpl(11,22);
//        FractionImpl FractiondDiv5 = new FractionImpl(34,87);
//        FractionImpl FractiondDiv6 = new FractionImpl(1,1);
//        FractionImpl FractiondDiv7 = new FractionImpl(1,1);
//
//
//        System.out.println(FractiondDiv3.divide(FractiondDiv2));
//        System.out.println(FractiondDiv5.divide(FractiondDiv4));
//        System.out.println(FractionDiv1.divide(FractiondDiv6));
//        System.out.println(FractionDiv1.divide(FractiondDiv7));
//       // System.out.println(Fraction17.divide(Fraction16));
//
//        // all tests passed
//
//
//////                        Tests for abs
//        FractionImpl FractionAbs1 = new FractionImpl(-12,2);
//        FractionImpl FractionAbs2 = new FractionImpl(-8,78);
//        FractionImpl FractionAbs3 = new FractionImpl(-12,5);
//        FractionImpl FractionAbs4 = new FractionImpl(-11,22);
//        FractionImpl FractionAbs5 = new FractionImpl(-34,87);
//        FractionImpl FractionAbs6 = new FractionImpl(-1,1);
//
//        System.out.println(FractionAbs1.abs());
//        System.out.println(FractionAbs2.abs());
//        System.out.println(FractionAbs3.abs());
//        System.out.println(FractionAbs4.abs());
//        System.out.println(FractionAbs5.abs());
//        System.out.println(FractionAbs6.abs());
//
//
//        //                Tests for negate

//        FractionImpl FractionNeg1 = new FractionImpl(12,2);
//        FractionImpl FractionNeg2 = new FractionImpl(8,78);
//        FractionImpl FractionNeg3 = new FractionImpl(12,5);
//        FractionImpl FractionNeg4 = new FractionImpl(11,22);
//        FractionImpl FractionNeg5 = new FractionImpl(34,87);
//        FractionImpl FractionNeg6 = new FractionImpl(1,1);
//
//
//        System.out.println(FractionNeg1.negate());
//        System.out.println(FractionNeg2.negate());
//        System.out.println(FractionNeg3.negate());
//        System.out.println(FractionNeg4.negate());
//        System.out.println(FractionNeg5.negate());
//        System.out.println(FractionNeg6.negate());
//
//        //                Tests for equals

//        FractionImpl FractionEquals1 = new FractionImpl(1,2);
//        FractionImpl FractionEquals2 = new FractionImpl(8,18);
//        FractionImpl FractionEquals3 = new FractionImpl(8,18);
//        FractionImpl FractionEquals4 = new FractionImpl(1,2);
//        FractionImpl FractionEquals5 = new FractionImpl(3,87);
//        FractionImpl FractionEquals6 = new FractionImpl(12,15);
//
//        System.out.println(FractionEquals1.equals(FractionEquals2));
//        System.out.println(FractionEquals1.equals(FractionEquals4));
//        System.out.println(FractionEquals5.equals(FractionEquals6));
//        System.out.println(FractionEquals3.equals(FractionEquals2));
//        System.out.println(FractionEquals5.equals(FractionEquals6));
//        System.out.println(FractionEquals5.equals(FractionEquals6));
//
//
        //                Tests for inverse
//
//        FractionImpl FractionInverse1 = new FractionImpl(1,2);
//        FractionImpl FractionInverse2 = new FractionImpl(8,18);
//        FractionImpl FractionInverse3 = new FractionImpl(3,4);
//
//        System.out.println (FractionInverse1.inverse());
//        System.out.println (FractionInverse2.inverse());
//        System.out.println (FractionInverse3.inverse());
//
        //                Tests for Compare to

//        FractionImpl FractionCompare1 = new FractionImpl(1,2);
//        FractionImpl FractionCompare2 = new FractionImpl(1,12);
//        FractionImpl FractionCompare3 = new FractionImpl(3,4);
//        FractionImpl FractionCompare4 = new FractionImpl(2,4);
//        FractionImpl FractionCompare5 = new FractionImpl(3,4);
//
//
//        System.out.println (FractionCompare1.compareTo(FractionCompare2));
//        System.out.println (FractionCompare2.compareTo(FractionCompare3));
//        System.out.println (FractionCompare2.compareTo(FractionCompare3));
//        System.out.println (FractionCompare4.compareTo(FractionCompare5));
//        System.out.println (FractionCompare3.compareTo(FractionCompare5));
////
//
////
    }}