import java.util.*;
import java.io.IOException;//for file issues
import java.io.File;//used to read file
import java.io.FileWriter;//used to save file

public class ParagraphBuilder{
  
  public static void createFile(String[] args){
    try {
      File ownWordBank = new File("UserWordBank.txt");
      if (ownWordBank.createNewFile()) {
        System.out.println("File created: " + ownWordBank.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }//ends try catch
  }//ends file creation method

public static int mode()
  {
    Scanner userMode = new Scanner(System.in);
    int mode = -1;
    while (mode == -1){
    System.out.println("Please choose 0 - control; 1 - autonomy");
    mode = Integer.valueOf(userMode.nextLine());   
    if (mode == 0){

    }
    else if (mode == 1){

    }
    else{
      System.out.println("Unvalid Input");
    }

    }//ends while loop
    return mode;
  }//User takes control or srg is autonomous

}//ends ParagraphBuilder class