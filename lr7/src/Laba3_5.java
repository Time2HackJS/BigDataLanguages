import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laba3_5 {
    public static void main(String[] args) {
        String text = "Вступив в рабочее движение в 70-х годах XIX века, Каутский вначале разделял взгляды, далёкие от марксизма. Затем он познакомился с Марксом и Энгельсом и стал сторонником их учения, хотя весьма непоследовательным. Маркс и Энгельс резко критиковали ошибки Каутского, его склонность к филистерству.'Экономическое учение Карла Маркса' - едва ли не самое известное из всего, что вышло из-под пера Каутского. Написанная в 1886 г., эта книга была, по свидетельству Каутского, просмотрена Энгельсом в рукописи. Особенность этой работы Каутского в том, что автор даёт здесь популярное изложение «Капитала» Маркса (главным образом в пределах первого тома), близко придерживаясь подлинника. Он широко цитирует Маркса. Но и там, где Каутский передаёт содержание 'Капитала', не прибегая к цитатам, он старается воспроизводить ход мысли Маркса, используя его аргументацию и даже художественные образы, оживляющие текст.";

        Matcher sentenceM = Pattern.compile("([^.?!]|(.,))*[.?!]").matcher(text);
        Pattern fWordP = Pattern.compile("[А-я]+");
        Pattern lWordP = Pattern.compile("[А-я]+.$");

        while (sentenceM.find()) {
            String sentence = sentenceM.group().toLowerCase();
            if (sentence.startsWith(" ")) sentence = sentence.substring(1);

            Matcher fWordM = fWordP.matcher(sentence);
            Matcher lWordM = lWordP.matcher(sentence);
            fWordM.find();
            lWordM.find();

            String firstWord = fWordM.group();

            String lastWord = lWordM.group();
            lastWord = lastWord.substring(0, lastWord.length() - 1);

            sentence = sentence.replaceFirst(lastWord, firstWord);

            lastWord = lastWord.substring(0, 1).toUpperCase() + lastWord.substring(1);
            sentence = sentence.replaceFirst(firstWord, lastWord); 

            System.out.println(sentence);
        }
    }
}
