import java.util.Scanner;

public class QuizPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz: ");
        int kilo = scanner.nextInt();
        System.out.println("Kilonuz= "+ "\t" + kilo);

        System.out.print("Boyunuzu giriniz:");
        double boy = scanner.nextDouble();
        System.out.println("Boyunuz="+ "\t" + boy);

        double toplam = kilo / (boy * boy);
        System.out.print("Beden kitle endeski=" + "\t" + toplam);
    }
}
