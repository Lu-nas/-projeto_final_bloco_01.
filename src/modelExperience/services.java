package modelExperience;

public class services extends experience {
	private String tipoServico;
	
	public services(int id, String nome, String descricao, double preco, int avaliacao, String tipoServico) {
		super(id, nome, descricao, preco, avaliacao);
		this.tipoServico = tipoServico;
	}

	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	
	// Sobrescrevendo o metodo 
	 @Override
	 public String toString(){
		 return "serviço: " + super.getDescricao() + ", preço: " + super.getPreco() 
		 		+ ", Avaliação: " + super.getAvaliacao();
	 }
	 //exibirExperience
}
