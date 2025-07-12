package Module5.ProgrammingAssignments.Stacks.Problem3;

public class ExamPaper {
    private String student;
    private int score;

    public ExamPaper() {
        student = "";
        score = 0;
    }

    public ExamPaper(String student) {
        this.student = student;
        score = 0;
    }

    public ExamPaper(String student, int score) {
        this.student = student;
        this.score = score;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getStudent() {
        return student;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return student + "\n" + "Score: " + score;
    }
}
