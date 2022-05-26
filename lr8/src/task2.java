import java.util.ArrayList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        ArrayList<String> stock = new ArrayList<String>();

        Shop shop = new Shop(stock);
        Provider provider = new Provider(stock);

        shop.start();
        provider.start();

        Scanner in = new Scanner(System.in);

        while (true) {
            String line = in.nextLine();

            if (line.equals("stop")) {
                shop.stop();
                provider.stop();
                System.out.println("Вы ушли из магазина. До скорой встречи!");
                break;
            }
            else if (line.equals("contents")) {
                System.out.println("В магазине есть: " + stock);
            }
            else if (line.startsWith("get")) {
                System.out.println("Вы купили: " + shop.getProduct(Integer.parseInt(line.split(" ")[1])));
            }
        }

        in.close();
    }
}
