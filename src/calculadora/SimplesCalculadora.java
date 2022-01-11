package calculadora;

import javax.swing.JOptionPane;

public class SimplesCalculadora {

	public static void main(String[] args) {
		boolean sair = false;
		int opcao = 2;
		double numero1;
		double numero2;

		do {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
											  "Escolha uma opção\n"
											+ "1 - Somar\n"
											+ "2 - Subtrair\n"
											+ "3 - Multiplicar\n"
											+ "4 - Dividir\n"
									));

			switch (opcao) {
				case 1:
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero"));
					numero2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero"));
					JOptionPane.showMessageDialog(null, "Resultado\n" + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
					break;
	
				case 2:
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero"));
					numero2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero"));
					JOptionPane.showMessageDialog(null, "Resultado\n" + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
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
