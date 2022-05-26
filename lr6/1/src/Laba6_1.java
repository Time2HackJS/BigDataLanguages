import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Laba6_1 {

    public static void printPoly(ArrayList<Double> list) {
        for (double val : list) {
            System.out.print(val + "x^" + (list.indexOf(val) + 1));
            if (list.indexOf(val) != list.size() - 1) System.out.print(" + ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Double> list1 = new ArrayList<Double>(Arrays.asList(1.5, 2.73, 4.89, 3.0, 9.0));
        ArrayList<Double> list2 = new ArrayList<Double>(Arrays.asList(3.1, 2.2, 5.11, 4.7, 1.0));

        HashMap<Integer, Double> values = new HashMap<Integer, Double>();

        System.out.println("Исходные многочлены:");
        printPoly(list1);
        printPoly(list2);

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                int key = i + j + 2;

                if (!values.keySet().contains(key)) {
                    values.put(key, 0.0);
                }

                Double val = values.get(key);
                values.put(key, (double) Math.round((val + list1.get(i) * list2.get(j)) * 100) / 100);
            }
        }

        System.out.println("\nИтоговый многочлен:");
        values.forEach((key, val) -> {
            System.out.print(val + "x^" + key);
            if (key != list1.size() + list2.size()) System.out.print(" + ");
        });
    }
}
