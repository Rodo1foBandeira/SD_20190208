import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer implements Remote{
	public CalculatorServer() {
		try {
			Calculator c = new CalculatorImpl();
			LocateRegistry.createRegistry(1024);
			Naming.rebind("//127.0.0.1:1024/CalculatorService", c);
			
		}catch(Exception e){
			System.out.print(e);
		}
	}
	
	public static void main(String args[]) {
		new CalculatorServer();
	}
}
