import java.util.Scanner;

public class Lab6Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        Oddeven(a,b);
    }
    public static void Oddeven(int a , int b){
        for(int i=a;i<=b;i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
