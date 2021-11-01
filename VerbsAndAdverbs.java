import java.util.*;
import java.io.IOException;//for file issues
import java.io.File;//used to read file

public class VerbsAndAdverbs
{
  private static LinkedList<String> verbs;
  private static LinkedList<String> adverbs;//not used yet
  
  /*
  Description: VerbsAndAdverbs constructor
  *Pre: None
  *Param: None
  *Post: None
  *Return: None
  */
  public VerbsAndAdverbs()
  {
    verbs = UsefulMethods.readFile("Word Bank/verbs.txt");
    adverbs = UsefulMethods.readFile("Word Bank/adverbs.txt");    
  }//ends constructor
   
  /*
  Description: Conjugates verb
  *Pre: int tense
  *Param: int tense
  *Post: None
  *Return: String conjugated verb
  */
  public static String conjugateVerb(/*int tense*/)
  {
    String v = UsefulMethods.getWord(verbs);
    v = v.toLowerCase();
    String result = v.substring(0,v.length()-1);
    if(v.substring(v.length()-1).equals("y")&& (!v.equals("convey"))) result+="ies";
    else 
    {
      result+=v.substring(v.length()-1);
      if(v.substring(v.length()-1).equals("s")) 
      {
        result+="es";
      }
      else if(v.substring(v.length()-1).equals("h"))
      { 
        result+="es";
      }
      else result+="s";
    }//ends else
    //ADVERBS and any other words that need to follow the verb (ex. "at" for the verb "looked at") WILL GO HERE
    if (v.equals("frown"))result+=" at";
    if (v.equals("speak")||v.equals("respond"))result+=" to";
    //add "account for", but also fix the thing in the sentence generator that checks for a two letter word.
    return result;
  }//returns complete, conjugated verb

}//ends verb class