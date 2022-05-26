import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Leg extends Thread {
    private final String side;
    private final BlockingQueue<String> orders;

    public Leg(String side) {
        this.side = side;
        this.orders = new LinkedBlockingQueue<String>();
    }

    public void makeStep() {
        this.orders.add("step");
    }

    public void stopLeg() {
        this.orders.add("stop");
    }

    @Override
    public void run() {
        loop: while (true) {
            try {
                String order = orders.take();

                switch (order) {
                    case "step":
                        System.out.println(this.side + " нога сделала шаг");
                    break;
                
                    default:
                    break loop;
                }
            } catch (InterruptedException e) {
                System.err.println("Error occured: " + e);
            }
        }
    }
}
