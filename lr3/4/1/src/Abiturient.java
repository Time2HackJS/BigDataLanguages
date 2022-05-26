import java.util.Random;

public class Abiturient extends Person {

    Abiturient(String name, String surname) {
        super(name, surname);
    }

    public Exam writeExam(int questions) {
        Random rand = new Random();

        return new Exam(
            this,
            questions,
            questions - rand.nextInt(questions + 1)
        );
    }
}
