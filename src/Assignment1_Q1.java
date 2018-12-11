public class Assignment1_Q1 {
    /* Ilter Kose, S015555, CS103 */
    public static void main(String[] args) {
        MirrorTriangle();
    }

    public static void TriangleRightAngleIncrease() {
        int line = 5;

        double mainpoint = 1.0;

        for (int i = 0; i < line; i++) {

            mainpoint = 1.0;

            for (int j = 0; j < i + 1; j++) {

                System.out.print(mainpoint + " ");
                mainpoint += 1.0;
            }

            System.out.println();
        }
    }

    public static void TriangleRightAngleDecrease() {

        double mainpoint = 5.0;

        for (int i = 5; i > 0; i--) {

            mainpoint = 1.0;

            for (int j = 0; j <= i - 1; j++) {

                System.out.print(mainpoint + " ");

                mainpoint += 1.0;
            }

            System.out.println();
        }
    }
    public static void MirrorTriangle() {
        int line = 5;

        int mainpoint = 1;

        int secondpoint = 5;

        // Triangle Increase
        for(int i=0;i<line;i++){

            mainpoint = 1;

            for(int j=0; j < i+1;j++){

                System.out.print(mainpoint + " ");

                mainpoint +=1;
            }

            System.out.println();
        }

        // TriangleDecrease
        for (int k=5;k>0;k--){

            secondpoint = 1;

            for (int m=0;m <= k-1;m++){

                System.out.print(secondpoint + " ");
                secondpoint += 1;

            }
            System.out.println();

        }

    }

}