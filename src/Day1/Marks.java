package Day1;

public class Marks {
    public static void main(String[] args) {

        int mark = 85;

        char grade;

        if (mark >= 90) {
            grade = 'O';
        } else if (mark >= 80) {
            grade = 'E';
        } else if (mark >= 70) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else {
            grade = 'C';
        }

        System.out.println("Grade: " + grade);
    }
}
