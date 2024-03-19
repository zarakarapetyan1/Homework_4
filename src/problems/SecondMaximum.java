package problems;

public class SecondMaximum {
    public static void main(String[] args) {
        int[] array = {12, 23, 4, 23, 45, 6, 7, 45, 9, 45};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                counter++;
                if (counter == 2) {
                    System.out.println("Second occurrence of maximum " + max + " is found at index " + i);
                    break;
                }
            }
        }
    }
}
