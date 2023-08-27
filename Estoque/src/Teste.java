import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {

		Estoque estoque = new Estoque();
		
		assertEquals(estoque.getProdutos().size(), 0);
		
		estoque.cadastrarProduto(new Produto("refrigerante", "01215152", "vermelho"));
		estoque.cadastrarProduto(new Produto("suco", "01215157", "azul"));
		
		assertEquals(estoque.getProdutos().size(), 2);
		
		Produto produtoEncontrado = estoque.buscarProdutoPorCodigo("01215152");
		
		equals(produtoEncontrado.getCaract());
		
		List<Produto> produtoEcontrado = estoque.buscarProdutoPorCodigo(null);
	}

}
