package exercicio02;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aviao plane01 = new Aviao();
		
		int res;
		
		System.out.println("Crie Seu Aviao:");
		System.out.print("Empresa: ");
		plane01.empresa = sc.nextLine();
		
		System.out.print("Modelo: ");
		plane01.modelo = sc.nextLine();
		
		
		System.out.print("Quantidade de Assentos: ");
		plane01.quantAssentos = sc.nextInt();
				
		System.out.print("Quantidade de Passageiros: ");
		plane01.quantPassageiros = sc.nextInt();
		
		do{			
			System.out.println("--------------------------------------");
			System.out.println("1 - Voar");
			System.out.println("2 - Abastecer");
			System.out.println("3 - Pousar");
			System.out.println("4 - Pedir Autorizacao");
			System.out.println("5 - Status");
			System.out.println("0 - Sair");
			System.out.print("Digite sua Ação: ");
			res =  sc.nextInt();
			System.out.println("--------------------------------------");
			
			if(res == 1){
				plane01.voar();
			}else if(res == 2){
				plane01.abastecer();
			}else if(res == 3){
				plane01.pousar();
			}else if(res == 4){
				plane01.pedirAutorizacao();
			}else if(res == 5){
				plane01.status();
			}else if(res == 0){
				System.out.println("Ate Breve!");
			}else{
				System.out.println("Resposta Invalida!");
			}						
		}while(res != 0);
		
		sc.close();
	}
}