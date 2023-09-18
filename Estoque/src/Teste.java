import java.util.List;
import org.junit.Test.*;
import static org.junit.Assert.assertEquals;

class Teste {

	void test() {

		Estoque estoque = new Estoque();
		
		estoque.cadastrarProduto(new Produto("01215152", new Caracteristica("Milk", "Chocolate", "Doces")));
		
		assertEquals(estoque.getProdutos().size(), 1);
		
		Produto produtoEncontrado = estoque.buscarProdutoPorCodigo("01215152");
		
		equals(produtoEncontrado.getCaract());
		
	}

}
