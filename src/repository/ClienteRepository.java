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

    //metodo atualizar
    public void atualizar (Cliente cliente){
        Cliente aux = buscar(cliente.getCpf());
        if (aux != null) {
            if (cliente.getEmail() != null) {
                aux.setEmail(cliente.getEmail());
            } else if (cliente.getTelefone() != null) {
                aux.setTelefone(cliente.getTelefone());
            }else if(cliente.getEndereco().getCep() != null){
                aux.getEndereco().setCep(cliente.getEndereco().getCep());
            } else if (cliente.getEndereco().getCidade() != null) {
                aux.getEndereco().setCidade(cliente.getEndereco().getCidade());
            } else if (cliente.getEndereco().getBairro() != null) {
                aux.getEndereco().setBairro(cliente.getEndereco().getBairro());
            } else if (cliente.getEndereco().getRua() != null) {
                aux.getEndereco().setCidade(cliente.getEndereco().getRua());
            }
        }else{
            System.out.println("Cliente não encontrado ou existe");
        }

    }

    //metodo buscar
    public Cliente buscar (String cpf){
        for(int i = 0; i< clientes.length; i ++){
            if(clientes[i].getCpf().equals(cpf) ){
                return clientes[i];
            }
        }
        return null;
    }

    //metodo remover
        public void remover(Cliente cliente) {
            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i] != null && clientes[i].equals(cliente)) {
                    clientes[i] = null;
                    System.out.println("Cliente removido com sucesso.");
                    return;
                }
            }
            System.out.println("Cliente não encontrado ou não existe.");
        }

    }


