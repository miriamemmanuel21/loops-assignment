package fireDrillOne;
import java.util.Scanner;
public class TaskFive {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 10) {
            if (number % 4 == 0) {
                for (int count = 0; count < 5; count++) {
                    System.out.println(number + " ");
                }
            }
            number++;
        }
    }
}

