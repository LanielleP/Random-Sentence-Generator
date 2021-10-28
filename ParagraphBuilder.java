import java.util.*;
import java.io.IOException;//for file issues
import java.io.File;//used to read file
import java.io.FileWriter;//used to save file

public class ParagraphBuilder 
{

  /*
  Description: creates a UserWordBank.txt
  *Pre: String[] args
  *Param: String[] args
  *Post: None
  *Return: None
  */
  public static void createFile(String[] args) 
  {
    try 
    {
      File ownWordBank = new File("UserWordBank.txt");
      if (ownWordBank.createNewFile()) 
      {
        System.out.println("File created: " + ownWordBank.getName());
      } 
      else 
      {
        System.out.println("File already exists.");
      }
    } 
    catch (IOException e) 
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } // ends try catch
  }// ends file creation method

  /*
  Description: User inputs words in their own txt file
  *Pre: String[] args
  *Param: String[] args
  *Post: None
  *Return: None
  */
  public static void userInputFile(String[] args) 
  {
    Scanner userWrites = new Scanner(System.in);
    boolean input = true;
    Scanner userCont = new Scanner(System.in);
    int stop = 0;
    try 
    {
      FileWriter UserWriter = new FileWriter("UserInput.txt");
      while (input = true) 
      {
        UserWriter.write(userWrites.nextLine());
        System.out.println("Stop = 1");
        stop = Integer.valueOf(userCont.nextLine());
        if (stop == 1) {
          input = false;
        }
      } // ends while loop when user wants to stop adding into the file.
      UserWriter.close();
      System.out.println("Successfully wrote to the file.");
    } // ends try
    catch (IOException e) 
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } // ends catch
  }// ends userInputFile method

  /*
  Description: Mode method - Allows user to choose whether they want to take over the program, or let the program do its own thing. Manual - User chooses to add or not add sentences into the paragraph. Autonomous - User's paragraph is formed by program.
  *Pre: None
  *Param: None
  *Post: 
  *Return: int mode
  */
  public static int mode() 
  {
    Scanner userMode = new Scanner(System.in);
    int mode = -1;
    while (mode == -1) 
    {
      System.out.println("Please choose 0 - control; 1 - autonomy");
      mode = Integer.valueOf(userMode.nextLine());
      if (mode == 0) 
      {
        System.out.print("Control Chosen");
      } else if (mode == 1) {
        System.out.print("Autonomy Chosen");
      } else {
        System.out.println("Unvalid Input");
      }
    } // ends while loop
    return mode;
  }// User takes control or srg is autonomous

}// ends ParagraphBuilder class