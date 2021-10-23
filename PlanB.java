import java.util.*;
import java.io.IOException;//for file issues
import java.io.File;//used to read file
import java.io.FileWriter;//used to save file

public class PlanB
{
  public static String file = "Word Bank/nouns.txt";
  public static ArrayList<String> nouns = new ArrayList<String>();
    
  public static void main(/*String[] args*/)
  {
    
    try
    {
      Scanner fileReader = new Scanner(new File(file));
      while(fileReader.hasNext())
      {
        nouns.add(fileReader.nextLine());
      }//ends while file being read
    }//ends try file stuff
    catch (IOException e)
    {
      System.out.println("Something's wrong with the noun file.");
    }//ends catch file errors

    System.out.println(getNoun());
    
  }//ends main

  public static String getNoun()
  {
    return nouns.get((int)(Math.random()*nouns.size()));
  }//ends getNoun() method
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