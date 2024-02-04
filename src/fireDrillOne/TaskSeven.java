package fireDrillOne;

public class TaskSeven {
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

        System.out.println("Total sum of pairs: " + totalSum);
    }
}