package exercicio01;

public class Cliente {
	public String nome;
	public int idade;
	public String email;
	public String cpf;
	public String telefone;
	public double saldo;
	
	//metodos
	public void comprar(){
		System.out.println("Deseja comprar um Tennis?");
	}
	
	public void pagar(){
		if(saldo>=550.00){
			saldo-=550.00;
			System.out.println("Pagamento Feito com Sucesso!!!");
			System.out.printf("Seu saldo é R$ %.2f\n",saldo);
		}else{
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void reclamar(){
		System.out.println("Reclamação Registrada com sucesso!");
	}
	
	public void perguntarPreco(){
		System.out.println("Tennis custa R$ 550.00");
	}
	
	public void elogios(){
		System.out.println("Muito Obrigada Pelos Elogios!");
	}
	
	public void status(){
		System.out.println("Cliente: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Email: "+this.email);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Telefone: "+this.telefone);
		System.out.printf("Saldo: R$ %.2f\n",this.saldo);		
	}
}
