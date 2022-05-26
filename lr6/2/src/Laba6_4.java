import java.util.Collections;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Laba6_4 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();

        System.out.println();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(System.getProperty("user.dir") + "\\src\\numbers.txt")), "UTF-8"))) {
            for (String line; (line = br.readLine()) != null;) {
                String[] strNum = line.split(" ");

                Boolean gotNegative = false;
                
                for (String num : strNum) {
                    int number = Integer.parseInt(num);

                    if (number < 0) {
                        gotNegative = true;
                    }
                    else if (gotNegative) {
                        list2.add(number);
                    }
                    else {
                        list1.add(number);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("File does not exists");
            System.exit(0);
        } 

        System.out.println("Списки до сортировки:\nC1: " + list1 + "\nC2: " + list2);

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println("\nСписки после сортировки:\nC1: " + list1 + "\nC2: " + list2);

        list1.addAll(list2);
        System.out.println("\nИтоговый список: " + list1);
    }
}
