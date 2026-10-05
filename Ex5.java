import java.util.Scanner;

public class Ex5
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.print("Valor da compra: ");
		double valor_compra = scanner.nextDouble();
		
		if (valor_compra > 100) {
		    double compra = valor_compra * 0.10;
		    double desconto = valor_compra - compra;
		    
		    System.out.print("Sua compra teve um desconto de 10%. De: " + valor_compra + " por " + desconto);
		} else {
		    System.out.print("Sua compra ficou no valor de: " + valor_compra);
		}
	}
}
