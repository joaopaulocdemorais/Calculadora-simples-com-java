package calculadora;

import javax.swing.JOptionPane;

public class SimplesCalculadora {

	public static void main(String[] args) {
		boolean sair = true;
		String opcao;
		int op = 0;
		double numero1;
		double numero2;
		boolean numero = true;
		do {
			
			opcao = JOptionPane.showInputDialog(
											  "Escolha uma opção\n"
											+ "1 - Somar\n"
											+ "2 - Subtrair\n"
											+ "3 - Multiplicar\n"
											+ "4 - Dividir\n"
											+ "5 - Sair"
									);
			
			for (int i = 0; i < opcao.length(); i++) {
	            if (!Character.isDigit(opcao.charAt(i))) {
	                numero = false;
	            }
	        }
			
			if (numero) {
				op = Integer.parseInt(opcao);
				if(op > 5) {
					op = 0;
				}
			}
			

			switch (op) {
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
					JOptionPane.showMessageDialog(null, "Resultado\n" + numero1 + " ÷ " + numero2 + " = " + (numero1 / numero2));
					break;
					
				case 5: 
					JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema !!!");
					sair = false;
					break;
	
				case 0:
					JOptionPane.showMessageDialog(null, "Valor invalido, tente novamente");
					break;
			}
		} while (sair);
				
	}
}
