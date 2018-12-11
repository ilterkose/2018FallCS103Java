public class Assignment2_Q2 {
    public static void main(String[] args){
        printFirstLine(24);
        printSecondLine(20);
        printThirdLine();
        printSecondLine(20);
        printFirstLine(24);
        // part b
        printFirstLine(40);
        printSecondLine(36);
        System.out.println("**  Lionel Messi & Xavi Hernandez     **");
        printSecondLine(36);
        printFirstLine(40);
    }
    public static void printFirstLine(int starCount){
        for(int i=0;i<starCount;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printSecondLine(int spaceCount){
        for(int i=0;i<2;i++){
            System.out.print("**");
            for(int k=0;k<spaceCount;k++){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static void printThirdLine(){
        System.out.println("** JAVA & PROGRAMMING **");
    }
}
