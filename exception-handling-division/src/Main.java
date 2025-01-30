import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number ");
            int num1 =sc.nextInt();

            System.out.println("Enter the second number ");
            int num2 = sc.nextInt();

            double result = num1 / num2;

            System.out.println("Result " + result);

        }catch (ArithmeticException e){

            System.out.println("Number cant be Zero");
        }catch (InputMismatchException e){
            System.out.println("Non Numeric Value");

        }finally{
            System.out.println("Completed");
        }
    }
}