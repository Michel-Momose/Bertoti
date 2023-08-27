import java.util.LinkedList;
import java.util.List;

public class Estoque {

     private List<Produto> produtos = new LinkedList<Produto>();

     public void cadastrarProduto(Produto produto){
          produtos.add(produto);
     }

     public List<Produto> buscarProdutoPorCaracteristica(Caracteristica caract){
           List<Produto> produtosEncontrados = new LinkedList<Produto>();
           for(Produto produto:produtos){
                if(produto.getCaract().comparar(caract)) produtosEncontrados.add(produto);
           }
           return produtosEncontrados;
     }

     public Produto buscarProdutoPorCodigo(String codigoBarra){
          for(Produto produto:produtos){
               if(produto.getCodigoBarra().equals(codigoBarra)) return produto; 
          }
          return null;
     }

     public List<Produto> getProdutos(){
           return produtos;
     }
}
