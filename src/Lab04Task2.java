public class Lab04Task2 {
    public static final double PI = 3.14;
    public static int r = 5;
    public static int degrees = 30;
    public static int y = 15;


    public static void main(String[] args){
       changeRadius();

    }

    public static void calculateArea(){

        System.out.println("Area of Circle = " + (PI) * (Math.pow(r,2)));

    }
    public static void calculateCircumference(){

        System.out.println("Circumference = " + 2 * PI * r);

    }

    public static void convertDegreeToRadian(){

        System.out.println("Radian = " + (degrees) * (PI/180));

    }
    public static void changeRadius(){

        r = 20;
        int y = 55;

        System.out.println("r = " + r + "\n" + "y = " + y);

    }
}
