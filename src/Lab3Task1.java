
public class Lab3Task1 {
    public static void main(String[] args) {
        exercise2();
    }

    public static void exercise1() {
        int velocity = 10;
        int velocitytime = 10;
        int time = 10;
        double b = 5.0;
        double a = 1.5;
        double c = 2.8;

        int d;

        d = (((velocity + velocitytime) / 2) * time);
        System.out.println(d);

        double u;

        u = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c) / (2 * a));
        System.out.println(u);
    }

    public static void exercise2() {
        for (int i = 0; i < 11; i += 2) {
            double a = Math.pow(i, 2);
            System.out.println(a);
        }
    }

    public static void exercise3() {
        double calculate = 0;
        for (int i = 15; i > 0; i--) {
            calculate += 1 / (Math.pow(i, 2));
            System.out.println(calculate);
        }
        System.out.println("\n" + calculate);
    }
}