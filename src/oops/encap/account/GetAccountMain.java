package oops.encap.account;

public class GetAccountMain {
    public static void main(String[] args) {
        GetAccount getAccount=new GetAccount();
        System.out.println("Account details : "+getAccount.getAccountNo()+" "+getAccount.getFirstName());
    }
}
