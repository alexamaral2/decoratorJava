package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveRetornarNomeDoProduto() {
        Produto produto = new ProdutoSimples("Pão", 2.0);

        assertEquals("Pão", produto.getNome());
    }

    @Test
    void deveRetornarPrecoDoProduto() {
        Produto produto = new ProdutoSimples("Leite", 2.5);

        assertEquals(2.5, produto.getPreco(), 0.01);
    }

    @Test
    void deveRetornarNomeDoProdutoComDesconto() {
        Produto produto = new ProdutoSimples("Arroz", 5.0);
        Produto produtoComDesconto = new ProdutoComDesconto(produto, 0.2);

        assertEquals("Arroz", produtoComDesconto.getNome());
    }

    @Test
    void deveRetornarPrecoDoProdutoComDesconto() {
        Produto produto = new ProdutoSimples("Feijão", 4.0);
        Produto produtoComDesconto = new ProdutoComDesconto(produto, 0.1);

        assertEquals(3.6, produtoComDesconto.getPreco(), 0.01);
    }

    @Test
    void deveRetornarNomeDoProdutoComOferta() {
        Produto produto = new ProdutoSimples("Sabonete", 1.0);
        Produto produtoComOferta = new ProdutoComOferta(produto, "Compre 1 leve 2");

        assertEquals("Sabonete (Oferta: Compre 1 leve 2)", produtoComOferta.getNome());
    }
}
