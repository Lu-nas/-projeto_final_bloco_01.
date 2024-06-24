package Servico;

public class ServiceBemEstar extends Service {
	private String tipoServico;

	public ServiceBemEstar(int id, String nome, String descricao, double preco, String tipoServico) {
		super(id, nome, descricao, preco);
		this.tipoServico = tipoServico;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("ID: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Preço: R$ " + preco);
		System.out.println("Tipo: " + tipoServico);
	}
}
