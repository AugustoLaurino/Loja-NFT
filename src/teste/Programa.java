package teste;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int resultado = 1;
		
		while(resultado != 7)
		{
			
			resultado = Integer.parseInt(JOptionPane.showInputDialog("Digite "
				+ "\n1 - Cadastro Pessoa F�sica\n2 - Cadastro Pessoa Jur�dica"
				+ "\n3 - Cadastrar Usu�rio\n4 - Cadastrar Endere�o "
				+ "\n5 - Cadastrar Loja\n6 - Cadastrar NFT\n7 - Finalizar"));
		
			if (resultado == 1) {
				//Instancia Pessoa Fisica
				Fisica fisica;
				fisica = new Fisica(
						JOptionPane.showInputDialog("Digite seu nome: "),
						JOptionPane.showInputDialog("Digite seu e-mail: "),
						JOptionPane.showInputDialog("Digite seu telefone: "),
						JOptionPane.showInputDialog("Digite seu CPF: "),
						JOptionPane.showInputDialog("Digite seu RG: "),
						JOptionPane.showInputDialog("Digite seu g�nero: "),
						JOptionPane.showInputDialog("Digite sua data de nascimento: "));
				
				System.out.println("\nSeu nome �: " + fisica.getNome() + 
						"\nSeu e-mail �: " + fisica.getEmail() + 
						"\nSeu telefone �: " + fisica.getTelefone() + 
						"\nSeu CPF �: " + fisica.getCpf() + 
						"\nSeu RG �: " + fisica.getRg() + 
						"\nSeu g�nero �: " + fisica.getGenero() +
						"\nSua data de nascimento �: " + fisica.getDataNasc());
				
			} else if (resultado == 2) {
				//Instancia Pessoa Juridica
				Juridica juridica;
				juridica = new Juridica(
						JOptionPane.showInputDialog("Digite seu nome: "),
						JOptionPane.showInputDialog("Digite seu e-mail: "),
						JOptionPane.showInputDialog("Digite seu telefone: "),
						JOptionPane.showInputDialog("Digite seu CNPJ: "),
						JOptionPane.showInputDialog("Digite a data de funda��o da empresa: "),
						JOptionPane.showInputDialog("Digite o tipo da empresa: "));
				
				System.out.println("\nSeu nome �: " + juridica.getNome() +
						"\nSeu e-mail �: " + juridica.getEmail() +
						"\nSeu telefone �: " + juridica.getTelefone() +
						"\nSeu CNPJ �: " + juridica.getCnpj() +
						"\nA data de funda��o da empresa �: " + juridica.getDataFundacao() +
						"\nO tipo da empresa �: " + juridica.getTipoEmpresa());	
				
			} else if (resultado == 3) {
				//instancia Usu�rio
				Usuario usuario;
				usuario = new Usuario(
						JOptionPane.showInputDialog("Digite seu nome: "),
						JOptionPane.showInputDialog("Digite seu e-mail: "),
						JOptionPane.showInputDialog("Digite seu telefone: "),
						JOptionPane.showInputDialog("Digite seu login: "),
						JOptionPane.showInputDialog("Digite sua senha: "));
				
				System.out.println("\nSeu nome �: " + usuario.getNome() + 
						"\nSeu e-mail �: " + usuario.getEmail() + 
						"\nSeu telefone �: " + usuario.getTelefone() + 
						"\nSeu login �: " + usuario.getLoginUser() + 
						"\nSua senha �: " + usuario.getSenhaUser());
				
			} else if (resultado == 4) {
				//instancia Endereco
				Endereco endereco;
				endereco = new Endereco(
				JOptionPane.showInputDialog("Digite seu Logradouro: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o N�mero: ")),
				JOptionPane.showInputDialog("Digite o Complemento: "),
				JOptionPane.showInputDialog("Digite seu Bairro: "),
				JOptionPane.showInputDialog("Digite sua Cidade: "),
				JOptionPane.showInputDialog("Digite seu estado: "),
				JOptionPane.showInputDialog("Digite seu CEP: "));
				
				System.out.println("\nSeu logradouro �: " + endereco.getLogradouro() + 
						"\nO numero �: " + endereco.getNumero() + 
						"\nO complemento �: " + endereco.getComplemento() + 
						"\nSeu bairro �: " + endereco.getBairro() + 
						"\nSua cidade �: " + endereco.getCidade() +
						"\nSeu estado �: " + endereco.getEstado() +
						"\nSeu CEP �: " + endereco.getCep());
				
			} else if (resultado == 5) {
				//instncia MLoja
				Mloja mloja;
				mloja = new Mloja(
				Integer.parseInt(JOptionPane.showInputDialog("Digite c�digo da sua loja: ")),
				JOptionPane.showInputDialog("Digite o nome da sua loja: "),
				JOptionPane.showInputDialog("Digite a descri��o da sua loja: "));
				
				System.out.println("\nO c�digo da Loja �: " + mloja.getCodLoja() + 
						"\nO nome da Loja �: " + mloja.getNomeLoja() + 
						"\nA descri��o da Loja �: " + mloja.getDescLoja());
				
			} else if (resultado == 6) {
				//instancia NFT
				Nft nft;
				nft = new Nft(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo do NFT: ")),
				JOptionPane.showInputDialog("Digite o nome do NFT: "),
				JOptionPane.showInputDialog("Digite a descri��o do NFT: "),
				JOptionPane.showInputDialog("Digite as tags do NFT: "));
				
				System.out.println("\nO c�digo do NFT �: " + nft.getCodNft() + 
						"\nO nome do NFT �: " + nft.getNomeNft() + 
						"\nA descri��o do NFT �: " + nft.getDescNft() +
						"\nAs tags do NFT �: " + nft.getTagsNft());
				
				} 
			}
		
		System.out.println("\nPrograma Finalizado! :)");
		}
	}				

