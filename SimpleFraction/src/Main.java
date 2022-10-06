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
        assert f1.equals(f1.doubleValue());




    }
}