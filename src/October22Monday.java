public class October22Monday {
    public static void main(String[] args) {
        int x=9;
        int y=2;
        int z=5;

        mystery(z,y,x);
        mystery(y,x,z);
    }

    public static void chant(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("coder moruque");
        }
    }

     /* public static void line(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    } */

    public static void printNumbers(int times,int number){
        for (int i=0;i<times;i++)
            System.out.print(number);
    }
    public static void mystery(int x, int z, int y){
        System.out.print(z + "and" + (y-x));
    }
}
