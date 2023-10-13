package decorator;

public abstract class DecoradorProduto implements Produto {
    private Produto produtoDecorado;

    public DecoradorProduto(Produto produto) {
        this.produtoDecorado = produto;
    }

    @Override
    public String getNome() {
        return produtoDecorado.getNome();
    }

    @Override
    public double getPreco() {
        return produtoDecorado.getPreco();
    }
}
