package classes;

public class Bank {

    String accountId;
    String firstName;
    String lastName;
    long accountNumber;
    float balance;

    public void getBalance(){
        System.out.println("Balance is "+balance);
    }

    public void newDeposit(float depositAmount){
        balance=balance+depositAmount;
        System.out.println("Money deposited");
        System.out.println("New balance is "+balance);
    }

    public void withdrawal(float withdrawalAmount){

        if (balance<withdrawalAmount){
            System.out.println("Not enough balance");
        }else{
            balance=balance-withdrawalAmount;
        }
        System.out.println("successfull!! New balance is "+balance);
    }

}
