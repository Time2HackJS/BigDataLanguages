import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Laba6_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        System.out.println();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(System.getProperty("user.dir") + "\\src\\file.txt")), "UTF-8"))) {
            for (String line; (line = br.readLine()) != null;) {
                list.add(line);
            }
        } catch (Exception e) {
            System.out.println("File not found");
            System.exit(0);
        } 

        System.out.println("Before sort: " + list);
        Collections.sort(list);
        System.out.println("After sort " + list);
    }
}
