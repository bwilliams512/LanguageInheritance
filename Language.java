/*
This is a Language Inheritance project with three Java files.

I get to build a model to track inherited traits across families. 
In this case, we’ll focus on something that often varies between language 
families: word order — where the subject, verb, and object would go in a sentence.

Some ideas to make this Language Inheritance project better:

Build an array or ArrayList of several language objects and loop through them to call getInfo().
Add new methods that allow users to set a specific region, change the number of speakers, or modify the word order.
Create several more language family classes that pertain to languages you’re interested in.
Map out the sign language families.
Add in further linguistic features (e.g., which genders are used, whether the language is tonal, etc.).
*/

public class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  
  protected String wordOrder;

  // give Language a constructor that sets each field to the values passed in
  Language(String langName, int speakers, String regions, String wdOrder) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = wdOrder;
  }

  public void getInfo() {

    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);

  }

  public static void main(String[] args) {
    
    Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
spanish.getInfo();

  }

}