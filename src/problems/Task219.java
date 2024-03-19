package problems;

public class Task219 {
    public static void main(String[] args) {
        int[] array = {12, 7, 89, 2, 54, 8, 2, 1, 0, 21, 17, 3};
        int k = 3;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
