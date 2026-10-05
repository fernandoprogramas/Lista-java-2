import java.util.Scanner;

public class Ex9
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.print("Digite a largura:  ");
		int Largura = scanner.nextInt();
		
		System.out.print("Digite a altura:  ");
		int Altura = scanner.nextInt();
		
		int retangulo = Altura * Largura;
		
		if (retangulo > 50) {
		    System.out.print("O retângulo tem uma aréa de " + retangulo + "m, aréa grande");
		} else {
		    System.out.print("O retângulo tem uma aréa de " + retangulo + "m, aréa pequena");
		}
	}
}
