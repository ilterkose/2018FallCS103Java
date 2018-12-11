import java.util.Scanner;

public class Assignment2_Q3 {
    public static void main(String[] args){
        int balance = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = sc.next();

        System.out.print("Please enter your account number: ");

        int accnum = sc.nextInt();

        if(accnum == 1){
            System.out.print("Enter money sent by your friend to your account: ");
            int incomeFromFriend = sc.nextInt();
            System.out.print("Enter your electric bill: ");
            int electricBill = sc.nextInt();

            balance = incomeFromFriend - electricBill;

            System.out.println("Name: " + name + "\t" + "Balance: " + balance);
        }
        else {
            System.out.println("It is not a valid bank account");
        }
    }

}
