package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//WordTest.java
//Name: [Your Name]
//Student Number: [Your Student Number]

import static org.junit.jupiter.api.Assertions.*; // Importing necessary JUnit assertion methods
import org.junit.jupiter.api.Test;

public class WordTest {

 // Test for contains method
 @Test
 public void testContains() {
     Word word = new Word(new char[] {'a', 'b', 'c'}); // Sample input
     // assertTrue is used to check if the condition is true
     assertTrue(word.contains('a')); // This will fail until the method is implemented
     assertTrue(word.contains('b')); // This will fail until the method is implemented
     assertTrue(word.contains('c')); // This will fail until the method is implemented
 }

 // Test for length method
 @Test
 public void testLength() {
     Word word = new Word(new char[] {'a', 'b', 'c'}); // Sample input
     // assertEquals is used to check if the length matches the expected value
     assertEquals(3, word.length()); // This will fail until the method is implemented
 }

 // Test for not null check
 @Test
 public void testNotNull() {
     Word word = new Word(new char[] {'a', 'b', 'c'}); // Sample input
     // assertNotNull is used to check if the object is not null
     assertNotNull(word.getLetters()); // This will fail until the method is implemented
 }
}
