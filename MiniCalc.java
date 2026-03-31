import java.util.Scanner;

public class MiniCalc {

    //METHODS DEFINITIONS
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("MATH ERROR");
            return 0;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double finalResult;
        while (true) {

            //TAKES USER INPUT & STARTS LOOP
            System.out.println(" START MATH");


            //FIRST VALUE INTAKE
            System.out.println("Please enter your first number : ");
            double num1 = input.nextInt();

            //SECOND VALUE INTAKE
            System.out.println("Please enter your second number : ");
            double num2 = input.nextInt();

            //OPERATOR INTAKE
            System.out.println("Please choose an operator : {+ , * , - , / } ");
            char operator = input.next().charAt(0);

            //SWITCH CASE PERFORMING CALCULATIONS AS METHODS
            switch (operator) {
                case '+': {
                    finalResult = addition(num1, num2);
                    System.out.println(" RESULT : " + finalResult);
                }
                break;
                case '-': {
                    finalResult = subtraction(num1, num2);
                    System.out.println(" RESULT : " + finalResult);
                }
                break;
                case '*': {
                    finalResult = multiplication(num1, num2);
                    System.out.println(" RESULT : " + finalResult);
                }
                break;
                case '/': {
                    finalResult = division(num1, num2);
                    System.out.println(" RESULT : " + finalResult);
                }
                break;
                default:
                    System.out.println("INVALID OPERATION");
            }
            //WHILE LOOP BREAK STATEMENT
            System.out.println(" Please choose Yes(y) or No(n) to continue or quit ");
            String con = input.next();
            if (con.equalsIgnoreCase("n")) {
                break;
            } else {
                finalResult = 0;
            }
        }
    }
}
