import java.util.InputMismatchException;
import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        System.out.println("Enter total number of balls (integer values only greater than 0): ");
        Scanner scanner = new Scanner(System.in);
        int ballsCount;
        try {
            ballsCount = scanner.nextInt();
            if (ballsCount == 0) {
                System.out.println("Total number of balls should be greater than 0");
            } else {
                System.out.println("Total number of ways to remove the balls from the bag : " + countTotal(ballsCount));
            }
        } catch (InputMismatchException e) {
            System.out.println("Input type mismatch. Please enter integer values only");
        } catch (Exception e) {
            System.out.println("Something went wrong. Debug error : " + e.getLocalizedMessage());
        }
    }

    protected static int countTotal(int count) {
        if (count <= 2) {
            return count;
        }
        return countTotal(count - 1) + countTotal(count - 2);
    }
}
