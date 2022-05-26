import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Laba2_5 {
    public static void main(String[] args) throws IOException {
        String poem = Files.readString(Path.of("poem.txt"));

        int wordCount = 0;

        for (String word : poem.split(" ")) {
            if (word.matches("^[аеёиоуыэюяАУЁИОУЫЭЮЯ][а-яА-Я]*[аеёиоуыэюяАУЁИОУЫЭЮЯ]$|^[аеёиоуыэюяАУЁИОУЫЭЮЯ]$")) wordCount++;
        }

        System.out.println("В стихотворении найдено " + wordCount + " слов, подходящих под описание.");
    }
}
