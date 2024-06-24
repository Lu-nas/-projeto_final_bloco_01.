package carrinho;


import java.util.ArrayList;
import java.util.List;

import Servico.Service;

public class CarrinhoController {
	private List<Service> carrinhoCompras;

	public CarrinhoController() {
		this.carrinhoCompras = new ArrayList<>();
	}

	// add um serviço ao carrinho
	public void adicionarAoCarrinho(Service servico) {
		carrinhoCompras.add(servico);
	}

	// Vou desenvolver Método para remover um serviço do carrinho
	
	// list todos os serviços no carrinho
	public List<Service> listarCarrinho() {
		return new ArrayList<>(carrinhoCompras);
	}

	// limpar o carrinho
	public void limparCarrinho() {
		carrinhoCompras.clear();
	}
}