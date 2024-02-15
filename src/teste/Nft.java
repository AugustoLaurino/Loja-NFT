package teste;

public class Nft {
	
	private int codNft;
	private String nomeNft;
	private String descNft;
	private String tagsNft;
	
	Nft (int recebeCodNft, String recebeNomeNft, String recebeDescNft, String recebeTagsNft){
		this.codNft = recebeCodNft;
		this.nomeNft = recebeNomeNft;
		this.descNft = recebeDescNft;
		this.tagsNft = recebeTagsNft;
	}
	
	public int getCodNft() {
		return codNft;
	}
	public void setCodNft(int codNft) {
		this.codNft = codNft;
	}
	public String getNomeNft() {
		return nomeNft;
	}
	public void setNomeNft(String nomeNft) {
		this.nomeNft = nomeNft;
	}
	public String getDescNft() {
		return descNft;
	}
	public void setDescNft(String descNft) {
		this.descNft = descNft;
	}
	public String getTagsNft() {
		return tagsNft;
	}
	public void setTagsNft(String tagsNft) {
		this.tagsNft = tagsNft;
	}
	
	
}
