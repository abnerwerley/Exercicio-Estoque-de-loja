package br.com.exercicio.estoque;

//import java.util.ArrayList;
import java.util.Scanner;

public class LoginLoja {

	public void logando() {
		Scanner entrada = new Scanner(System.in);
		// ArrayList<String> login = new ArrayList<>();
		SuperDados dados = new SuperDados();
		Estoque estoque = new Estoque();

		String emailInformado;
		String senhaInformada;
		int tentativas;

		for (tentativas = 1; tentativas <= 3; tentativas++) {

			System.out.println("\nDigite seu e-mail:");
			emailInformado = entrada.next();
			System.out.println("Digite sua senha:");
			senhaInformada = entrada.next();

			if (emailInformado.equals(dados.getEmail1()) && senhaInformada.equals(dados.getSenha1())
					|| emailInformado.equals(dados.getEmail2()) && senhaInformada.equals(dados.getSenha2())) {
				estoque.estoque();
			} else {
				if (tentativas == 3) {
					System.out.println("Número de tentativas excedidas. Acesso negado.");
					break;
				}
				System.out.println("Senha ou e-mail incorretos, tente novamente.");
			}

		}
		
		entrada.close();
	}

}
