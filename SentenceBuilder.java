import java.util.*;
import java.io.IOException;//for file issues
import java.io.File;//used to read file
import java.io.FileWriter;//used to save file

public class SentenceBuilder
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

  public static String indepdentClause()
  {
    String independent = "";
    return independent;
  }//Code to build Independent Clause

  public static String dependentClause()
  {
    String dependent = "";
    return dependent;
  }//Code for Dependent Clause

  public static int sentenceTense()
  {
    Scanner se = new Scanner(System.in);
    int tense = -1;
    int valid = -1;
    while(valid == -1){
      System.out.println("Please choose 0 - past; 1 - present, 2 - future");
      tense = Integer.valueOf(se.nextLine());   
      if(tense == 0)
      {
        valid++;
      }
      else if (tense == 1)
      {
        valid++;
      }
      else if (tense == 2)
      {
        valid++;
      }
      else{
        System.out.println("Unvalid Input");
      }
    }//ends while loop

    return tense;
  }//ends sentenceTense method

  public static String buildSentence()
  {
    String sentence = "";
    sentence += fullNoun(getWord(articles),getWord(nouns), "subject")+" ";
    sentence += VerbsAndAdverbs.conjugateVerb(getWord(verbs), 0);
    //sentence += VerbsAndAdverbs.conjugateVerb("convey");

    if(sentence.substring(sentence.length()-3,sentence.length()-2).equals(" ") || Math.random()>0.1)sentence+=" "+fullNoun(getWord(articles),getWord(nouns),"object");

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
      //To do: make conjugation match other possible pronouns (ex.   "they") and plural nouns
    }
  }//ends fullNoun method - changes A to An if neccessary, returns article+noun, when we want to add adjectives, they go here

  private static String formatSentence(String s)
  {    
    return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase()+".";
  }//ends formatSentence - puts a capital letter and a period

}//ends SentenceBuilder class 


