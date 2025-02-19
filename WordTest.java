package griffith;
import static org.junit.jupiter.api.Assertions.*; // Importing necessary JUnit assertion methods
import org.junit.jupiter.api.Test;

public class WordTest {

    // Test for contains method
    @Test
    public void testContains() {
        Word word = new Word(new char[] {'a', 'b', 'c'}); // Sample input

        // Test cases for the contains method
        assertTrue(word.contains('a')); // Check if 'a' is in the word
        assertTrue(word.contains('b')); // Check if 'b' is in the word
        assertTrue(word.contains('c')); // Check if 'c' is in the word
        assertFalse(word.contains('d')); // Check if 'd' is NOT in the word
    }

    // Test for length method
    @Test
    public void testLength() {
        Word word = new Word(new char[] {'a', 'b', 'c'}); // Sample input

        // Test cases for the length method
        assertEquals(3, word.length()); // Check if length is 3 (the word has 3 letters)

        Word emptyWord = new Word(new char[] {}); // Empty word
        assertEquals(0, emptyWord.length()); // Check if length is 0 (empty word)

        Word singleLetterWord = new Word(new char[] {'z'}); // Single letter word
        assertEquals(1, singleLetterWord.length()); // Check if length is 1
    }

    // Test for not null check
    @Test
    public void testNotNull() {
        Word word = new Word(new char[] {'a', 'b', 'c'}); // Sample input

        // Test cases for the getLetters method
        assertNotNull(word.getLetters()); // Check if the letters array is not null

        Word emptyWord = new Word(new char[] {}); // Empty word
        assertNotNull(emptyWord.getLetters()); // Ensure it returns an empty array, but not null

        Word nullWord = new Word(null); // Null word passed to constructor
        assertNotNull(nullWord.getLetters()); // Ensure it returns an empty array, not null
    }
}
