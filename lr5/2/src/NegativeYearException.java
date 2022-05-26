public class NegativeYearException extends Exception {
    public NegativeYearException(int year) {
        super(Integer.toString(year));
    }
}
