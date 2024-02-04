package fireDrillOne;

public class TaskEight {
    public static void main(String[] args) {
        int totalSum = 0;
        int number = 1;

        while (number <= 10) {
            if (number % 4 == 0) {
                for (int count = 1; count <= 5; count++) {
                    totalSum += number * count;
                }
            }
            number++;
        }
        int square = totalSum * totalSum;
        System.out.println("The square of the result is: " + square);
    }
}
