package teste;

public class Categoria {
	
	private String nomeCat;
	private String tagsCat;
	
	Categoria (String recebeNomeCat, String recebeTagsCat){
		this.nomeCat = recebeNomeCat;
		this.tagsCat = recebeTagsCat;
	}
	
	public String getNomeCat() {
		return nomeCat;
	}
	public void setNomeCat(String nomeCat) {
		this.nomeCat = nomeCat;
	}
	public String getTagsCat() {
		return tagsCat;
	}
	public void setTagsCat(String tagsCat) {
		this.tagsCat = tagsCat;
	}
	
	
}
