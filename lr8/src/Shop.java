import java.util.ArrayList;

public class Shop extends Thread {
    final ArrayList<String> stock;
    int stockCount;

    Shop(ArrayList<String> stock) {
        this.stock = stock;
        stockCount = 0;
    }

    public String getProduct(int index) {
        stockCount--;
        
        return stock.remove(index);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1);
                if (stockCount != stock.size()) {
                    System.out.println("В магазине появился новый товар!");
                    stockCount++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
