import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));

        System.out.println(Arrays.toString(list.stream().filter(x -> list.indexOf(x) == list.size() - 1 || list.indexOf(x) == 3).toArray()));
    }
}
