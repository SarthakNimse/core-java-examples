import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {


            int number []= {10,20,3,40,54,46,5463,415};

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any index");
            int index = sc.nextInt();

            try{
                int value =number[index];
                System.out.println("Value at index is " +index + ":" +value);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index Is Out Of Bound ");
            }catch(InputMismatchException e){
                System.out.println("Non numeric value is enterd ");
            }finally{
                System.out.println("Finished");
            }
    }
}
