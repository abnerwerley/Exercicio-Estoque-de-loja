package br.com.exercicio.estoque;

public class Principal {

	public static void main(String[] args) {

		LoginLoja login = new LoginLoja();
		System.out.println("___________________________________________________________\n");
		System.out.println("Bem vindo ao Sistema do mercado, faça login para prosseguir");

		System.out.println("\n___________________________________________________________");
		login.logando();
	}
}
