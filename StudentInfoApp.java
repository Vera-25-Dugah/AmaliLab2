import java.util.Scanner;

public class StudentInfoApp {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" PLEASE ENTER YOUR FIRST NAME : ");
        String firstName = input.next();

        System.out.println(" PLEASE ENTER YOUR LAST NAME : ");
        String lastName = input.next();

        System.out.println("PLEASE ENTER YOUR AGE : ");
        int age = input.nextInt();

        System.out.println("PLEASE ENTER YOUR FAVORITE SUBJECT : ");
        String favSubject = input.next();

        System.out.println("NAME : " + lastName + " " + firstName + "\nAGE : " + age + "\nFAVORITE SUBJECT : " + favSubject);
    }
}
