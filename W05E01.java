package W05;
import java.util.Scanner;
// Nested loops: when nothing exits the inner loop early, it runs completely for every pass of the outer loop.
// 3 rows x 4 columns, so the inner body runs 3 x 4 = 12 times.
public class W05E01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	
	System.out.print("Enter an integer: ");
	int number = input.nextInt();
	
	System.out.print("The factors are: ");
	
	for (int factor = 1; factor <= number; factor++) {
		int remainder = number % factor;
		if (remainder ==0) {
			System.out.print(factor + ", ");
		}
	}

    }
}
