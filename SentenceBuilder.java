import java.util.*;
import java.io.IOException;//for file issues
import java.io.File;//used to read file
import java.io.FileWriter;//used to save file

public class SentenceBuilder
{
  public static ArrayList<String> prepositionalPhrases;//not used yet
  public static ArrayList<String> conjunctions;//not used yet

  private static String indepdentClause()
  {
    String independent = "";
    return independent;
  }//Code to build Independent Clause

  private static String dependentClause()
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

  public static String getSentence()
  {
    String sentence = "";
    sentence += Subject.getSubject()+" ";
    sentence += VerbsAndAdverbs.conjugateVerb();
    //sentence += VerbsAndAdverbs.conjugateVerb("convey");

    if(sentence.substring(sentence.length()-3,sentence.length()-2).equals(" ") || Math.random()>0.1)sentence+=" "+Object.getObject();

    return formatSentence(sentence);
  }//builds a sentence

  private static String formatSentence(String s)
  {    
    return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase()+".";
  }//ends formatSentence - puts a capital letter and a period

  private static String formatSentence(ArrayList list)
  {    
    String s="";
    for(int i=0; i<list.size(); i++) s+=list.get(i)+"";
    return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase()+".";
  }//ends formatSentence - puts a capital letter and a period

}//ends SentenceBuilder class 