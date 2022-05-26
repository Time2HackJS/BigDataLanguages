import java.util.Objects;

public class Fractional {
    private MNumber denominator;
    private MNumber numerator;

    Fractional(MNumber numerator, MNumber denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double getValue() {
        return numerator.getValue() / denominator.getValue();
    }

    public double add(Fractional frac) {
        return this.getValue() + frac.getValue();
    } 

    public double sub(Fractional frac) {
        return this.getValue() - frac.getValue();
    }

    public double mul(Fractional frac) {
        return this.getValue() * frac.getValue();
    }

    public double div(Fractional frac) {
        return this.getValue() - frac.getValue();
    }

    public MNumber getDenominator() {
        return this.denominator;
    }

    public void setDenominator(MNumber denominator) {
        this.denominator = denominator;
    }

    public MNumber getNumerator() {
        return this.numerator;
    }

    public void setNumerator(MNumber numerator) {
        this.numerator = numerator;
    }

    public Fractional denominator(MNumber denominator) {
        setDenominator(denominator);
        return this;
    }

    public Fractional numerator(MNumber numerator) {
        setNumerator(numerator);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Fractional)) {
            return false;
        }
        Fractional fractional = (Fractional) o;
        return Objects.equals(denominator, fractional.denominator) && Objects.equals(numerator, fractional.numerator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominator, numerator);
    }

    @Override
    public String toString() {
        return "{" +
            " denominator='" + getDenominator() + "'" +
            ", numerator='" + getNumerator() + "'" +
            "}";
    }

}
