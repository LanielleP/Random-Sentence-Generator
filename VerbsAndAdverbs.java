import java.util.*;
import java.io.IOException;//for file issues
import java.io.File;//used to read file

public class VerbsAndAdverbs
{
  private static LinkedList<Word> verbs;
  private static LinkedList<Word> adverbs;//not used yet
  
  /*
  Description: VerbsAndAdverbs constructor
  *Pre: None
  *Param: None
  *Post: None
  *Return: None
  */
  public VerbsAndAdverbs()
  {
    verbs = UsefulMethods.readFile("Word Bank/verbs.txt","verb");
    adverbs = UsefulMethods.readFile("Word Bank/adverbs.txt","adverb");    
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
    Word v = UsefulMethods.getWord(verbs);
    v.word = v.word.toLowerCase();
    String result = v.word.substring(0,v.word.length()-1);
    if(v.word.substring(v.word.length()-1).equals("y")&& (!v.word.equals("convey"))) result+="ies";
    else 
    {
      result+=v.word.substring(v.word.length()-1);
      if(v.word.substring(v.word.length()-1).equals("s")) 
      {
        result+="es";
      }
      else if(v.word.substring(v.word.length()-1).equals("h"))
      { 
        result+="es";
      }
      else result+="s";
    }//ends else
    //ADVERBS and any other words that need to follow the verb (ex. "at" for the verb "looked at") WILL GO HERE
    if (v.word.equals("frown"))result+=" at";
    if (v.word.equals("speak")||v.word.equals("respond"))result+=" to";
    //add "account for", but also fix the thing in the sentence generator that checks for a two letter word.
    return result;
  }//returns complete, conjugated verb

}//ends verb class