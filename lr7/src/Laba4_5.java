import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laba4_5 {
    public static void main(String[] args) {
        String text = "zzzzzxxxxxxxxxxccccccccccaaaaaaaaaabbbbbbbbbaaaaabbbb";

        Pattern pattern = Pattern.compile("(.)\\1+");

        System.out.println("Исходный текст: " + text);

        for (Matcher mat = pattern.matcher(text); mat.find(); pattern.matcher(text)) {
            String substr = mat.group();

            text = text.replace(substr, String.valueOf(substr.charAt(0)));
        }

        System.out.println("Итоговый текст: " + text);
    }
}
