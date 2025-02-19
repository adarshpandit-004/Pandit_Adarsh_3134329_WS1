package griffith;
public class Calculator {

    // Returns the maximum grade in the array
    public int gradesMax(int[] grades) {
        if (grades.length == 0) {
            return Integer.MIN_VALUE; // Handle empty array case
        }
        
        int max = grades[0]; // Assume first element is max
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }
}
