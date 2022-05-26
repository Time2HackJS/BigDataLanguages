import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 5. Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита, а среди них – количество слов с равным числом гласных и согласных букв. 

public class Task1_5 {
    public static void main(String[] args) {
        Pattern vowelPattern = Pattern.compile("[aeiouy]{1,1}");
        Pattern consPattern = Pattern.compile("[bcdfghjklmnpqrstvwxz]{1,1}");

        for (String arg : args) {
            if (arg.matches("^[a-zA-Z]{1,}$")) {
                Matcher vowelMatcher = vowelPattern.matcher(arg);
                Matcher consMatcher = consPattern.matcher(arg);

                Integer vowelCount = 0;
                Integer consCount = 0;

                while (vowelMatcher.find()) vowelCount++;
                while (consMatcher.find()) consCount++;
                
                if (vowelCount == consCount) System.out.println(arg);
            }
        }
    }
}
