import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laba2_4 {
    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        Pattern vowel = Pattern.compile("[aeiouy]");
        Pattern consonant = Pattern.compile("abcdfghjklmnpqrstvwxz");

        for (String sent : text.split("[.!?]")) {
            int vowelCount = 0;
            int consonantCount = 0;

            Matcher vMatcher = vowel.matcher(sent);
            Matcher cMatcher = consonant.matcher(sent);

            while (vMatcher.find()) {
                vowelCount++;
            }

            while (cMatcher.find()) {
                consonantCount++;
            }

            System.out.print("В предложении '" + sent + "' ");
            if (vowelCount > consonantCount) System.out.println("больше всего гласных букв.");
            else if (vowelCount < consonantCount) System.out.println("больше всего согласных букв.");
            else System.out.println("гласных и согласных букв поровну.");
        }
    }
}
