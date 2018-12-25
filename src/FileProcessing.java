import java.io.File;
public class FileProcessing {
    public static void main(String[] args){
        File f = new File("/home/asus/Desktop/ilter.txt");

        if(f.exists())
            System.out.println("file exist");
        else
            System.out.println("file does not exist");

    }
}