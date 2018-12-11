import java.util.Scanner;

public class Lab07_Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("range: ");
        int range = sc.nextInt();
        for (int k = 2;k < range ;k++){
            if (isPrimeNumber(k)){
                System.out.print(k + " ");
            }
        }


    }

    public static boolean isPrimeNumber(int range) {

        for (int i = 2; i < range; i++) {
            if (range % i == 0) {
                return false;
            }
        }
        return true;
    }
}