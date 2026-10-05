import java.util.Scanner;

public class Ex10
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("Frequência do aluno (%): ");
		int frequencia = sc.nextInt();
		
        if (frequencia >= 75) {
            System.out.println("Frequência adequada");
        } else {
            System.out.println("Frequência insuficiente");
        }
		
		sc.close();
	}
}
