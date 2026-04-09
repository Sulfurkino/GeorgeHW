package Exception.Bank;

public class BankAccount {
    double accountBalance = 0;
    double amount = 1;
    boolean isBlocked = false;

    public double getAccountBalance() {
        return accountBalance;
    }

    public void withdrawal(double amount) throws InsufficientFundsException, AccountBlockedException{

        if(isBlocked == true){
            throw new AccountBlockedException("ваш аккаунт заблокирован, на нём нельзя проводить операции");
        }
        if (amount < 0){
            throw new NegativeAmountException("нельзя снять негативную сумму");
        }
        if (amount > accountBalance){
            throw new InsufficientFundsException("на счету недостаточно средств");
        }
        accountBalance =-amount;
    }
    public void transferMoney (double amount) throws InsufficientFundsException, AccountBlockedException, NegativeAmountException {
        if(isBlocked == true){
            throw new AccountBlockedException("ваш аккаунт заблокирован, на нём нельзя проводить операции");
        }
        if (amount < 0){
            throw new NegativeAmountException("нельзя перевести негативную сумму");
        }
        if (amount > accountBalance){
            throw new InsufficientFundsException("на счету недостаточно средств");
        }
        accountBalance =-amount;
    }
    public void addMoney(double amount) throws NegativeAmountException, AccountBlockedException{
        if(isBlocked == true){
            throw new AccountBlockedException("ваш аккаунт заблокирован, на нём нельзя проводить операции");
        }
        if (amount < 0){
            throw new NegativeAmountException("нельзя пополнить счёт негативной суммой");
        }
    }


}
