import java.util.*;
import java.io.IOException;//for file issues
import java.io.File;//used to read file
import java.io.FileWriter;//used to save file

public class Test
{
  public static void main(String[] args)
  {
    //FIX LATER
    Object obj = new Object();
    Subject sbj = new Subject();
    VerbsAndAdverbs vAa = new VerbsAndAdverbs();
    
    for(int i=0;i<10;i++) System.out.println(SentenceBuilder.getSentence());
  }//ends main method

  /*
  Description: Returns the input from a given file as an ArrayList
  *Pre: String file
  *Param: String file
  *Post: None
  *Return: ArrayList<String> info
  */
  public static ArrayList<String> readFile(String file)
  {
    ArrayList<String> info = new ArrayList<String>();
    
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
  *Pre: ArrayList<String> list
  *Param: ArrayList<String> list
  *Post: None
  *Return: String word
  */
  public static String getWord(ArrayList<String> list)
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
}//ends test class

