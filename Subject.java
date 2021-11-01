import java.util.*;

public class Subject//sentient?
{
  private static LinkedList<String> nouns;
  private static LinkedList<String> articles;
  private static LinkedList<String> adjectives;//not used yet  
  

  /*
  Description: Subject Constructor
  *Pre: None
  *Param: None
  *Post: None
  *Return: None
  */
  public Subject()
  {
    nouns = UsefulMethods.readFile("Word Bank/nouns.txt");
    articles = UsefulMethods.readFile("Word Bank/articles.txt");
    //adjectives = UsefulMethods.readFile("Word Bank/adjectives.txt");
  }//ends constructor
  
  /*
  Description: Gets the subject
  *Pre: None
  *Param: None
  *Post: None
  *Return: String subject
  */
  public static String getSubject(/*String art, String n*/)
  {
    String art = UsefulMethods.getWord(articles);
    String n = UsefulMethods.getWord(nouns);
    String phrase = "";
    if(Math.random()*100>15)
    {
      if(art.equals("a")) phrase+=(UsefulMethods.isVowel(n))?"an":"a";
      else phrase+=art;
      //ADJECTIVES WILL GO HERE
      return phrase+" "+n;
    }
    else
    {
      return "it";
      //To do: make conjugation match other possible pronouns (ex.   "they") and plural nouns
    }
  }//ends fullNoun method - changes A to An if neccessary, returns article+noun, when we want to add adjectives, they go here

}//ends Subject class