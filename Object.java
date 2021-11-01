import java.util.*;

public class Object //non-sentient?
{
  private static LinkedList<String> nouns;
  private static LinkedList<String> articles;
  private static LinkedList<String> adjectives;//not used yet  
  
  /*
  Description: Object Constructor
  *Pre: None
  *Param: None
  *Post: None
  *Return: None
  */
  public Object()
  {
    nouns = UsefulMethods.readFile("Word Bank/nouns.txt","noun");
    articles = UsefulMethods.readFile("Word Bank/articles.txt","article");
    //adjectives = UsefulMethods.readFile("Word Bank/adjectives.txt","adjective");
  }//ends constructor
  
  /*
  Description: gets Object
  *Pre: None
  *Param: None
  *Post: None
  *Return: object
  */
  public static String getObject()
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
      return "them";
      //To do: make conjugation match other possible pronouns (ex.   "they") and plural nouns
    }
  }//ends fullNoun method - changes A to An if neccessary, returns article+noun, when we want to add adjectives, they go here

}//ends Object class