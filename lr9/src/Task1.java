import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));

        System.out.println(Arrays.toString(list.stream().sorted(Collections.reverseOrder()).toArray()));
    }
}
