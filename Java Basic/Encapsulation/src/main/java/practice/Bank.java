package practice;

public class Bank {
    private String bankName;
    private BankAccount[] bankAccounts ;

    public Bank(String bankName, BankAccount[] bankAccounts) {
        this.bankName = bankName;
        this.bankAccounts = bankAccounts;
    }

    private BankAccount getAccountByNumber(String accountNumber){
        for(BankAccount bankAccount : bankAccounts){
            if(bankAccount.getAccountNumber().equals(accountNumber)){
                return bankAccount;
            }
        }
        return null;
    }


    private boolean isEnoughBalance(BankAccount bankAccount , double amount){
//        if(bankAccount.getBalance() >= amount){
//            return true;
//        }
//        return false;
        return bankAccount.getBalance() >= amount;
    }
    private boolean isValidAmount(double amount){
        return amount>0;
    }
    private void withdraw(BankAccount bankAccount , double amount){
        if(isValidAmount(amount)){
            if(isEnoughBalance(bankAccount , amount)){
                bankAccount.setBalance(bankAccount.getBalance() - amount);
            }
        }
    }
    private void deposit(BankAccount bankAccount , double amount){
        if(isValidAmount(amount)){
                bankAccount.setBalance(bankAccount.getBalance() + amount);
        }
    }
    public void transfer(String accountSource , String accountTarget , double amount){
        BankAccount source = getAccountByNumber(accountSource);
        BankAccount target = getAccountByNumber(accountTarget);
        if (source!= null && target!=null){
            if(isValidAmount(amount)){
                if(isEnoughBalance(source , amount)){
                    source.setBalance(source.getBalance()-amount);
                    target.setBalance(target.getBalance()+amount);
                    System.out.println("Transfer Successfully");
                    return;
                }
                System.out.println("Amount must be bigger that 0 ");
                return;
            }
            System.out.println("Check the source and Target Account");
        }

    }
    public void dislayAccounts(){
        for(BankAccount account : bankAccounts){
            System.out.println(account);
        }
    }

}
