import java.time.LocalDate;

public class Order {
    Book book;
    Reader reader;
    LocalDate date;

    Order(Book book, Reader reader) {
        this.book = book;
        this.reader = reader;

        this.date = LocalDate.now();
    }
}
