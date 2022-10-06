public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Fraction f = new Fraction();
        assert "Je suis une fraction.".equals(f.toString());
        Fraction f1 = new Fraction(1,2);
        assert (f1.numerateur == 1 && f1.denominateur == 2) ;
        Fraction f2 = new Fraction(1);
        assert (f2.numerateur == 1 && f2.denominateur == 1);
        Fraction f3 = new Fraction();
        assert (f3.numerateur == 0 && f3.denominateur == 1);
        assert "0.5".equals(String.valueOf(f1.doubleValue()));
        Fraction f4 = new Fraction(5,2);
        Fraction f5 = (f1.addition(f4));
        assert "3.0".equals(String.valueOf(f5.doubleValue()));
        Fraction f6 = new Fraction(1,3);
        Fraction f7 = new Fraction(2,6);
        if (f6.equals(f7) == true) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Different");
        }

        Fraction f8 = new Fraction(1,3);
        Fraction f9 = new Fraction(1,7);
        System.out.println(f8.compareTo(f9));

        Number aNumber = java.math.BigDecimal.ONE;
        Number anotherNumber = new Fraction(1, 2);
        assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;


    }
}