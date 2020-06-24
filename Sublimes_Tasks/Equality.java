public class Equality	{
	/*
	write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal

	*/
	public static void main(String[] args) {
		int n1 = 20;
		int n2 = 20;
		int n3 = 20;

		if (n1 == n2 ) 
			System.out.println(n1 + "and" + n2 + "are equal");
			
		else 

		if (n2 == n3) 
			System.out.println(n2 + "and" + n3 + "are equal");

		else

		if (n3 == n1 ) 
			System.out.println(n3 + "and" + n1 + "are equal");

		else

		if (n1 == n2 && n1 == n3 && n2 == n3) 
			System.out.println("all are equal");
		
		
	}
}