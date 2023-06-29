package models;

public class Fornecedor {
    private String cnpj;

    private String razaoSocial;

    private Endereco endereco;


    public Fornecedor(String cnpj, String razaoSocial, String endereco){}
    public Fornecedor(String cnpj, String razaoSocial, Endereco endereco) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

