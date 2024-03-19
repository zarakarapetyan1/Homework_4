package problems;

public class Task240 {
    public static void main(String[] args) {
        int[] array = {12, 9, 89, 21, 76, 5, 2, 13, 15, 17, 19, 57, 7, 14, 27};
        int counter = 0;
        for (int j : array) {
            if (j % 7 == 0) {
                counter++;
            }
        }
        System.out.println("The number of elements multiple to 7 is equal to " + counter);
    }
}
