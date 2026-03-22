package StudentScore;

public class StudentScore {
    private String name;
    private double score1;
    private double score2;
    private double score3;

    StudentScore(String name, double score1, double score2, double score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    double getAverage() {
        return (score1 + score2 + score3) / 3;
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Average: " + getAverage());
    }
}
