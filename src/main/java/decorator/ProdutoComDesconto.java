package decorator;

public class ProdutoComDesconto extends DecoradorProduto {
    private double desconto;

    public ProdutoComDesconto(Produto produto, double desconto) {
        super(produto);
        this.desconto = desconto;
    }

    @Override
    public double getPreco() {
        return super.getPreco() * (1 - desconto);
    }
}


