package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GradesTest {

    @Test
    void testGradesMax() {
        Grades grades = new Grades();

        // Test with positive values
        assertEquals(98, grades.gradesMax(new int[]{50, 80, 98, 70}));

        // Test with negative values
        assertEquals(-2, grades.gradesMax(new int[]{-10, -50, -2, -20}));

        // Test with an empty array (should handle properly)
        assertEquals(Integer.MIN_VALUE, grades.gradesMax(new int[]{}));
    }

    @Test
    void testGradesTotal() {
        Grades grades = new Grades();

        // Test with positive values
        assertEquals(248, grades.gradesTotal(new int[]{50, 80, 98, 20}));

        // Test with a mix of positive and negative values
        assertEquals(15, grades.gradesTotal(new int[]{-10, 30, -5, 0}));

        // Test with an empty array
        assertEquals(0, grades.gradesTotal(new int[]{}));
    }

    @Test
    void testGradesAverage() {
        Grades grades = new Grades();

        // Test with positive values
        assertEquals(62.0, grades.gradesAverage(new int[]{50, 80, 98, 20}));

        // Test with a mix of positive and negative values
        assertEquals(3.75, grades.gradesAverage(new int[]{-10, 30, -5, 10}));

        // Test with an empty array (should return 0 or handle gracefully)
        assertEquals(0.0, grades.gradesAverage(new int[]{}));
    }

    @Test
    void testCountFails() {
        Grades grades = new Grades();

        // Test with a passing and failing mix (minGrade = 50)
        assertEquals(2, grades.countFails(new int[]{45, 60, 20, 80, 30}, 50));

        // Test with all passing grades
        assertEquals(0, grades.countFails(new int[]{55, 70, 90}, 50));

        // Test with all failing grades
        assertEquals(3, grades.countFails(new int[]{30, 40, 45}, 50));
    }
}
