import java.util.*;

public class Subject//sentient?
{
  private static ArrayList<String> nouns;
  private static ArrayList<String> articles;
  private static ArrayList<String> adjectives;//not used yet  
  
  public Subject()
  {
    nouns = Test.readFile("Word Bank/nouns.txt");
    articles = Test.readFile("Word Bank/articles.txt");
    //adjectives = Test.readFile("Word Bank/adjectives.txt");
  }//ends constructor
  
  public static String getSubject(/*String art, String n*/)
  {
    String art = Test.getWord(articles);
    String n = Test.getWord(nouns);
    String phrase = "";
    if(Math.random()*100>15)
    {
      if(art.equals("a")) phrase+=(Test.isVowel(n))?"an":"a";
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