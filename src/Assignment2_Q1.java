public class Assignment2_Q1 {

    public static int r =255;
    public static int g =255;
    public static int b =255;

    public static void main(String[] args){
        Print();
        convertToBlack(r,g,b);
        Print();

    }

    public static void convertToBlack(int r, int g,int b){
        System.out.println("Converting to the black");
        r = 0;
        g = 0;
        b = 0;
    }
    public static void Print(){
        System.out.println(" R: " + r + " G: " + g + " B: " + b);
    }
    public static void createRed(int r, int g,int b){
        System.out.println("Creating red color...");
        r = 255;
        g = 0;
        b = 0;
    }
    public static void convertToRed(int r, int g, int b) {
        System.out.println("Converting to red...");
        r = 255;
        g = 0;
        b = 0;
    }
}

