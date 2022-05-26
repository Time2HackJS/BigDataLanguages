import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
    Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки. Создать массив объектов. 
    
    Вывести: 
        a) список абитуриентов, имеющих неудовлетворительные оценки; 
        b) список абитуриентов, средний балл у которых выше заданного; 
        c) выбрать заданное число n абитуриентов, имеющих самый высокий средний балл (вывести также полный список абитуриентов, имеющих полупроходной балл). 
*/

class Lr3_3 {
    static int GIVEN_SCORE = 3;

    public static void main(String[] args) throws ZeroScoresException {
        ArrayList<Abiturient> abiturients = new ArrayList<Abiturient>();

        abiturients.add(new Abiturient(0, "Vadim",  "Santalov",  "address",  "1", new int[]{ 1, 2, 3, 4, 5 }));
        abiturients.add(new Abiturient(1, "Vyacheslav",  "Eliseev",  "address",  "2", new int[]{ 5, 5, 5, 5, 6 }));
        abiturients.add(new Abiturient(2, "Viktor",  "Korneplod",  "address",  "3", new int[]{ 3, 4, 5, 2, 5 }));
        abiturients.add(new Abiturient(3, "Elon",  "Musk",  "address",  "4", new int[]{ 2, 2, 2, 2, 5 }));

        // A
        System.out.println("Task A:");
        for (Abiturient abiturient : abiturients) {
            Boolean hasNegative = false;

            for (int score : abiturient.scores) {
                if (score == 2) {
                    hasNegative = true;
                    break;
                }
            }

            if (hasNegative) System.out.println(abiturient.name + " " + abiturient.surname + " has bad scores.");
        }

        // B
        System.out.println("\nTask B:");
        for (Abiturient abiturient : abiturients) {
            int scoreSum = 0;

            for (int score : abiturient.scores) scoreSum += score;

            if (scoreSum / abiturient.scores.length > GIVEN_SCORE) System.out.println(abiturient.name + " " + abiturient.surname + " more than average scores.");
        }

        // C
        System.out.println("\nTask C:");

        Scanner in = new Scanner(System.in);
        System.out.print("Input number of students (it must be less than " + (abiturients.size() + 1) + "): ");
        int count = in.nextInt();
        in.close();

        Collections.sort(abiturients, new Comparator<Abiturient>() {
            public int compare(Abiturient a1, Abiturient a2) {
                double sum1 = 0;
                double sum2 = 0;

                for (int score : a1.scores) sum1 += score;
                for (int score : a2.scores) sum2 += score;

                sum1 /= a1.scores.length;
                sum2 /= a2.scores.length;

                if (sum1 == sum2) return 0;
                return sum1 > sum2 ? -1 : 1;
            }
        });

        for (int i = 0; i < count; i++) {
            Abiturient ab = abiturients.get(i);

            double sum = 0;
            for (int score : ab.scores) sum += score;
            sum /= ab.scores.length;

            System.out.println("Abiturient " + ab.name + " " + ab.surname + " has AVG score " + sum);
        }
    }
}