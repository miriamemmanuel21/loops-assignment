package fireDrill2;
import java.util.Scanner;
public class SumCalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sum = 0;
            for (int number  = 0; number < 10; number++) {
                System.out.print("Enter score " + (number + 1) + ": ");
                int score = input.nextInt();
                if (score > 0) {
                    sum += score;
                }
            }
            System.out.println("The sum of the scores is: " + sum);
        }
    }


