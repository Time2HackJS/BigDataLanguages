public class Task15 {
    public static void main(String[] args) {
        for (int i = 1; i < args.length; i++) System.out.println(String.format("%.02f", (float) Integer.parseInt(args[i]) / i));
    }
}
