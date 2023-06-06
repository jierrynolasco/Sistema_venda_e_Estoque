package repository;

import models.Cliente;

public class ClienteRepository {

    private Cliente[] clientes;

    public ClienteRepository() {
        this.clientes = new Cliente[100];
    }

    public void criar(Cliente cliente){
        for (int i = 0; i < this.clientes.length; i ++){
            if (this.clientes[i] == null){
                this.clientes[i] = cliente;
            }
        }
    }
}
