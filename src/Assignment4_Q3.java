import java.util.*;
import java.io.*;

public class Assignment4_Q3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("notes.txt"));
        System.out.println("Welcome to the simple note taker\n" +
                            "New : to create a new file and save it\n " +
                "Show: to read content of a file\n" +
                "Delete: to Delete a file");
        String option = sc.nextLine();
        if(option.equals("new"))
            createNotes();
        else if(option.equals("show"))
            showNotes();
        else if(option.equals("delete"))
            deleteNotes();
    }
    public static void createNotes(){

    }
    public static void showNotes(){

    }
    public static void deleteNotes(){

    }
}
