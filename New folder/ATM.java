import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 1234, balance = 1000;

        System.out.print("Enter PIN: ");
        int userPin = sc.nextInt();

        if (userPin == pin) {
            System.out.println("1.Check Balance  2.Deposit  3.Withdraw");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("New Balance: " + balance);
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    int withdraw = sc.nextInt();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("New Balance: " + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } else {
            System.out.println("Wrong PIN");
        }

        sc.close();
    }
}
