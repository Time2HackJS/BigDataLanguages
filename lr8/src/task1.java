import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();

        Scanner in = new Scanner(System.in);
        
        while (true) {
            String line = in.nextLine();

            if (line.equals("stop")) {
                robot.stop();
                break;
            }
            else robot.walk(line.replaceAll("[ \n]", ""));
        }

        in.close();
    }
}
