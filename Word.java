public class Word
{
  public String word;//make a setter later
  private String type;

  /*
  Description: Word constructor
  *Pre: String word, String type
  *Param: String word, String type
  *Post: None
  *Return: None
  */
  public Word(String word, String type)
  {
    this.word = word;
    this.type = type;
  }//ends constructor 2 parameters

  /*
  Description: Word constructor
  *Pre: String type
  *Param: String type
  *Post: None
  *Return: None
  */
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
      case "article":
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

  /*
  Description: Converts word toString
  *Pre: None
  *Param: None
  *Post: None
  *Return: String word
  */
  public String toString()
  {
    return word;
  }//ends toString
  
}//ends word class