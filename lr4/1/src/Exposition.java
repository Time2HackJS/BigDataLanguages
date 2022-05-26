import java.time.LocalDate;

public class Exposition {
    public class Art {
        final String name;
        final String author;
        final String date;
        
        Art(String name, String author, String date) {
            this.name = name;
            this.author = author;
            this.date = date;
        }
    }

    Art[] arts;
    String exhibitionDate;

    Exposition(Art[] arts, String exhibitionDate) {
        this.arts = arts;
        this.exhibitionDate = exhibitionDate;
    }

    Exposition(int artCount) {
        this.arts = new Art[artCount];
        this.exhibitionDate = LocalDate.now().toString();
    }
}
