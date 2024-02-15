package teste;

public class Mloja {
	
	private int codLoja;
	private String nomeLoja;
	private String descLoja;
	
	Mloja (int recebeCodLoja, String recebeNomeLoja, String recebeDescLoja){
		this.codLoja = recebeCodLoja;
		this.nomeLoja = recebeNomeLoja;
		this.descLoja = recebeDescLoja;
	}
	
	public int getCodLoja() {
		return codLoja;
	}
	public void setCodLoja(int codLoja) {
		this.codLoja = codLoja;
	}
	public String getNomeLoja() {
		return nomeLoja;
	}
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	public String getDescLoja() {
		return descLoja;
	}
	public void setDescLoja(String descLoja) {
		this.descLoja = descLoja;
	}
	
}
