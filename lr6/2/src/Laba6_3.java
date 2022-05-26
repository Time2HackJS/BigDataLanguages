import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Laba6_3 {

    public static void main(String[] args) throws Exception {
        ArrayList<CustomObject> list = new ArrayList<CustomObject>();

        System.out.println();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(System.getProperty("user.dir") + "\\src\\objects.txt")), "UTF-8"))) {
            for (String line; (line = br.readLine()) != null;) {
                list.add(new CustomObject(line));
            }
        } catch (Exception e) {
            System.out.println("File does not exists");
            System.exit(0);
        } 

        System.out.println("Начальный список: " + list + "\n");

        Collections.sort(list, new Comparator<CustomObject>() {
            public int compare(CustomObject o1, CustomObject o2) {
                if (o1.hash == o2.hash) return 0;
                return o1.hash < o2.hash ? -1 : 1;
            }
        });

        System.out.println("Список после сортировки: " + list + "\n");

        for (CustomObject obj : new ArrayList<CustomObject>(list)) if (list.indexOf(obj) != list.lastIndexOf(obj)) list.remove(obj);
        System.out.println("Список после удаления одинаковых записей: " + list);
    }
}
