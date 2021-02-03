package ExercícioPOO;

public class Lapiseira {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status() {
		System.out.println("Temos uma lapiseira "+this.cor);
		System.out.println("Tem ponta: "+this.ponta);
		System.out.println("Ela está tampada? " + this.tampada);
		
		}
	void rabiscar() {
		if(this.tampada ==true) {
			System.out.println("Infelizmente você não censegue rabiscar ");
		}
		else {
			System.out.println("Pronto pode Rasbiscar!!!");
		}
	}
	
}
