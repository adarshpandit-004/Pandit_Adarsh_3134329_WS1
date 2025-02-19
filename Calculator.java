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

    // Returns the sum of all grades in the array
    public int gradesTotal(int[] grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total;
    }

    // Returns the average of all grades in the array
    public double gradesAverage(int[] grades) {
        if (grades.length == 0) {
            return 0.0; // Handle empty array case
        }
        return (double) gradesTotal(grades) / grades.length;
    }

    // Counts how many grades are below the minimum passing grade
    public int countFails(int[] grades, int minGrade) {
        int count = 0;
        for (int grade : grades) {
            if (grade < minGrade) {
                count++;
            }
        }
        return count;
    }
}
