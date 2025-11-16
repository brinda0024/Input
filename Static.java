import java.util.Scanner;
public class Static {
	static int add(int a, int b) { //function to add integers
		return a+b;
	}

	public static void main(String[] args) {
	Scanner myobj = new Scanner(System.in);
	System.out.println("Enter your first number: ");
	int first = myobj.nextInt();
	System.out.println("Enter your second number: ");
	int second = myobj.nextInt();
	System.out.println(add(first, second));

	}

}
