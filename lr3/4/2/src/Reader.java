public class Reader extends Person {
    String name;
    String surname;

    Reader(String name, String surname) {
        super(name, surname);
    }

    Order performOrder(Book book) {
        return new Order(book, this);
    }
}
