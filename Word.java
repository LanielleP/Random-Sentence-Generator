public class Word
{
  private String word;
  private String type;

  public Word(String word, String type)
  {
    this.word = word;
    this.type = type;
  }//ends constructor 2 parameters

  public Word(String type)
  {
    this.type = type;
    switch (type)
    {
      case "adjective":
        //Adjective();
        break;
      case "adverb":
        //Adverb();
        break;
      case "article";
        //Article();
        break;
      case "conjunction":
        //Conjucntion();
        break;
      case "noun":
        //Noun();
        break;
      case "verb":
        //Verb();
        break;
      default:
        System.out.println("Error in Word class");
    }//ends switch
  }//ends contructor 1 parameters

  public String toString()
  {
    return word;
  }//ends toString
  
}//ends word class