public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");
         int n = input.length;
         for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = 1 + 1; j < n; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
            }
         }
        int temp = input[minIndex];
        input[minIndex] = input[i];
        input[i] = temp;
        }
    }
}
