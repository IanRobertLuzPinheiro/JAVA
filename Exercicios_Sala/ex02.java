package Exercicios_Sala;

import java.util.Scanner;

public class Cliente {
	private String nome, CPF;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Cliente(String nome, String cPF) {
		super();
		this.nome = nome;
		this.CPF = cPF;
		this.idade = 0;
	}
	
	public static void main(String[] args) {
		String nome, CPF;
		int idade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		nome = sc.nextLine();
		System.out.println("Digite o CPF: ");
		CPF = sc.nextLine();
		Cliente cliente = new Cliente(nome, CPF);
		System.out.println("Dados do cliente");
		System.out.println(cliente.getNome());
		System.out.println(cliente.getCPF());
		System.out.println(cliente.getIdade());
		System.out.println("Nova Idade");
		idade = sc.nextInt();
		cliente.setIdade(idade);
		System.out.println("Dados do cliente");
		System.out.println(cliente.getNome());
		System.out.println(cliente.getCPF());
		System.out.println(cliente.getIdade());
		
	}
	
}
