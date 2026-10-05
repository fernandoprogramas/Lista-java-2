import java.util.Scanner;

public class Ex7
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.print("Quantos graus está agora? ");
		int Temperatura = scanner.nextInt();
		
		if (Temperatura >= 25) {
		    System.out.print("Hoje está quente, está fazendo " + Temperatura + " graus");
		} else {
		    System.out.print("Hoje está frio, está fazendo " + Temperatura + " graus");
		}
	}
}
