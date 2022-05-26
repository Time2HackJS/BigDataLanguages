import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Laba5_5 {
    static String parseType(String smth) {
        try {
            Integer.parseInt(smth);
            return "Integer";
        } catch(Exception a){   
            //System.out.println(smth + "is not double");
            try {
                Double.parseDouble(smth);
                return "Double";
            } catch (Exception b) {
                //System.out.println(smth + "is not integer");
                return smth.length() == 1 ? "Char" : "String";
            }
        }  
    }

    public static void main(String[] args) {
        String fileLocation = System.getProperty("user.dir") + "\\src\\";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileLocation + "pile.txt")), "UTF-8"))) {
            
            String line = br.readLine();
            //System.out.println(line);
            for (String smth : line.split(" ")) {
                String type = parseType(smth);
                //System.out.println(smth + " is a " + type);

                if (type.equals(args[0])) {
                    System.out.print(smth + " ");
                }
            }
        } catch (Exception e) {
            System.exit(0);
        } 
    }
}
