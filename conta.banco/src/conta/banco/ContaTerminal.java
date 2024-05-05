//Não consegui criar o nome do projeto separado por "-", o eclipse só permitiu com um ponto.
package conta.banco;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nomeCliente = input.nextLine();
		System.out.print("Digite sua agência: ");
		String agencia = input.nextLine();
	        
		System.out.print("Digite seu número: ");
		int numero = input.nextInt();

		System.out.print("Digite seu saldo: ");
		double saldo = input.nextDouble();

		System.out.print("Olá "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+ ", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
	    
	}
}
