import java.util.ArrayList;
import java.util.Scanner;

public class Lr3_4 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book(0, "Yes", "Me", 1999, 9000, 100, "Has one"));
        books.add(new Book(1, "No", "Elon Musk", 2000, 917, 100, "Skin"));
        books.add(new Book(2, "Maybe", "Joe Biden", 2021, 1235, 100, "Carton"));
        books.add(new Book(3, "50 shades of green", "Vladimir Putin", 2077, 512, 100, "Grass"));

        // A
        Scanner in = new Scanner(System.in);
        System.out.print("Enter author's name: ");
        String author = in.nextLine();

        for (Book book : books) {
            if (book.author.equals(author)) System.out.println(book.name);
        }

        // B
        // Никакого издательства в задании нет, поэтому просто сделал обложку
        System.out.print("Enter cover: ");
        String cover = in.nextLine();

        for (Book book : books) {
            if (book.cover.equals(cover)) System.out.println(book.name);
        }

        // C
        System.out.print("Enter year: ");
        int year = in.nextInt();

        for (Book book : books) {
            if (book.year > year) System.out.println(book.name);
        }

        in.close();
    }
}
