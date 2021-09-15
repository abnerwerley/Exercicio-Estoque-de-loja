package br.com.exercicio.estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
// Exercício 2 sobre collection | Author: Abner Werley Silva | Date: 13/set/2021

	static ArrayList<SuperProdutos> arrayP = new ArrayList<>();

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// ArrayList<SuperProdutos> arrayP = new ArrayList<>();

		String nome;
		String validade;
		int quantidade;
		int numLote;
		// int fabricadora;
		int quantosP = 1;
		int opcao;
		int remover;
		int i2 = 0;

		arrayP.add(new SuperProdutos("Açucar", "12/12/2021", 15, 9542));
		arrayP.add(new SuperProdutos("Arroz", "16/06/2022", 25, 1235));

		System.out.println("Muito bem vindo ao Sistema do Super Mercado.");
		System.out.println("______________________________________________\n");

		System.out.println("Quer adicionar ou remover produtos?" + "\n[1] Adicionar" + "\n[2] Remover");
		opcao = entrada.nextInt();
		if (opcao == 1) {
			System.out.println("\n______________________________________________\n");
			// System.out.println("Quantos produtos diferentes você quer cadastrar?");
			// quantosP = entrada.nextInt();

			for (int i = 1; i <= quantosP; i++) {
				// para adicionar produtos

				System.out.println("Digite o nome do produto que deseja adicionar:");
				nome = entrada.next();

				System.out.println("Digite a validade do lote (Ex: xx/xx/xxxx)");
				validade = entrada.nextLine();
				entrada.nextLine();

				System.out.println("Quantos unidades tem nesse lote?(Apenas números)");
				quantidade = entrada.nextInt();

				System.out.println("Numero do lote(Apenas números):");
				numLote = entrada.nextInt();

				arrayP.add(new SuperProdutos(nome, validade, quantidade, numLote)); // ao final de cada rodada do for, é
																					// adicionado os dados do produto ao
																					// array

				System.out.println("\n______________________________________________\n");

				System.out
						.println("Deseja fazer alguma alteração nos produtos existentes?" + "\n[1] sim" + "\n[2] não");
				opcao = entrada.nextInt();
				if (opcao == 1) {
					System.out.println("\n______________________________________________\n");
					for (SuperProdutos i1 : arrayP) {
						System.out.println("[" + (i2 + 1) + "] " + i1);
						i2++;
					}

					System.out.println();
					System.out.println("Qual deseja remover?.");
					remover = entrada.nextInt();
					switch (remover) {
					case 1:
						System.out.println("\n______________________________________________\n");
						i2++;
						arrayP.remove(0);
						for (SuperProdutos i1 : arrayP) {
							System.out.println(i1);
						}
						System.out.println();
						System.out.println("Produto removido.");
						break;

					case 2:
						System.out.println("\n______________________________________________\n");
						i2++;
						arrayP.remove(1); // remove o produto na posição 1 do ArrayList
						for (SuperProdutos i1 : arrayP) {
							System.out.println(i1);
						}
						System.out.println();
						System.out.println("Produto removido.");
						break;

					case 3:
						System.out.println("\n______________________________________________\n");
						i2++;
						arrayP.remove(2); // remove o produto na posição 2 do ArrayList
						for (SuperProdutos i1 : arrayP) {
							System.out.println(i1);
						}
						System.out.println("Produto removido.");
						break;
					}

				} else if (opcao == 2) {
					System.out.println("\n______________________________________________\n");
					System.out.println("Sistema encerrado.");
				} else {
					System.out.println("\n______________________________________________\n");
					System.out.println("Opção inválida.");

				}

			}

		} else if (opcao == 2) { // se a pessoa quiser remover....

			for (SuperProdutos i1 : arrayP) { // mostra os produtos já adicionados
				System.out.println("[" + (i2 + 1) + "] " + i1);
				i2++;
			}

			System.out.println();
			System.out.println("Qual deseja remover?");
			remover = entrada.nextInt();
			switch (remover) {
			case 1:
				i2++;
				arrayP.remove(0);
				for (SuperProdutos i1 : arrayP) { // remove o produto na posição 0 do ArrayList
					System.out.println(i1);
				}
				System.out.println();
				System.out.println("Produto removido.");
				break;
			case 2:
				i2++;
				arrayP.remove(1); // remove o produto na posição 1 do ArrayList
				for (SuperProdutos i1 : arrayP) {
					System.out.println(i1);
				}
				System.out.println();
				System.out.println("Produto removido.");
				break;

			case 3:
				i2++;
				arrayP.remove(2); // remove o produto na posição 2 do ArrayList
				for (SuperProdutos i1 : arrayP) {
					System.out.println(i1);
				}
				System.out.println("Produto removido.");
				break;
			}

		} else {
			System.out.println("Opção inválida");
		}

		entrada.close();
	}
}
