import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laba4_4 {
    public static void main(String[] args) {
        String text = "aaaaazzzzzzaaazzzaammaaaazzmzzzzmzaaaaa";

        Matcher matcher = Pattern.compile(args[0] + ".*" + args[1]).matcher(text);
        matcher.find();

        System.out.println("Text before: " + text);

        text = text.replace(matcher.group(), "");
        System.out.println("Text after: " + text);
    }
}
