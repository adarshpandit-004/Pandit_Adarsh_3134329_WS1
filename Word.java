package griffith;
//Word.java
//Name: Adarsh Pandit
//Student Number: 3134329
public class Word {

 // Attribute to hold the letters of the word
 private char[] letters;

 // Constructor to initialize the 'letters' attribute
 public Word(char[] letters) {
     // Ensure letters is not null
     if (letters == null) {
         this.letters = new char[0]; // Initialize with empty array if null is passed
     } else {
         this.letters = letters;
     }
 }

 // Method to check if the word contains a specific character
 public boolean contains(char symbol) {
     // Iterate through the letters array to check if the symbol is present
     for (char letter : letters) {
         if (letter == symbol) {
             return true; // Return true if symbol is found
         }
     }
     return false; // Return false if symbol is not found
 }

 // Method to return the length of the word (size of the letters array)
 public int length() {
     return letters.length; // Return the length of the letters array
 }

 // Method to return the letters of the word
 public char[] getLetters() {
     return letters; // Return the letters array
 }
}
