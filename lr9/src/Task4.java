import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("c", "b", "a", "e", "d", "f", "g", "a", "b", "c", "c"));
        
        System.out.println(Arrays.asList(list.stream().distinct().sorted().toArray()));
    }
}
