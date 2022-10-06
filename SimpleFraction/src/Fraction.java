
public class Fraction extends Number {
    public int numerateur;
    public int denominateur;

    public static final Fraction ZERO = new Fraction(0,1);
    public static final Fraction UN = new Fraction(1,1);

    public Fraction(int numerateur,int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }
    public Fraction(int numerateur) {
        this.numerateur = numerateur;
        this.denominateur = 1;
    }
    public Fraction() {
        this.numerateur = 0;
        this.denominateur = 1;
    }

    public int getNumerateur () {
        return this.numerateur;
    }

    public int getDenominateur () {
        return this.denominateur;
    }
@Override
    public double doubleValue () {

        return (double)numerateur / (double)denominateur;
    }

    public Fraction addition (Fraction frac1) {
        Fraction somme;
        if (denominateur == frac1.denominateur) {
            somme = new Fraction(frac1.numerateur+numerateur,denominateur);
        }
        else {
            int den = this.getDenominateur() * frac1.getDenominateur();
            int num = this.getNumerateur() * frac1.getDenominateur() + frac1.getNumerateur() * this.getDenominateur();
            somme = new Fraction(num,den);
        }
        return somme;
    }
    @Override
    public boolean equals (Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (getClass() != other.getClass()) {
            return false;
        }
        Fraction rhs = (Fraction)other;
        if (this.doubleValue() == rhs.doubleValue()) {
            return true;
        }
        else {
            return false;
        }
    }

    public int compareTo(Fraction object) {
        if(this.doubleValue()> object.doubleValue()) {
            return 1;
        } else if (this.doubleValue()< object.doubleValue()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    void print() {
        System.out.println(numerateur + "/" + denominateur);
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public long longValue() {
        return (long)doubleValue();
    }
    @Override
    public int intValue() {
        return (int)doubleValue();
    }
    @Override
    public String toString() {

        return "Je suis une fraction.";
    }
}
