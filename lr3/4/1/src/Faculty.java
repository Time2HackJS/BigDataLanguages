import java.util.ArrayList;

public class Faculty {
    private ArrayList<Abiturient> abiturients;
    public Professor professor;

    int passScore;
    int questionsCount;

    Faculty(int passScore, int questionsCount) {
        this.abiturients = new ArrayList<Abiturient>();
        this.professor = new Professor("Galina", "Sergeevna", "Doctor");

        this.passScore = passScore;
        this.questionsCount = questionsCount;
    }

    void register(Abiturient abiturient) {
        this.abiturients.add(abiturient);
    }

    ArrayList<Exam> getExams() {
        ArrayList<Exam> exams = new ArrayList<Exam>();

        for (Abiturient abiturient : this.abiturients) exams.add(abiturient.writeExam(this.questionsCount));

        return exams;
    }

    ArrayList<Abiturient> applyAbiturients() {
        ArrayList<Abiturient> abiturients = new ArrayList<Abiturient>();

        ArrayList<Result> results = this.professor.checkExams(this.getExams());
        for (Result result : results) if (result.score >= passScore) abiturients.add(result.abiturient);

        return abiturients;
    }
}
