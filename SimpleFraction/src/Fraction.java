public class Fraction {
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

    public double doubleValue () {
        return (double)numerateur / (double)denominateur;
    }
    @Override
    public String toString() {
        return "Je suis une fraction.";
    }
}
