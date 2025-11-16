
import java.util.Scanner; //package needed to take input from user
public class user_input {

	public static void main(String[] args) {
		Scanner myobj= new Scanner(System.in);
		System.out.println("Enter your name: ");
		String username = myobj.nextLine(); //takes string (eg. name) input
		System.out.println("Enter your age: ");
		int userage= myobj.nextInt(); //takes integer (eg. age) input
		System.out.println(" ");
		
		System.out.println("Name = " + username);
		System.out.println("Age = " + userage);
	}

}
