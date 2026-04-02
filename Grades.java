import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" PLEASE ENTER YOUR SCORE");
        double score = input.nextDouble();
        while (score < 0 || score > 100) {
            System.out.println("ERROR/ INVALID NUMBER");
            System.out.println(" PLEASE ENTER A NEW  SCORE");
            score = input.nextDouble();
        }
        char grade;
        if (score >= 80) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else if (score >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        switch (grade) {
            case 'A': {
                System.out.printf("SCORE : %.1f\nGRADE : %s\nREMARKS : EXCELLENT\n", score, grade);
                break;
            }
            case 'B': {
                System.out.printf("SCORE : %.1f\nGRADE : %s\nREMARKS : VERY GOOD\n", score, grade);
                break;
            }
            case 'C': {
                System.out.printf("SCORE : %.1f\nGRADE : %s\nREMARKS : GOOD\n", score, grade);
                break;
            }
            case 'D': {
                System.out.printf("SCORE : %.1f\nGRADE : %s\nREMARKS : PASS\n", score, grade);
                break;
            }
            default:
                System.out.printf("SCORE : %.1f\nGRADE : %s\nREMARKS : FAIL\n", score, grade);

        }
    }
}





