package problems;

public class Task234 {
    public static void main(String[] args) {
        int[] array = {-12, -97, 8, -82, -54, -8, -2, -91, 88, -210, -9, 9, 17, 13, 17};
        int sum = 0;
        int counter = 0;

        for (int j : array) {
            if (j % 2 != 0) {
                sum += j;
                counter++;
            }
        }
        int mean = sum / counter;
        System.out.println("The mean of odd numbers is equal to " + mean);
    }
}
