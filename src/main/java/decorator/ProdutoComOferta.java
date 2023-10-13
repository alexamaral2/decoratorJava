package decorator;

public class ProdutoComOferta extends DecoradorProduto {
    private String oferta;

    public ProdutoComOferta(Produto produto, String oferta) {
        super(produto);
        this.oferta = oferta;
    }

    @Override
    public String getNome() {
        return super.getNome() + " (Oferta: " + oferta + ")";
    }
}