package calculadora;

public class SimplesCalculadora {
	
	 public static void main(String[] args) {
		 
		 int opcao = 1;
		 
		System.out.println("Escolha uma opção");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		
		switch (opcao) {
		case 1 : 
			System.out.println("Otimo, vamos somar dois números");
			break;
			
		case 2 : 
			System.out.println("Otimo, vamos subtrair dois números");
			break;
		
		case 3 : 
			System.out.println("Otimo, vamos multiplicar dois números");
			break;
			
		case 4 : 
			System.out.println("Otimo, vamos dividir dois números");
			break;

		default:
			break;
		}
	}
}
