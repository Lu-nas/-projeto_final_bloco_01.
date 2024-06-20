package menuExperience;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao;

		while (true) {
			System.out.println("***********************************************");
			System.out.println("												");
			System.out.println("		E-COMERCE DE EXPERIÊNCIAS				");
			System.out.println("												");
			System.out.println("************************************************");
			System.out.println("												");
			System.out.println("		1- Ver Catálogo de Experiencias 		");
			System.out.println("		2- Ver Detalhes de uma Experiência		");
			System.out.println("		3- Adicionar Experiência ao carrinho	");
			System.out.println("		4- Ver Carrinho de Compras 				");
			System.out.println("		5- Finalizar a Compra					");
			System.out.println("		6- Minhas Compras						");
			System.out.println("		7- Sair									");
			System.out.println("												");
			System.out.println("************************************************");
			System.out.println("Entre com a opção desejada						");
			System.out.println();

			opcao = ler.nextInt();

			switch (opcao) {
			// Experiencias disponiveis
			case 1:
				System.out.println("Catalogo de Experiências:\n");

				break;
			case 2:
				//
				System.out.println("Detalhes de uma Experiência:\n");

				break;
			case 3:
				System.out.println("Adicionar Experiência ao Carrinho: ");

				break;
			case 4:
				System.out.println("Carrinho de Compras: ");

				break;
			case 5:
				System.out.println("Finalizar Compra");

				break;
			case 6:
				// Exibir historico de compras do usuario
				System.out.println("Minhas Compras:\n");

				break;
			case 7:
				System.out.println("Obrigado por usar nosso E-Comerse de Experiencias!");
				sobre();
				ler.close();
				System.exit(0);
				break;
			default:
				System.out.println("\nOpção Invalida!\n");
				break;
			}
		}
	}

	private static void sobre() {
		System.out.println("\n******************************************************");
		System.out.println("Projeto Desenvolvido porÇ Luana silva				 	");
		System.out.println("Generation Brasil - luanasilva.ss9497@gmail.com			");
		System.out.println("https://github.com/Lu-nas/-projeto_final_bloco_01		");
		System.out.println("\n******************************************************");
	}

}
