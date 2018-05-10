import java.util.Scanner;

class ForLoop
{
	public static void main(String[] args)
	{
		// Normal for loop
		for (int i = 10; i > 0; i++) System.out.println(i);

		// Enhanced for loop
		String[] countries = {"Ireland", "France", "Brazil"};
		for (String i: countries) System.out.println(i);
	}
}