import java.util.Scanner;

    class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Initialize the first two terms
        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}
