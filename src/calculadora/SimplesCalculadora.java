package calculadora;

import javax.swing.JOptionPane;

public class SimplesCalculadora {

	public static void main(String[] args) {
		boolean sair = false;
		int opcao = 1;
		double numero1;
		double numero2;

		do {
			
			JOptionPane.showInputDialog(
					  "Escolha uma opção\n"
					+ "1 - Somar\n"
					+ "2 - Subtrair\n"
					+ "3 - Multiplicar\n"
					+ "4 - Dividir\n"
			);

			switch (opcao) {
				case 1:
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero"));
					numero2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero"));
					JOptionPane.showMessageDialog(null, "Resultado\n" + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
					break;
	
				case 2:
					
					break;
	
				case 3:
					
					break;
	
				case 4:
					
					break;
	
				default:
					break;
			}
		} while (sair);
				
	}
}
