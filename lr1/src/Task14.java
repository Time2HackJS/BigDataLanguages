public class Task14 {
    public static void main(String[] args) {
        int[] argsInt = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            argsInt[i] = Integer.parseInt(args[i]);
        }

        for (int i = 1; i < args.length - 1; i++) {
            if (argsInt[i] * 2 == argsInt[i - 1] + argsInt[i + 1]) System.out.println(args[i]);
        }
    }
}
