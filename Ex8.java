import java.util.Scanner;

public class Ex8
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    int Senha = 1234;
	    
		System.out.print("Digite a senha:  ");
		int Acesso = scanner.nextInt();
		
		if (Acesso == Senha) {
		    System.out.print("Acesso concedido. Pode entrar.");
		} else {
		    System.out.print("Acesso negado. Tente novamente.");
		}
	}
}
