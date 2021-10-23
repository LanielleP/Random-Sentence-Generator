import java.util.*;
import java.io.IOException;//for file issues
import java.io.File;//used to read file
import java.io.FileWriter;//used to save file

public class PlanB
{
  public static ArrayList<String> nouns;
  public static ArrayList<String> verbs;
  public static ArrayList<String> articles;
    
  public static void main(/*String[] args*/)
  {
    articles = readFile("Word Bank/articles.txt");
    nouns = readFile("Word Bank/nouns.txt");
    verbs = readFile("Word Bank/verbs.txt");

    String article = getWord(articles);
    String subject = getWord(nouns);
    String verb = getWord(verbs);
    
    if(article.equals("a") && isVowel(subject))article = "an";
    if(verb.substring(verb.length()-1).equals("y"))verb = verb.substring(0,verb.length()-1)+"ies";
    else verb+="s";

    String sentence = article+" "+subject+" "+verb+". ";
    sentence = sentence.substring(0,1).toUpperCase()+sentence.substring(1).toLowerCase();

    System.out.print(sentence);
  }//ends main

  public static ArrayList<String> readFile(String file)
  {
    ArrayList<String> info = new ArrayList<String>();
    
    try
    {
      Scanner fileReader = new Scanner(new File(file));
      while(fileReader.hasNext()) info.add(fileReader.next());
      fileReader.close();
    }//ends try file stuff
    catch (IOException e)
    {
      System.out.println("Something's wrong with the file.");
    }//ends catch file errors

    
    return info;
  }

  public static String getWord(ArrayList<String> list)
  {
    return list.get((int)(Math.random()*list.size()));
  }//ends getNoun() method

  private static boolean isVowel(String str)
  {
    return str.substring(0,1).toLowerCase().matches("[aeiou]");    
  }//ends isVowel

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