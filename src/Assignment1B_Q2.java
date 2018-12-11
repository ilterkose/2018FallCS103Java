public class Assignment1B_Q2 {
    public static void main(String[] args) {
        pyramid();
    }

    public static void pyramid() {
        int s=5;

        for (int i=0; i<=11; i=i+2) {

            for (int j=0; j<=s;j++) {
                System.out.print(" ");
            }

            for (int j=0; j<i/2;j++) {
                System.out.print("-");
            }
            for (int j=i/2;j<i;j++) {
                System.out.print("+");
            }
            s--;
            System.out.println();
        }

    }
}
