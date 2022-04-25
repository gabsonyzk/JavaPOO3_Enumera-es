package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.PedidoStatus;

public class Pedido {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private PedidoStatus status;
	
	private List<PedidoItem> itens = new ArrayList<>();
	
	private Cliente cliente;
	
	
	public Pedido() {
	}

	public Pedido(Date momento, PedidoStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<PedidoItem> getItens(){
		return itens;
	}
	
	public void addItens(PedidoItem item) {
		itens.add(item);
	}
	
	public void removeItens(PedidoItem item) {
		itens.remove(item);
	}
	public double total() {
		double sum = 0.0;
		for(PedidoItem item:itens) {
			sum+=item.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Pedido Status: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Pedido Itens: ");
		for(PedidoItem item: itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço Total: R$");
		sb.append(String.format("%.2f",total()));
		
		return sb.toString();
	}
	

}
