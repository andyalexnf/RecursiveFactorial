import java.util.Scanner;


public class Factorial 
{
	public static void main(String[] args)
	{
		System.out.println("what number do you want the factorial of?");
		Scanner scan = new Scanner(System.in); 
		int num = scan.nextInt();
		int result = factorial(num);
		System.out.println("the factorial of "+num+" is: "+result);
	}
	public static int factorial(int num)
	{
		if(num == 1)
		{
			return 1;
		}
		return num * factorial(num - 1);		
	}
}
