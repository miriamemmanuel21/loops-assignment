public class TaskSix {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 10) {
            if (number % 4 == 0) {
                for (int count = 1; count <= 5; count++) {
                    System.out.println(number * count + " ");
                }
            }
            number++;
        }
    }
}
