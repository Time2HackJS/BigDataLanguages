import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.file.Files;

public class Laba5_4 {
    public static void main(String[] args) throws Exception {
        String fileLocation = System.getProperty("user.dir") + "\\src\\";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation + "out.txt"));

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileLocation + "students.txt")), "UTF-8"))) {
            for (String line; (line = br.readLine()) != null;) {
                String[] splitLine = line.split(":");

                String student = splitLine[0];
                String[] stringScores = splitLine[1].split(" ");
                double sumScores = 0.0;

                for (String score : stringScores) {
                    int numScore = Integer.parseInt(score);
                    sumScores += numScore;
                }

                sumScores /= stringScores.length;

                if (sumScores > 7.0) {
                    student = student.substring(0, 1).toUpperCase() + student.substring(1);
                }

                writer.write(student + ":" + String.join(" ", stringScores) + "\n");
            }
        } catch (Exception e) {
            System.out.println("File not found");
            System.exit(0);
        } 

        writer.close();

        Files.delete(new File(fileLocation + "students.txt").toPath());
        new File(fileLocation + "out.txt").renameTo(new File(fileLocation + "students.txt"));
    }
}
