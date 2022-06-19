package exercicio01;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente cliente01 = new Cliente();		
		
		int res;
			
		System.out.println("Cadastro do Cliente:");
		System.out.print("Nome: ");
		cliente01.nome = sc.nextLine();
		
		System.out.print("idade: ");
		cliente01.idade = sc.nextInt();
		
		System.out.print("Email: ");
		sc.nextLine();
		cliente01.email = sc.nextLine();
		
		System.out.print("CPF: ");		
		cliente01.cpf = sc.nextLine();
		
		System.out.print("Telefone: ");
		cliente01.telefone = sc.nextLine();
		
		System.out.print("Saldo: ");
		cliente01.saldo = sc.nextDouble();		
		
		
		System.out.println("--------------------------------------");
		cliente01.comprar();
		
		do{			
			System.out.println("--------------------------------------");
			System.out.println("1 - Perguntar Preço");
			System.out.println("2 - Comprar");
			System.out.println("3 - Fazer Um Elogio");
			System.out.println("4 - Reclamar");
			System.out.println("5 - Status");
			System.out.println("0 - Sair");
			System.out.print("Digite sua Resposta: ");
			res =  sc.nextInt();
			System.out.println("--------------------------------------");
			
			if(res == 1){
				cliente01.perguntarPreco();
			}else if(res == 2){
				cliente01.pagar();
			}else if(res == 3){
				cliente01.elogios();
			}else if(res == 4){
				cliente01.reclamar();
			}else if(res == 5){
				cliente01.status();
			}else if(res == 0){
				System.out.println("Obrigado e Volte Sempre!");
			}else{
				System.out.println("Resposta Invalida!");
			}						
		}while(res != 0);
		
		sc.close();	
	}
}
