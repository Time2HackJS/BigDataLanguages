import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Laba5_4 {
    public static void main(String[] args) throws IOException {
        String fileLocation = System.getProperty("user.dir") + "\\src\\" + args[0];
        ArrayList<String> list = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileLocation)), "UTF-8"))) {
            for (String line; (line = br.readLine()) != null;) {
                list.add(line);
            }
        } catch (Exception e) {
            System.out.println("File not found");
            System.exit(0);
        } 

        String string = "";

        for (String word : list) {
            String fWord = word.toLowerCase();
            if (fWord.charAt(0) == fWord.charAt(fWord.length() - 1)) {
                string += word + " ";
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        writer.write(string);
        writer.close();
    }
}
