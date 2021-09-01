import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        functionality fn = new functionality();
        while (true) {
            System.out.println();
            System.out.println("1)check balance\n2)deposite\n3)withdraw\n4)register new user\n5)exit");
            System.out.print("enter what you want to do:");
            int action = sc.nextInt();
            System.out.println();
            if (action == 1) {
                fn.checkBalance();

            } else if (action == 2) {
                System.out.print("enter deposite amount:");
                int amount = sc.nextInt();
                fn.deposite(amount);
            } else if (action == 3) {
                System.out.print("enter withdrawal:");
                int amount = sc.nextInt();
                fn.withdraw(amount);
            } else if (action == 4) {
                System.out.println("thanks for choosing us.......");
                fn.registration();
            }

            else if (action == 5) {
                System.out.println("thanks for banking with us".toUpperCase());
                break;
            }

        }

    }

}

class functionality {
    public int openingBalnce = 0;
    int CurrentBalance = 0;

    public static void registration() {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter name:".toUpperCase());
        String name = sc.next();
        System.out.print("account number:".toUpperCase());
        long account_number = sc.nextLong();
        System.out.print("address:");
        String address = sc.next();
        System.out.println("user regitration sucessfully...!".toUpperCase());

    }

    public void checkBalance() {
        System.out.print("your current balance is: " + CurrentBalance);
    }

    void deposite(int amount) {

        CurrentBalance += amount;
        System.out.println("your current balance is :" + CurrentBalance);
    }

    void withdraw(int amount) {
        if (amount > CurrentBalance) {
            System.out.println("sorry you can not proced your acount balance is low");

        } else {
            CurrentBalance = CurrentBalance - amount;
            System.out.println("Transaction done successfully...!\t thanks for banking ");
            System.out.println("your updated balance is :" + CurrentBalance);

        }
    }

}
