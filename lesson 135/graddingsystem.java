import java.util.*;

class Main {
    public static void main(String[] args) {
        int sum = 0;
        String result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int noOfSubjects = sc.nextInt();

        int marks[] = new int[noOfSubjects]; // initializing array

        System.out.println("Enter the marks of " + noOfSubjects + " subjects. Press Enter after each mark:");

        // Entering marks
        for (int i = 0; i < noOfSubjects; i++) {
            marks[i] = sc.nextInt();
        }

        // Calculating sum
        for (int j = 0; j < noOfSubjects; j++) {
            sum += marks[j];
        }

        // Calculating percentage
        double percentage = (double) sum / noOfSubjects;
        System.out.println("Your percentage: " + percentage);

        // Generating result based on percentage
        if (percentage >= 95) {
            result = "You scored O grade. Great Work!";
        } else if (percentage > 90) {
            result = "You scored A+. Well Done!";
        } else if (percentage > 80) {
            result = "You scored A. Good Job!";
        } else if (percentage > 70) {
            result = "You scored B. Keep Trying!";
        } else if (percentage > 60) {
            result = "You scored C. You passed!";
        } else {
            result = "You failed. Better luck next time.";
        }

        System.out.println(result);
    }
}
