import java.util.Scanner;
import models.Cliente;
import models.Produto;
import models.Fornecedor;
import repository.ClienteRepository;
import repository.ProdutoRepository;
import repository.FornecedorRepository;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ClienteRepository clienteRepository = new ClienteRepository();

        System.out.println("Cadastro de Cliente");
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(cpf, nome, email);
        clienteRepository.criar(cliente);

        System.out.println("Cliente cadastrado com sucesso!");

        System.out.println("Buscar Cliente");
        System.out.print("CPF do Cliente a ser buscado: ");
        String cpfBusca = scanner.nextLine();

        Cliente clienteBuscado = clienteRepository.buscar(cpfBusca);
        if (clienteBuscado != null) {
            System.out.println("Cliente encontrado: " + clienteBuscado.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }


        ProdutoRepository produtoRepository = new ProdutoRepository();

        System.out.println("Cadastro de Produto");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Nome: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        Produto produto = new Produto(id, nomeProduto, preco);
        produtoRepository.criar(produto);

        System.out.println("Produto cadastrado com sucesso!");

        System.out.println("Buscar Produto");
        System.out.print("ID do Produto a ser buscado: ");
        int idBusca = scanner.nextInt();

        Produto produtoBuscado = produtoRepository.buscar(idBusca);
        if (produtoBuscado != null) {
            System.out.println("Produto encontrado: " + produtoBuscado.getNome());
        } else {
            System.out.println("Produto não encontrado.");
        }

        FornecedorRepository fornecedorRepository = new FornecedorRepository();

        System.out.println("Cadastro de Fornecedor");
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();
        System.out.print("Razão Social: ");
        String razaoSocial = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        Fornecedor fornecedor = new Fornecedor(cnpj, razaoSocial, endereco);
        fornecedorRepository.criar(fornecedor);

        System.out.println("Fornecedor cadastrado com sucesso!");

        System.out.println("Buscar Fornecedor");
        System.out.print("CNPJ do Fornecedor a ser buscado: ");
        String cnpjBusca = scanner.nextLine();

        Fornecedor fornecedorBuscado = fornecedorRepository.buscar(cnpjBusca);
        if (fornecedorBuscado != null) {
            System.out.println("Fornecedor encontrado: " + fornecedorBuscado.getRazaoSocial());
        } else {
            System.out.println("Fornecedor não encontrado.");
        }

        scanner.close();
    }
}
