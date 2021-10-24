import java.util.*;
import java.io.IOException;//for file issues
import java.io.File;//used to read file
import java.io.FileWriter;//used to save file

public class VerbsAndAdverbs
{
  public static ArrayList<String> verbs;
  public static ArrayList<String> adverbs;

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

  private static void setUpLists()
  {
    verbs = readFile("Word Bank/verbs.txt");
  }//ends setUpLists method

  private static String fullVerb(String v)
  {
    String result = v.substring(0,v.length()-1);
    if(v.substring(v.length()-1).equals("y")&& (!v.equals("convey"))) result+="ies";
    else if(v.substring(v.length()-1).equals("s")) result+="es";
    else result+=v.substring(v.length()-1)+"s";
    //ADVERBS and any other words that need to follow the verb (ex. "at" for the verb "looked at") WILL GO HERE
    if (v.equals("frown"))result+=" at";
    if (v.equals("speak"))result+=" to";
    return result;
  }//returns complete, conjugated verb

  public static void main(String[] args)
  {
    setUpLists();
  }

}