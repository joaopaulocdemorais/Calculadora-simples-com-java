package calculadora;

import javax.swing.JOptionPane;

public class SimplesCalculadora {

	public static void main(String[] args) {
		boolean sair = true;
		int opcao;
		double numero1;
		double numero2;

		do {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
											  "Escolha uma op��o\n"
											+ "1 - Somar\n"
											+ "2 - Subtrair\n"
											+ "3 - Multiplicar\n"
											+ "4 - Dividir\n"
											+ "5 - Sair"
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
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero"));
					numero2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero"));
					JOptionPane.showMessageDialog(null, "Resultado\n" + numero1 + " x " + numero2 + " = " + (numero1 * numero2));
					break;
	
				case 4:
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero"));
					numero2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero"));
					JOptionPane.showMessageDialog(null, "Resultado\n" + numero1 + " � " + numero2 + " = " + (numero1 / numero2));
					break;
					
				case 5: 
					JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema !!!");
					sair = false;
					break;
	
				default:
					break;
			}
		} while (sair);
				
	}
}
