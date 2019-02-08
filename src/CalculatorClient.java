import java.rmi.Naming;

public class CalculatorClient {
	public static void main(String args[])
	{
		try {
			Calculator c = (Calculator)Naming.lookup("//localhost:1024/CalculatorService");
			System.out.println(c.add(1, 2));
			System.out.println(c.sub(15, 2));
			System.out.println(c.div(10, 2));
			System.out.println(c.mul(2, 2));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
