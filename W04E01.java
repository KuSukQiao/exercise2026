package W04;
import java.util.Scanner;
// while: repeat the body as long as the condition is true. Every loop has four parts:
// 1 start value, 2 condition (tested before every pass), 3 body, 4 update (moves towards the end).
public class W04E01 {
    //import java.util.Random;
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

System.out.println("Enter the first integer: ");
int num1 = input.nextInt();
System.out.println("Enter the second integer: ");
int num2 = input.nextInt();
input.nextLine();
System.out.println("Enter a oparend: ");
String operand = input.nextLine();

switch (operand) {
	case "+":
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		break;
	case "-":
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		break;
        case "*":
		System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		break;
	case "/":
		if (num2 == 0) {
			System.out.println("Invalid");
		} else {
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
		} break;
	case "%":
		if (num2 == 0) {
			System.out.println("Invalid");
		} else {
			System.out.println(num1 + "%"+  num2 + "=" + (num1%num2));
		} break;
	default:
		System.out.println("Invalid operand");
}


    }
}
