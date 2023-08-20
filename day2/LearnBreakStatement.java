package week1.day2;

public class LearnBreakStatement {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++)
		{
			if (i==5)
			{
				System.out.println("Four");
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Out of For Loop");
}
}