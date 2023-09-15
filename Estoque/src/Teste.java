import java.util.List;

class Teste {

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
