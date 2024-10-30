package oops.encap.login;

public class Login {
    private String userName;
    private String password;

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void loginCheck(String user,String pass){
        if(this.userName.equals(user) && this.password.equals(pass)){
            System.out.println("User authenticated");
        }else{
            System.out.println("User not authenticated");
        }
    }

}
