import java.util.ArrayList;
import java.util.Random;

public class Provider extends Thread {
    public ArrayList<String> shopStock;

    final String[] items = {
        "Сухарики 3 корочки",
        "Чипсы Lays",
        "Чипсы Русская Картошка",
        "Coca-Cola",
        "Monster BLACK",
        "Балтика 9"
    };

    Provider(ArrayList<String> shopstock) {
        this.shopStock = shopstock;
    }

    @Override
    public void run() {
        Random random = new Random();

        try {
            while (true) {
                Thread.sleep(random.nextInt(2) * 1000 + 2000);
                shopStock.add(items[random.nextInt(items.length)]);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}
