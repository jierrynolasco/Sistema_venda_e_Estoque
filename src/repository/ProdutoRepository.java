package repository;
import models.Cliente;
import models.Produto;
public class ProdutoRepository {

    private Produto[] Produto;

    public ProdutoRepository() {
        this.Produto = new Produto[100];
    }

    //criar
    public void criar(Produto produto) {
        for (int i = 0; i < this.Produto.length; i++) {
            if (this.Produto[i] == null) {
                this.Produto[i] = produto;
                break;
            }
        }
    }

    //metodo atualizar
    public void atualizar(Produto produtoAtualizado) {
        for (int i = 0; i < this.Produto.length; i++) {
            if (this.Produto[i] != null && this.Produto[i].getId() == produtoAtualizado.getId()) {
                this.Produto[i] = produtoAtualizado;
                break;
            }
        }
    }


    //metodo buscar
    public Produto buscar(int id) {
        for (Produto Produto : this.Produto) {
            if (Produto != null && Produto.getId() == id) {
                return Produto;
            }
        }
        return null;
    }

    //metodo remover
    public void remover(int id) {
        for (int i = 0; i < this.Produto.length; i++) {
            if (this.Produto[i] != null && this.Produto[i].getId() == id) {
                this.Produto[i] = null;
                break;
            }
        }
    }

}
