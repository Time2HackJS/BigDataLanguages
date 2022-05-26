import java.util.ArrayList;

// 4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.

public class Task1_4 {
    public static void main(String[] args) {
        int min = 99999999;
        String minWord = "";

        for (String word : args) {
            ArrayList<String> chars = new ArrayList<String>();

            for (String c : word.split("")) if (!chars.contains(c)) chars.add(c);

            if (chars.size() < min) {
                min = chars.size();
                minWord = word;
            }
        }

        System.out.println(minWord);
    }
}
