import java.util.Scanner;

public class Ex6
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.print("Velocidade do carro: ");
		int Velocidade = scanner.nextInt();
		
		if (Velocidade > 80) {
		    System.out.print("Você estava andando a " + Velocidade + ". Você foi multado.");
		} else {
		    System.out.print("Você estava andando a " + Velocidade + ". Você está dentro do permitido.");
		}
	}
}
