package Exerc�cioPOO;

public class Avi�o {
	private String cor;
	private String modelo;
	private String capacidade;

public Avi�o(String cor_Aviao, String modelo_Aviao, String capacidade_Aviao) {
	cor = cor_Aviao;
	modelo = modelo_Aviao;
	capacidade = capacidade_Aviao;

}
	public String getDados_Aviao() {
		String Dados_Aviao = cor+" "+modelo+" "+capacidade;
		return Dados_Aviao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	
}
