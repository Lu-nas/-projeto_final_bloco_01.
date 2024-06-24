package experience;

import java.util.List;
import java.util.Scanner;

import Servico.Service;
import Servico.ServiceRepository;
import carrinho.CarrinhoController;

public class menu {
	private static ServiceRepository<Service> repository = new Servico.ServiceRepositoryImpl();
	private static CarrinhoController carrinhoController = new CarrinhoController();

	private static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Ola qual é o seu nome: ");
		String nome = ler.next();
		System.out.println("Seja bem vindo " + nome + " \n");

		int opcao;
		do {
			exibirMenu();
			opcao = ler.nextInt();
			ler.nextLine(); // Consumir a quebra de linha após o nextInt()

			switch (opcao) {
			case 1:
				verCatalogoServicos();
				break;
			case 2:
				adicionarAoCarrinho();
				break;
			case 3:
				verCarrinhoCompras();
				break;
			case 4:
				limparCarrinho();
				break;
			case 5:
				System.out.println("Finalizar compra.");
				break;
			case 6:
				System.out.println("Saindo do programa.");
				sobre();
				break;
			default:
				System.out.println("Opção inválida. Por favor, escolha novamente.");
				break;
			}
		} while (opcao != 6);

	}
	// System.out.println(servico.toString());

	private static void exibirMenu() {
		System.out.println("E-COMMERCE DE EXPERIÊNCES		");
		System.out.println("====== Menu Principal ==========");
		System.out.println("	1- Ver Catálogo de Serviços	");
		System.out.println("	2- Adicionar ao Carrinho	");
		System.out.println("	3- Ver Carrinho de Compras	");
		System.out.println("	4- Limpar Carrinho			");
		System.out.println("	5- Finalizar pedido			");
		System.out.println("	6- Sair						");
		System.out.print("	Escolha uma opção: 			");
	}

	private static void verCatalogoServicos() {
		System.out.println("====== Catálogo de Serviços ======");
		List<Service> todosServicos = repository.listarTodos();
		for (Service servico : todosServicos) {
			System.out.println("--------------------------");
			servico.exibirDetalhes();
		}
		System.out.println();
	}

	private static void adicionarAoCarrinho() {
		System.out.print("Digite o ID do serviço que deseja adicionar ao carrinho: ");
		int id = ler.nextInt();
		Service servicoSelecionado = repository.consultar(id);

		try {
			if (servicoSelecionado != null) {
				carrinhoController.adicionarAoCarrinho(servicoSelecionado);
				System.out.println("Serviço adicionado ao carrinho: " + servicoSelecionado.getNome());
			} else {
				System.out.println("Serviço não encontrado no catálogo.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void verCarrinhoCompras() {
		System.out.println("\n====== Carrinho de Compras ======");
		List<Service> itensCarrinho = carrinhoController.listarCarrinho();
		if (itensCarrinho.isEmpty()) {
			System.out.println("Carrinho vazio.");
		} else {
			double total = 0;
			for (Service servico : itensCarrinho) {
				servico.exibirDetalhes();
				total += servico.getPreco();
				System.out.println("--------------------------");
			}
			System.out.println("* Total: R$ " + total + "\n");
		}
	}

	private static void limparCarrinho() {
		carrinhoController.limparCarrinho();
		System.out.println("Carrinho de compras limpo.");
	}

	private static void sobre() {
		System.out.println("\n******************************************************");
		System.out.println("Projeto Desenvolvido por: Luana silva				 	");
		System.out.println("Generation Brasil - luanasilva.ss9497@gmail.com			");
		System.out.println("https://github.com/Lu-nas/-projeto_final_bloco_01		");
		System.out.println("\n******************************************************");
	}

}
