

public class Lab08_Q1 {
    public static void main(String[] args) {
        int result = 2;

        int Max_Exponent = 9;

        System.out.print(result);

        for (int count = 1;count <= Max_Exponent;count++){

            result = result*2;

            System.out.print("," +result);

        }
    }
}