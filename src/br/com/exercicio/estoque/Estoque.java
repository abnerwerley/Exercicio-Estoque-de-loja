package br.com.exercicio.estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<SuperProdutos> arrayP = new ArrayList<>();
		SuperProdutos produto1 = new SuperProdutos("Arroz", "16/06/2022", 25, 1235);
		SuperProdutos produto2 = new SuperProdutos("Açucar", "12/12/2021", 15, 9542);

		String nome;
		String validade;
		int quantidade;
		int numLote;
		// int fabricadora;
		int quantosP;
		int opcao;

		arrayP.add(produto1);
		arrayP.add(produto2);

		System.out.println("Quantos produtos diferentes você quer cadastrar?");
		quantosP = entrada.nextInt();
		for (int i = 1; i <= quantosP; i++) {

			System.out.println("\nDigite o nome do produto:");
			nome = entrada.next();

			System.out.println("Digite a validade do lote");
			validade = entrada.next();
			entrada.nextLine();

			System.out.println("Quantos unidades tem nesse lote?");
			quantidade = entrada.nextInt();

			System.out.println("Numero do lote:");
			numLote = entrada.nextInt();

			arrayP.add(new SuperProdutos(nome, validade, quantidade, numLote));

		}

		System.out.println(
				"Deseja fazer alguma alteração nos produtos existentes?" + "\nDigite 1 se sim" + "\nDigite 2 se não");
		opcao = entrada.nextInt();
		if (opcao == 1) {
			for (SuperProdutos i : arrayP) {
				System.out.println(i);
			}
			
		} else if (opcao == 2) {
			System.out.println("Sistema encerrado.");
		} else {
			System.out.println("Opção inválida.");
		}

		entrada.close();
	}
}
