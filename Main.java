import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Generate a random array
        int[] testInput = generateRandomArray(10, 0, 100);

        // Increase the loop count to get better results once it works.
        TestSuite.run(testInput, 10000);
    }

    // Method to generate a random array of integers
    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
}

