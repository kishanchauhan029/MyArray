package bankPackage;

public class AccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("XYZ","34243242", 300);
        System.out.println(account);
        account.deposit(10);
        System.out.println(account.getBalance());
        account.withdraw(20);
        System.out.println(account);
        account.withdraw(345345);
        System.out.println(account);
    }
}
