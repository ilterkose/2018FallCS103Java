import java.util.Scanner;

public class BasicATMProgram {
    public static void main(String[] args){

        int amountOfAccount = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Kose Bank\n" +
                "For Account Info Press 1\n" +
                "For Withdraw Press 2\n" +
                "For Deposit Press3\n"+
                "For quit press \"q\" ");




        while(true) {

            System.out.print("Press the button for choice: ");
            String choice = sc.nextLine();

            if(choice.equals("1")){
                System.out.println("Amount at your account is: "+amountOfAccount);

            }
            else if(choice.equals("2")){

                System.out.print("withdraw amount: ");
                int amountofWithdraw = sc.nextInt();
                sc.nextLine();

                if (amountofWithdraw > amountOfAccount){
                    System.out.println("You can not withdraw that amount coz you dont have that");
                }else{
                    amountOfAccount -= amountofWithdraw;
                    System.out.println("You withdraw : " + amountofWithdraw + " from your account");
                    System.out.println("New amount inside the account is: " + amountOfAccount);
                }


            }
            else if (choice.equals("3")){
                System.out.print("deposit amount: ");
                int amountofDeposit = sc.nextInt();
                sc.nextLine();
                amountOfAccount += amountofDeposit;
                System.out.println("You deposit : " + amountofDeposit+ " from your account");
                System.out.println("New amount inside the account is: " + amountOfAccount);

            }
            else if (choice.equals("q")){
                System.out.println("You want to quit from the ATM Have a nice day!");
                break;
            }
            else{
                System.out.println("You pressed the wrong button");
            }
        }

    }

}
