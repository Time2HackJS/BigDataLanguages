import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laba3_4 {
    public static void main(String[] args) {
        String text = "Базаров был великий охотник до женщин и до женской красоты, но любовь в смысле идеальном, или, как он выражался, романтическом, называл белибердой, непростительною дурью, считал рыцарские чувства чем-то вроде уродства или болезни и не однажды выражал свое удивление: почему не посадили в желтый дом Тоггенбурга со всеми миннезингерами и трубадурами? «Нравится тебе женщина, — говаривал он, — старайся добиться толку; а нельзя — ну, не надо, отвернись — земля не клином сошлась». Одинцова ему нравилась: распространенные слухи о ней, свобода и независимость ее мыслей, ее несомненное расположение к нему — все, казалось, говорило в его пользу; но он скоро понял, что с ней «не добьешься толку», а отвернуться от нее он, к изумлению своему, не имел сил.";
        String patternStr = "[^.?!]*[?]";

        Pattern p = Pattern.compile(patternStr);
        Matcher m = p.matcher(text);

        ArrayList<String> words = new ArrayList<String>();

        while (m.find()) {
            String sent = m.group();
            System.out.println(sent);

            for (String word : sent.split(" ")) {
                word = word.replaceAll("[.?,]", "");
                if (!words.contains(word)) words.add(word);
            }
        }

        System.out.println(words);
    }
}
