import com.bankaccount.model.BankAccount;
import com.bankaccount.model.InsufficentBalanceException;
import com.bankaccount.model.InvalidAccountException;
import com.bankaccount.service.BankService;

public class BankTransactionDemo {
    public static void main(String[] args) {

        BankAccount sender = new BankAccount(5000,"AC501");
        BankAccount reciever = new BankAccount(2500,"AC6551");

        BankService bankService = new BankService();


        try{
            bankService.transfermoney(sender,reciever, 30000);
        }catch (InsufficentBalanceException e){
            System.out.println("ERROR  " +e.getMessage());
        }catch (InvalidAccountException e){
            System.out.println("ERROR  " +e.getMessage());
        }catch (Exception e){
            System.out.println("AN Unexpected Error Occured " +e.getMessage());
        } finally {
            System.out.println("Transaction Attempt Finished");

        }
    }

}
