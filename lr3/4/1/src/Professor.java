import java.util.ArrayList;
import java.util.Random;

public class Professor extends Person {
    String degree;

    Professor(String name, String surname, String degree) {
        super(name, surname);
        this.degree = degree;
    }

    ArrayList<Result> checkExams(ArrayList<Exam> exams) {
        ArrayList<Result> results = new ArrayList<Result>();
        Random rand = new Random();

        for (Exam exam : exams) results.add(new Result(exam.abiturient, rand.nextDouble(1) * exam.questions));

        return results;
    }
}
