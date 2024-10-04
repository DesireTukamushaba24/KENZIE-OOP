package multiplicationtable;
import java.util.Scanner;
public class Multiplicationtable {

	public static void main(String[] args) {
		Scanner scanner = new
				Scanner(System.in);
		
		//while loop
		System.out.println("While loop Example :");
		System.out.println("Enter a number :");
		int number = scanner.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(number + "*" + i +"="+(number *i));
			i++;
		}while(i <=10);
		
		scanner.close();

	}

}
