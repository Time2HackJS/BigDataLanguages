import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));

        System.out.println(Arrays.toString(list.stream().map(x -> x + "_task14").toArray()));
    }
}
