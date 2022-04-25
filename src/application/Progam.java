package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Pedido;
import entities.PedidoItem;
import entities.Produto;
import entities.enums.PedidoStatus;

public class Progam {

	public static void main(String[] args) throws ParseException {
		
		
		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do cliente: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento: dd/MM/yyyy: ");
		Date dataNas = sdf.parse(sc.next());
		sc.nextLine();
		Cliente cliente = new Cliente(name, email, dataNas);
		
		
		//System.out.println();
		
		System.out.println("Entre com os Dados do Pedido");
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		
		System.out.print("Quantos Itens tem no pedido?");
		int n = sc.nextInt();
		
		Pedido pedido = new Pedido(data, PedidoStatus.valueOf(status), cliente);
		
		for (int i = 1; i<=n;i++) {
			System.out.print("Digite os Dados do Nº"+i+" Item\n");
			System.out.print("Nome do Produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidadeItem = sc.nextInt();
			
			Produto produto = new Produto(nomeProduto,precoProduto);
			
			PedidoItem pedidoItem = new PedidoItem(quantidadeItem,precoProduto,produto);
			
			pedido.addItens(pedidoItem);
			
		}
		
		System.out.println();
		System.out.println("RESUMO DO PEDIDO:");
		System.out.println(pedido);
		
		sc.close();
	}

}
