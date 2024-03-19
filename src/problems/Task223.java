package problems;

public class Task223 {
    public static void main(String[] args) {

        int[] array = {12, -7, 89, 2, 54, 8, 2, -1, 88, -210, -9, 6, 17, -3};
        int a = -9;
        int b = 54;
        int counter = 0;
        for (int j : array) {
            if (j > a && j < b) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
