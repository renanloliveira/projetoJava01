package repositories;

import java.io.PrintWriter;

import entities.Cliente;

public class ClienteRepository {

	public void exportarDados(Cliente cliente) {

		try {

			var printWriter = new PrintWriter("d:\\temp\\cliente_" + cliente.getId() + ".txt");

			printWriter.write("\nID do cliente...: " + cliente.getId());
			printWriter.write("\nNome............: " + cliente.getNome());
			printWriter.write("\nCPF.............: " + cliente.getCpf());
			printWriter.write("\nTelefone........: " + cliente.getTelefone());
			printWriter.write("\nEmail...........: " + cliente.getEmail());

			printWriter.close();
			System.out.println("\nDados gravados com sucesso!");

		} catch (Exception e) {
			System.out.println("\nFalha ao gravar arquivo" + e.getMessage());

		}

	}

}
