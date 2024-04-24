
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        int input = 0;

        System.out.println("Enter numbers: ");
        input = Integer.valueOf(scanner.nextLine());

        while (!(input == -1)) {
            statistics.addNumber(input);
            if (input % 2 == 0) {
                statisticsEven.addNumber(input);
            } else {
                statisticsOdd.addNumber(input);
            }

            input = Integer.valueOf(scanner.nextLine());
        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers,
        // and lastly the one that tracks the sum of odd numbers!
    }
}
