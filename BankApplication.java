class Bank{
static int currentBalance=10000;
public static void greetCustmor(){
System.out.println("Hello , Welcome to the Banking Application");
}
public void deposit(int amount){
    currentBalance =currentBalance + amount;
Sytem.out.println("Amount  is Deposit Successfully");
}
public static void withdrawal(int amount){
currentBalance = currentBalance - amount;
}
Sytem.out.println("Amount is Withdrawal Successfully");
public int currentBalance(){
return currentBalance;
}

public static void main(String[] args) {
Bank bank=new Bank();
greetCustmor();
System.out.println("Current balnce is:"+bank.greetCustmor());
Bank.deposit(2358);
System.out.println("Amount  is Deposit Successfully:"+bank.greetCustmor());
withdrawal(252);
System.out.println("Amount is Withdrawal Successfully:"+greetCustmor());
}
}
