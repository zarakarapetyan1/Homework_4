package problems;

public class Task237 {
    public static void main(String[] args) {
        int[] array = {12, 0, 89, 76, 5, 2, 13, 0, 17, 19, 57, 0};
        int counter = 0;

        for (int j : array) {
            if (j == 0) {
                counter++;
            }
        }
        System.out.println("The number of 0-s is equal to " + counter);
    }
}
