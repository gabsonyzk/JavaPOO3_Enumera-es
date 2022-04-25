package entities;

public class PedidoItem {
	
	private Integer quantidadeItem;
	private Double precoItem;
	
	private Produto produto;
	
	public PedidoItem() {
	}

	
	
	public PedidoItem(Integer quantidadeItem, Double precoItem, Produto produto) {
		this.quantidadeItem = quantidadeItem;
		this.precoItem = precoItem;
		this.produto = produto;
	}

	

	public Integer getQuantidadeItem() {
		return quantidadeItem;
	}



	public void setQuantidadeItem(Integer quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}



	public Double getPrecoItem() {
		return precoItem;
	}



	public void setPrecoItem(Double precoItem) {
		this.precoItem = precoItem;
	}



	public Produto getProduto() {
		return produto;
	}



	public void setProduto(Produto produto) {
		this.produto = produto;
	}



	public double subTotal() {
		Double subTotal = quantidadeItem * precoItem;
		return subTotal;
	}

	@Override
	public String toString() {
		return produto.getNomeProduto()
				+", R$"
				+String.format("%.2f", precoItem)
				+", Quantidade: "
				+quantidadeItem
				+", SubTotal: R$"
				+String.format("%.2f", subTotal());
	}
	
	
	
}
