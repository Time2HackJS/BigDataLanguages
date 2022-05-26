public class Task3 {
    public static void main(String[] args) {
        Integer strCount = Integer.parseInt(args[0]);

        System.out.println("Output without 'nextline':");
        for (int i = 0; i < strCount; i++) {
            System.out.print("string ");
        }

        System.out.println("\n\nOutput with 'nextline':");
        for (int i = 0; i < strCount; i++) {
            System.out.println("string ");
        }
    }
}
