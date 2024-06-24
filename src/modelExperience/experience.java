package modelExperience;

public abstract class experience {
	private int id;
	private String nome;
	private String descricao;
	private double preco;
	private int avaliacao;

	public experience(int id, String nome, String descricao, double preco, int avaliacao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.avaliacao = avaliacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return nome;
	}

	public void setTitulo(String titulo) {
		this.nome = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public void avaliarExperiencie(int novaAvaliacao) {
		// verificar a avallição
		if (novaAvaliacao >= 1 && novaAvaliacao <= 5) {
			avaliacao = novaAvaliacao;
		} else {
			System.out.println("Avaliação Invalida. A avaliação deve estar entre 1 e 5,");
		}
	}

	public void atualizarDescricao(String novaDescricao) {
		descricao = novaDescricao;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Titulo: " + nome + ", Descrição: " + descricao + ", Preco: R$" + preco;
	}

}
