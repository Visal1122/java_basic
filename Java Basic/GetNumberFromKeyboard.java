import java.util.Scanner;
public class GetNumberFromKeyboard{
	public static void main(String[] arg){
		System.out.print("Please Input Your Number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Your Number is : " + number);
				
	
	}
}