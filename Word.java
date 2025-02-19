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

 // Stub method for contains - will be implemented in part three
//Implemented contains method
public boolean contains(char symbol) {
  for (char letter : letters) {
      if (letter == symbol) {
          return true;
      }
  }
  return false;
}


 // Stub method for length - will be implemented in part three
//Implemented length method
public int length() {
 return letters.length;
}

 // Stub method for getLetters - will be implemented in part three
 public char[] getLetters() {
     return null; // Placeholder, will be implemented in part three
 }
}
