package teste;

public class Compra {
	
	private int idCompra;
	private float valorCompra;
	private String dataCompra;
	
	Compra (int recebeIdCompra, Float recebeValorCompra, String recebeDataCompra){
		this.idCompra = recebeIdCompra;
		this.valorCompra = recebeValorCompra;
		this.dataCompra = recebeDataCompra;
	}
	
	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	
}
