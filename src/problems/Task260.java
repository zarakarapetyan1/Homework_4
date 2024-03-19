package problems;

public class Task260 {
    public static void main(String[] args) {
        //the index of the first smallest element
        int[] array = {12, 2, 9, 78, 76, 5, 2, 78, 15, 17, 19, 57, 27};
        int min = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] <= min) {
                min = array[j];
                index = j;

            }
        }

        System.out.println(index);

    }
}
