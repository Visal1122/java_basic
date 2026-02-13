package practice;

public class BankApplication {
    public static void main(String[] args) {
        BankAccount bankAccount[] = {
                new BankAccount("001" ,"Visal" , 100),
                new BankAccount("002" ,"Nan" , 200),
                new BankAccount("003" ,"Jing" , 400)
        };
        Bank bank = new Bank("ABA" , bankAccount);
        bank.dislayAccounts();
        bank.transfer("001" , "003" , 50);
        bank.dislayAccounts();
    }


}
