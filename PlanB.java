import java.util.*;
import java.io.IOException;//for file issues
import java.io.File;//used to read file
import java.io.FileWriter;//used to save file

public class PlanB
{
  public static ArrayList<String> nouns;
  public static ArrayList<String> verbs;
  public static ArrayList<String> articles;
  public static ArrayList<String> adjectives;//not used yet
  public static ArrayList<String> adverbs;//not used yet
  public static ArrayList<String> prepositionalPhrases;//not used yet
  public static ArrayList<String> conjunctions;//not used yet
    
  public static void main(/*String[] args*/)
  {
    setUpLists();
    System.out.print(buildSentence());
  }//ends main

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
  }

  public static String buildSentence()
  {
    String sentence = "";
    sentence += fullNoun(getWord(articles),getWord(nouns), "subject")+" ";
    sentence += fullVerb(getWord(verbs));
    //sentence += fullVerb("frown");

    if(sentence.substring(sentence.length()-2).equals("at") || Math.random()>0.5)sentence+=" "+fullNoun(getWord(articles),getWord(nouns),"object");

    return formatSentence(sentence);
  }//builds a sentence

  public static String getWord(ArrayList<String> list)
  {
    return list.get((int)(Math.random()*list.size()));
  }//ends getNoun() method

  private static void setUpLists()
  {
    articles = readFile("Word Bank/articles.txt");
    nouns = readFile("Word Bank/nouns.txt");
    verbs = readFile("Word Bank/verbs.txt");
  }//ends setUpLists method

  private static boolean isVowel(String str)
  {
    return str.substring(0,1).toLowerCase().matches("[aeiou]");    
  }//ends isVowel

  private static String fullNoun(String art, String n, String type)
  {
    String phrase = "";
    if(Math.random()*100>15)
    {
      if(art.equals("a")) phrase+=(isVowel(n))?"an":"a";
      else phrase+=art;
      //ADJECTIVES WILL GO HERE
      return phrase+" "+n;
    }
    else
    {
      if(type.equals("subject")) return "it";
      else return "them";
      //To do: make conjugation match other possible pronouns (ex. "they") and plural nouns
    }
  }//ends fullNoun method - changes A to An if neccessary, returns article+noun, when we want to add adjectives, they go here

  private static String fullVerb(String v)
  {
    String result = v.substring(0,v.length()-1);
    if(v.substring(v.length()-1).equals("y")) result+="ies";
    else if(v.substring(v.length()-1).equals("s")) result+="es";
    else result+=v.substring(v.length()-1)+"s";
    //ADVERBS and any other words that need to follow the verb (ex. "at" for the verb "looked at") WILL GO HERE
    if (v.equals("frown"))result+=" at";
    return result;
  }//returns complete, conjugated verb

  private static String formatSentence(String s)
  {    
    return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase()+".";
  }//ends formatSentence - puts a capital letter and a period

}//ends PlanB class 


//https://replit.com/talk/learn/Get-started-with-Web-Scraping/8930
//https://replit.com/@jajoosam/quote-scraper-starter

/* 
STEP 1: pull info from a website --

STEP 2: make a complete sentence
      2a - Randomize structure purpose (i.e. Statements, Questions, Exclamations) 
      2b - We can save a headache via making the user declare past/present/future tense beforehand
      2c - Simple Sentence Structure (i.e. Independent Clause, Object, Modifier (aka Subject Verb (maybe Direct Object)))
      2d - Complex Sentence Structure (i.e. Dependent clause, Independent Clause (Combine two sentences with commas))
      2e - Semi-colons.

STEP 3: make a story
*/