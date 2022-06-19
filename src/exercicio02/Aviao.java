package exercicio02;

public class Aviao {
	public String empresa;
	public String modelo;
	public int porcentGasolina;
	public int quantAssentos;
	public int quantPassageiros;
	public boolean voando;
	public boolean autorizacao;
	
	//metodo construtor
	
	public Aviao(){
		this.voando = false;
		this.autorizacao = false;
		this.porcentGasolina = 30;
	}
	
	//metodos
	
	public void voar(){
		if(this.voando==false && this.autorizacao == true && this.porcentGasolina>=50) {
			System.out.println("Voando... ... ...");
			this.porcentGasolina-=40;
			this.voando = true;
		}else if(this.autorizacao == false){
			System.out.println("Peça autorização para Central de Controle!");
		}else if(this.porcentGasolina<50){
			System.out.println("Gasolina abaixo de 50%, \nPor favor Reabastecer!");
		}else{
			System.out.println("O Avião ja esta voando!");
		}
		this.autorizacao = false;
	}
	
	public void abastecer(){
		if(this.voando==false && this.autorizacao == true) {
			if(this.porcentGasolina<=90){
				System.out.println("Abastecendo... ... ...");
				this.porcentGasolina+=10;
				System.out.println(this.porcentGasolina+"% de Gasolina");
			}else {
				System.out.println("Tanque Cheio!");
			}	
		}else if(this.autorizacao == false){
			System.out.println("Peça autorização para Central de Controle!");
		}else{
			System.out.println("Voce não pode abastecer em pleno voo!!!");
		}
		this.autorizacao = false;
	}
	
	public void pousar(){
		if(this.voando==true && this.autorizacao == true) {
			System.out.println("Pousando... ... ...");
			this.voando = false;
		}else if(this.autorizacao == false){
			System.out.println("Peça autorização para Central de Controle!");
		}else{
			System.out.println("O Avião ja esta no chão!");
		}
		this.autorizacao = false;
	}
	
	public void pedirAutorizacao(){
		System.out.println("Pedindo AUTORIZAÇÃO... ... ...");
		this.autorizacao = true;
		System.out.println("Pedido AUTORIZADO!!!");		
	}
	
	public void status(){
		
		System.out.println("Empresa: "+this.empresa);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Gasolina: "+this.porcentGasolina+"%");
		System.out.println("Quantidade de Assentos: "+this.quantAssentos);
		System.out.println("Quantidade de Passageiros: "+this.quantPassageiros);
	}	
}
