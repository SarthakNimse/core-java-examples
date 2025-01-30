import java.util.InputMismatchException;
import java.util.Scanner;

public class Divison1 {

    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number ");
            int num1 = sc.nextInt();

            double result = 100/num1;

            System.out.println("Result " +result);
        } catch (ArithmeticException e) {
            System.out.println("Number Can't be Zero");
        }catch (InputMismatchException e){
            System.out.println("Non Numeric Value");
        }finally {
            System.out.println("Completed");
        }
    }
}
