package problems;

public class Task238 {
    public static void main(String[] args) {
        int[] array = {12, 9, 89, 76, 5, 2, 13, 15, 17, 19, 57, 27};
        int counter = 0;
        int sum = 0;
        int mean = 0;
        for (int j : array) {
            if (j % 3 == 0) {
                sum += j;
                counter++;
            }
        }
        mean = sum / counter;
        System.out.println("The mean of elements multiple to 3 is equal to " + mean);
    }
}
