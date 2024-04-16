
public class YourFirstAccount {

    public static void main(String[] args) {
        Account bensAccount = new Account("Ben's account", 100.0);

        bensAccount.deposit(20.0);

        System.out.println(bensAccount);
    }
}
