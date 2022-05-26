public class ZeroPageCount extends Exception {
    public ZeroPageCount(int pageCount) {
        super(Integer.toString(pageCount));
    }
}
