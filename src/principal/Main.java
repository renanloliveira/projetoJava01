package principal;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Cliente;
import repositories.ClienteRepository;

public class Main {

	public static void main(String[] args) {

		System.out.println("Sistema para cadastro de clientes");
		System.out.println("Turma de Java WebDeveloper - Sábado.");

		var cLiente = new Cliente();

		cLiente.setId(UUID.randomUUID());
		cLiente.setNome(JOptionPane.showInputDialog("Ïnforme o nome do cliente:"));
		cLiente.setCpf(JOptionPane.showInputDialog("Inform o cpf do cliente:"));
		cLiente.setTelefone(JOptionPane.showInputDialog("Informe o telefone do cliente"));
		cLiente.setEmail(JOptionPane.showInputDialog("Informe o email do cliente:"));

		System.out.println("\nDados do cliente:");
		System.out.println("\tId........" + cLiente.getId());
		System.out.println("\tNome......" + cLiente.getNome());
		System.out.println("\tCPF......." + cLiente.getCpf());
		System.out.println("\tTelefone.." + cLiente.getTelefone());
		System.out.println("\tEmail....." + cLiente.getEmail());

		var clienteRepository = new ClienteRepository();
		clienteRepository.exportarDados(cLiente);
	}

}
