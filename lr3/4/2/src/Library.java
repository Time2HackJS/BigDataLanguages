import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    ArrayList<Reader> blacklist;
    ArrayList<Order> orders;
    Administrator administrator;

    int daysToReturn;

    Library(ArrayList<Book> books, ArrayList<Reader> blacklist) {
        this.books = books;
        this.blacklist = blacklist;
        this.orders = new ArrayList<Order>();

        this.administrator = new Administrator("Elon", "Musk");
        this.daysToReturn = 30;
    }

    Book getOrder(Order order) {
        if (books.contains(order.book)) {
            if (!blacklist.contains(order.reader)) {
                this.books.remove(order.book);
                orders.add(order);

                return order.book;
            }
            else {
                System.out.println("This reader was banned from the library;");
                return null;
            }
        }
        else {
            System.out.println("Library don't have such books.");
            return null;
        }
    }

    void checkReturns() {
        LocalDate date = LocalDate.now();

        for (Order order : orders) {
            if (Duration.between(order.date, date).toDays() > daysToReturn) {
                this.administrator.banReader(order.reader, this);
            }
        }
    }
}