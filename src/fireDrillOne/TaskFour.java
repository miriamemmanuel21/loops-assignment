package fireDrillOne;
import java.util.Scanner;
public class TaskFour {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 10) {
            if (number % 4 == 0) {
                System.out.println(number + " ");
            }
            number++;
        }
    }
}

