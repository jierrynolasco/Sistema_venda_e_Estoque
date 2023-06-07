package repository;
import models.Produto;
public class ProdutoRepository {

    private Produto[]Produto;

    public ProdutoRepository() {
        this.Produto = new Produto[100];
    }

    //criar
    public void criar(Produto produto) {
        for (int i = 0 ; i < this.Produto.length; i++){
            if (this.Produto[i] == null){
                this.Produto[i] = produto;
                break;
            }
        }
    }

    //metodo atualizar

    //metodo buscar

    //metodo remover


}
