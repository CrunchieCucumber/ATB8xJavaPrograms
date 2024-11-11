package Nov.ex_03112024;

//Write a Java program to create a class called "BankAccount" with instance variables
//'accountNumber' and balance, and static variables 'bankName' and 'interestRate'.
//Provide static methods to get and set the static variables. Create several 'BankAccount' objects
//and print their details along with the static variables

public class Lab069_StaticPractice5 {
    private String accountNumber;
    private double balance;
    private static String bankName;
    private static double interestRate;

    public Lab069_StaticPractice5(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String name) {
        bankName = name;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        Lab069_StaticPractice5.setBankName("National Bank");
        Lab069_StaticPractice5.setInterestRate(3.5);

        Lab069_StaticPractice5 account1 = new Lab069_StaticPractice5("123456789", 1000.00);
        Lab069_StaticPractice5 account2 = new Lab069_StaticPractice5("987654321", 2000.00);

        account1.printDetails();
        System.out.println();
        account2.printDetails();
    }
}
