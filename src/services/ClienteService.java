package services;

import models.Cliente;
import repository.ClienteRepository;

public class ClienteService {

    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public void criar (Cliente cliente){
        if(cliente.getCpf().length() != 11 ){

        } else if (cliente.getNome() == null) {

        } else if (cliente.getEndereco().getCep().length() != 8) {

        }else {
            repository.criar(cliente);
        }

    }
}
