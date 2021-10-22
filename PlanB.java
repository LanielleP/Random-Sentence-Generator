import java.util.*;
import java.io.IOException;//for file issues
import java.io.File;//used to read file
import java.io.FileWriter;//used to save file

public class PlanB
{
  public static void main(/*String[] args*/)
  {
    String file = "nouns.txt";
    System.out.println("test");
    try
    {
      Scanner fileReader = new Scanner(new File(file));
      String word;
      for(int i=0;i<(Math.random()*607+1);i++)
      {
        word = fileReader.nextLine();
      }
      System.out.println(word);
    } catch (IOException e){}

  }
}

//https://replit.com/talk/learn/Get-started-with-Web-Scraping/8930
//https://replit.com/@jajoosam/quote-scraper-starter

/* 
STEP 1: pull info from a website --

STEP 2: make a complete sentence
      2a - Randomize structure purpose (i.e. Statements, Questions, Exclamations) 
      2b - Simple Sentence Structure (i.e. Independent Clause, Object, Modifier (aka Subject Verb (maybe Direct Object)))
      2c - Complex Sentence Structure (i.e. Dependent clause, Independent Clause (Combine two sentences with commas))
      2d - Semi-colons.

STEP 3: make a story
*/