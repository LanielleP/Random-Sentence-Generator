import java.util.*;
import java.io.IOException;//for file issues
import java.io.File;//used to read file
import java.io.FileWriter;//used to save file

public class NounsAndAdjectives {
  public static ArrayList<String> nouns;
  public static ArrayList<String> adjectives;
  public static ArrayList<String> articles;

  public static ArrayList<String> readFile(String file) {
    ArrayList<String> info = new ArrayList<String>();

    try {
      Scanner fileReader = new Scanner(new File(file));
      while (fileReader.hasNext())
        info.add(fileReader.next());
      fileReader.close();
    } catch (IOException e) {
      System.out.println("Something's wrong with the file.");
    } // ends catch file errors

    return info;
  }

  private static void setUpLists() {
    articles = readFile("Word Bank/articles.txt");
    nouns = readFile("Word Bank/nouns.txt");
  }// ends setUpLists method

  public static String getWord(ArrayList<String> list) {
    return list.get((int) (Math.random() * list.size()));
  }// ends getNoun() method

  private static boolean isVowel(String str) {
    return str.substring(0, 1).toLowerCase().matches("[aeiou]");
  }// ends isVowel

  private static String fullNoun(String art, String n, String type) {
    String phrase = "";
    if (Math.random() * 100 > 15) {
      if (art.equals("a"))
        phrase += (isVowel(n)) ? "an" : "a";
      else
        phrase += art;
      // ADJECTIVES WILL GO HERE
      return phrase + " " + n;
    } else {
      if (type.equals("subject"))
        return "it";
      else
        return "them";
      // To do: make conjugation match other possible pronouns (ex. "they") and plural
      // nouns
    }
  }// ends fullNoun method - changes A to An if neccessary, returns article+noun,
   // when we want to add adjectives, they go here

  public static void main(String[] args) {
    setUpLists();
  }
}