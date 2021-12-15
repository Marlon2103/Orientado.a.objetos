package exercicioherançaepolimorfismo;

public class cavalo extends animal{
	
	private String cor;
	private Double valor ;
	private String pais;
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(double d) {
		this.valor = (double) d;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	

}
