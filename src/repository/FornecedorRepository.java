package repository;
import models.Fornecedor;

public class FornecedorRepository {
        private Fornecedor[] fornecedores;

        public FornecedorRepository() {
            this.fornecedores = new Fornecedor[100];
        }

        // Método criar
        public void criar(Fornecedor fornecedor) {
            for (int i = 0; i < this.fornecedores.length; i++) {
                if (this.fornecedores[i] == null) {
                    this.fornecedores[i] = fornecedor;
                    break;
                }
            }
        }

        // Método atualizar
        public void atualizar(Fornecedor fornecedorAtualizado) {
            for (int i = 0; i < this.fornecedores.length; i++) {
                if (this.fornecedores[i] != null && this.fornecedores[i].getCnpj().equals(fornecedorAtualizado.getCnpj())) {
                    this.fornecedores[i] = fornecedorAtualizado;
                    break;
                }
            }
        }

        // Método buscar
        public Fornecedor buscar(String cnpj) {
            for (Fornecedor fornecedor : this.fornecedores) {
                if (fornecedor != null && fornecedor.getCnpj().equals(cnpj)) {
                    return fornecedor;
                }
            }
            return null;
        }

        // Método remover
        public void remover(String cnpj) {
            for (int i = 0; i < this.fornecedores.length; i++) {
                if (this.fornecedores[i] != null && this.fornecedores[i].getCnpj().equals(cnpj)) {
                    this.fornecedores[i] = null;
                    break;
                }
            }
        }
    }





