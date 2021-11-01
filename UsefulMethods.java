import java.util.*;
import java.io.IOException;//for file issues
import java.io.File;//used to read file
//import java.io.FileWriter;//used to save file

public class UsefulMethods
{

  /*
  Description: Returns the input from a given file as an LinkedList
  *Pre: String file
  *Param: String file
  *Post: None
  *Return: LinkedList<String> info
  */
  public static LinkedList<String> readFile(String file)
  {
    LinkedList<String> info = new LinkedList<String>();
    
    try{
      Scanner fileReader = new Scanner(new File(file));
      while(fileReader.hasNext()) info.add(fileReader.next());
      fileReader.close();
    }catch (IOException e){
      System.out.println("Something's wrong with the file.");
    }//ends catch file errors

    return info;
  }//ends readFile

  /*
  Description: Gets word from file
  *Pre: LinkedList<String> list
  *Param: LinkedList<String> list
  *Post: None
  *Return: String word
  */
  public static String getWord(LinkedList<String> list)
  {
    try
    { 
      return list.get((int)(Math.random()*list.size()));
    }
    catch(NullPointerException e)
    {
      return "_";
    }//ends catch
  }//ends getNoun() method

  /*
  Description: Checks whether noun starts with a vowel.
  *Pre: String str
  *Param: String str
  *Post: None
  *Return: boolean vowel
  */
  public static boolean isVowel(String str)
  {
    return str.substring(0,1).toLowerCase().matches("[aeiou]");    
  }//ends isVowel

}//ends class