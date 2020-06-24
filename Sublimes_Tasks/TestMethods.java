/*
 Sum,max,min of two numbers
*/ 
public class TestMethods	{
	public static void main(String[] args) {
		int a,b,sum,max,min;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter first number:");
		a = keyboard.nextInt();
		System.out.println("Enter second number:");
		b = keyboard.nextInt();

		sum(a,b);
		max();
		min();

	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int max(int a, int b) {
		if (a > b) 
			return a;
		else
			return b;
		
	}

	public static int min(int a, int b) {
		return (a < b) ? return a : return b;
			
		
	}
}