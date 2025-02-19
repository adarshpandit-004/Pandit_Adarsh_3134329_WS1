package griffith;
//Word.java
//Name: Adarsh Pandit
//Student Number: 3134329

public class Word {

 // Attribute to hold the letters of the word
 private char[] letters;

 // Constructor to initialize the 'letters' attribute
 public Word(char[] letters) {
     this.letters = letters; // Assigning the input letters array to the instance variable
 }

 
//Implemented contains method
public boolean contains(char symbol) {
  for (char letter : letters) {
      if (letter == symbol) {
          return true;
      }
  }
  return false;
}


//Implemented length method
public int length() {
 return letters.length;
}

 
//Implemented getLetters method
public char[] getLetters() {
 return letters;
}

}
