import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Teste {

    @Test
    public void testBuscarProdutoPorCodigo() {
        Estoque estoque = new Estoque();
        estoque.cadastrarProduto(new Produto("01215152", new Caracteristica("Milk", "Chocolate", "Doces")));

        assertEquals(1, estoque.getProdutos().size());

        Produto produtoEncontrado = estoque.buscarProdutoPorCodigo("01215152");

        assertEquals("01215152", produtoEncontrado.getCodigoBarra());

        // Restante do seu código para buscar por característica
        Caracteristica caract1 = new Caracteristica("Marca1", "ProdutoA", "DepartamentoX");
        Caracteristica caract2 = new Caracteristica("Marca2", "ProdutoB", "DepartamentoY");
        Caracteristica caract3 = new Caracteristica("Marca1", "ProdutoC", "DepartamentoX");

        Produto produto1 = new Produto("Produto1", caract1);
        Produto produto2 = new Produto("Produto2", caract2);
        Produto produto3 = new Produto("Produto3", caract3);

        List<Produto> produtos = new LinkedList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        List<Produto> produtosEncontrados = estoque.buscarProdutoPorCaracteristica(caract1);

        assertEquals(2, produtosEncontrados.size());
        assertTrue(produtosEncontrados.contains(produto1));
        assertTrue(produtosEncontrados.contains(produto3));
    }

    @Test
    public void testBuscarProdutoPorCodigoNaoEncontrado() {
        Produto produto1 = new Produto("Produto1", "123456");
        Produto produto2 = new Produto("Produto2", "789012");
        Produto produto3 = new Produto("Produto3", "345678");

        List<Produto> produtos = new LinkedList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        Estoque estoque = new Estoque(produtos);

        Produto produtoEncontrado = estoque.buscarProdutoPorCodigo("999999");

        assertNull(produtoEncontrado);
    }
}
