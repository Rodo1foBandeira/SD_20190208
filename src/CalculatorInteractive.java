import java.rmi.Naming;

import javax.swing.JOptionPane;

public class CalculatorInteractive {

	public static void main(String[] args) {
		String op[] = {"+","-","*","/"};
		int operacao = JOptionPane.showOptionDialog(null, "Escolha uma das Operações", "Tipo de Operação", 0, JOptionPane.INFORMATION_MESSAGE, null, op, op[0]);
		long a = Long.parseLong(JOptionPane.showInputDialog(null, "Valor A", "0"));
		long b = Long.parseLong(JOptionPane.showInputDialog(null, "Valor B", "0"));
		try {
			Calculator c = (Calculator)Naming.lookup("//localhost:1024/CalculatorService");
			switch (operacao)
			{
			case 0:
				JOptionPane.showMessageDialog(null, "Resultado: "+c.add(a, b), "Resultado", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case 1:
				JOptionPane.showMessageDialog(null, "Resultado: " + c.sub(a, b), "Resultado", JOptionPane.INFORMATION_MESSAGE);
				break;
			
			case 2:
				JOptionPane.showMessageDialog(null, "Resultado: " + c.mul(a, b), "Resultado", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case 3:
				JOptionPane.showMessageDialog(null, "Resultado: " + c.div(a, b), "Resultado", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
