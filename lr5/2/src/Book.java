import java.util.Objects;

public class Book {
    int id;
    String name;
    String author;
    int year;
    int pageCount;
    int price;
    String cover;

    public Book(int id, String name, String author, int year, int pageCount, int price, String cover) throws NegativeYearException, ZeroPageCount {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
        this.cover = cover;

        if (year < 0) throw new NegativeYearException(year);
        if (pageCount <= 0) throw new ZeroPageCount(pageCount);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCover() {
        return this.cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return id == book.id && Objects.equals(name, book.name) && Objects.equals(author, book.author) && year == book.year && pageCount == book.pageCount && price == book.price && Objects.equals(cover, book.cover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, year, pageCount, price, cover);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", author='" + getAuthor() + "'" +
            ", year='" + getYear() + "'" +
            ", pageCount='" + getPageCount() + "'" +
            ", price='" + getPrice() + "'" +
            ", cover='" + getCover() + "'" +
            "}";
    }

}
