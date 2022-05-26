import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Laba5_5 {
    public static void main(String[] args) throws IOException {
        String fileLocation = System.getProperty("user.dir") + "\\src\\" + args[0];
        String string = "";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileLocation)), "UTF-8"))) {
            string = br.readLine();
        } catch (Exception e) {
            System.out.println("File not found");
            System.exit(0);
        } 

        System.out.println(string);

        String maxSequence = "";
        String currentSequence = "";
        int maxSequenceLen = 0;;
        int currentLen = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                currentSequence += string.charAt(i);
                currentLen++;

                if (currentLen > maxSequenceLen) {
                    maxSequenceLen = currentLen;
                    maxSequence = currentSequence;
                }
            }
            else {
                currentLen = 0;
                currentSequence = "";
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        writer.write(maxSequence + "\n");
        writer.write("Sequence length:" + maxSequenceLen);
        writer.close();
    }
}
