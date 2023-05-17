package school.sptech.projeto1.heranca;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }

    /**
     * Adiciona um Produto novo no carrinho. Caso o valor seja null o Produto
     * não deve ser adicionado
     *
     * Parâmetro produto: Novo Produto a ser adicionado
     */
    public void adicionarProduto(Produto produto) {
        if (produto != null) {
            produtos.add(produto);
        } else {
            System.out.println("O valor não pode ser null");
        }
    }

    /**
     * Remove um Produto do carrinho pelo índice. Caso o índice do produto for
     * inválido o método não deve lançar um erro de execução
     *
     * Parâmetro indice: Índice do Produto que será removido
     */
    public void removerProduto(int indice) {
        if (indice <= produtos.size() && indice > 0) {
            produtos.remove(indice);
        }
    }

    /**
     * Calcula o valor total de todos os itens do carrinho.
     *
     * Retorna valor total do carrinho
     */
    public Double calcularTotal() {
        Double totCarrinho = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            totCarrinho += produtos.get(i).getPreco();
        }
        return totCarrinho;
    }

    /**
     * Calcula o valor das parcelas de acordo com o número de vezes que o
     * usuário deseja parcelar.
     *
     * Parâmetro vezes: Número de vezes que o usuário deseja parcelar Retorna
     * total do carrinho parcelado
     */
    public Double parcelarCompra(Integer vezes) {
        return calcularTotal() / vezes;
    }

    /**
     * Encontra um Produto com o índice desejado. Caso o índice não seja
     * encontrado retorne null
     *
     * Parâmetro index: Índice do Produto Retorna Produto encontrado
     */
    public Produto findProdutoPeloIndice(Integer index) {
        for (Integer i = 0; i < produtos.size(); i++) {
            if (i.equals(index)) {
                return produtos.get(i);
            }
        }

        return null;
    }

    /**
     * Encontra um Produto com o nome desejado ignorando letras maiúsculas e
     * minúsculas.
     *
     * Caso um Produto não seja encontrado retorne null
     *
     * Parâmetro nome: Nome do Produto Retorna Produto encontrado
     */
    public Produto findProdutoPeloNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                return produtos.get(i);
            }
        }
        return null;
    }

    /**
     * Encontra todos os Produto de uma determinada categoria ignorando letras
     * maiúsculas e minúsculas.
     *
     * Caso não encontre nenhum Produto devolva uma lista vazia
     *
     * Parâmetro categoria: Categoria desejada Return Produtos encontrados
     */
    public List<Produto> findProdutoPorCategoria(String categoria) {
        List<Produto> produtosCategoria = new ArrayList<>();

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCategoria().equalsIgnoreCase(categoria)) {
                produtosCategoria.add(produtos.get(i));
            }
        }
        return produtosCategoria;
    }

    /**
     * Encontra todos os ProdutoInternacional presentes no Carrinho. Caso não
     * encontre nenhum ProdutoInternacional devolva uma lista vazia
     *
     * Retorna Produtos internacionais encontrados
     */
    public Integer countProdutosInternacionais() {
        Integer count = 0;

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i) instanceof ProdutoInternacional) {
                count++;
            }
        }

        return count;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
