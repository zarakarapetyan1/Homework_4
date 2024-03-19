package problems;

public class Task251 {
    public static void main(String[] args) {
        int[] array = {12, 9, 89, 76, 5, 2, 13, 15, 17, 19, 57, 27};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximum element of the array is " + max);

    }
}
