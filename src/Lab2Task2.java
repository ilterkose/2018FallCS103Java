public class Lab2Task2 {
    public static void main(String[] args){
        /* Ilter Kose, S015555,CS103 */
        System.out.println();
        triangles();
        dashes();
        rectangle();
        dashes();
        turkey();
        dashes();
        rectangle();
        dashes();
        triangles();
    }
    public static void triangles() {
        System.out.println("   / \\" +"\t"+"       / \\" );
        System.out.println("  /   \\"+ "\t"+"      /   \\");
        System.out.println(" /     \\" + "\t"+" /     \\");
    }
    public static void dashes(){
        System.out.println("+-------+" + "\t" + "+-------+"  );
    }
    public static void rectangle(){
        System.out.println("|       |" + "\t" + "|       |");
        System.out.println("|       |" + "\t" + "|       |");
        System.out.println("|       |" + "\t" + "|       |");
        System.out.println("|       |" + "\t" + "|       |");
        System.out.println("|       |" + "\t" + "|       |");
    }
    public static void turkey(){

        System.out.println("| Turkey| " + "\t" +"| Turkey| " );
    }
}
