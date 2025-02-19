package griffith;
//Word.java
//Name: Adarsh Pandit
//Student Number: 3134329

public class Word {

 // Attribute to hold the letters of the word
 private char[] letters;

 // Constructor to initialize the 'letters' attribute
//Constructor implementation ensuring letters is not null
public Word(char[] letters) {
  if (letters == null) {
      this.letters = new char[0]; // Initialize with empty array if null is passed
  } else {
      this.letters = letters;
  }
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
