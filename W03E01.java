package W03;

import java.util.Scanner;
// W02L02Q04
public class W03E01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the number of seconds: ");
	int timeSec = input.nextInt();
	
	int hour = timeSec / 3600;
	int moduloMin = timeSec % 3600;
	int minute = moduloMin / 60;
	int second = moduloMin % 60;
	
	System.out.println(timeSec + " seconds is " + hour + "hours, " + minute + "minutes and " + second + " second");
    }
}


