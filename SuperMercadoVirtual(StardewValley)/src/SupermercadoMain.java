import java.util.Scanner;

import entidades.Produto;
import entidades.cadastro.Cadastro;
import entidades.cadastro.Cliente;
import entidades.exceptions.ProdutoNaoEncontradoException;
import entidades.mercadinho.Carrinho;
import entidades.mercadinho.Listas;

public class SupermercadoMain {
    private static Cadastro cadastro = new Cadastro();
    private static Carrinho carrinho = new Carrinho();
    private static Cliente clienteLogado;
    private static Scanner scanner = new Scanner(System.in);
    private static Listas lista;
    public static void main(String[] args) throws Exception {
        int opcao = scanner.nextInt();

        String mensagemDeBoasVindas = """
                ------------------------------------------------
                   Boas vindas ao mercado da vila Pelicanos
                ------------------------------------------------                
                """;
                System.out.println(mensagemDeBoasVindas);
        String Menu = """
                ----------------Menu de opções-----------------
                1.Cadastrar novo cliente;
                2.Login de cliente existente;
                3.Mostrar lista dos produtos;
                4.Adicionar ao Carrinho;
                5.Finalizar compra;
                6.Sair.
                """;
        
        while(opcao != 6){
            System.out.println(Menu);
            switch (opcao) {
                case 1:
                    cadastrarNovoCliente();
                    break;

                case 2:
                    loginClienteExistente();
                    break;

                case 3:
                    exibirProdutos();
                    break;

                case 4:
                    adicionarProdutoAoCarrinho();
                    break;   
                    
                case 5:
                    finalizarExpediente();
                    break;

                case 6:
                    System.out.println("Obrigado por visitar nosso supermercado");                
                break;    
                default:
                    break;
            }
        }        
    }
    
    public static void cadastrarNovoCliente(){
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe-nos a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite agora o seu ID:");
        double id = scanner.nextDouble();
        System.out.println("Qual o seu genero?");
        String genero = scanner.nextLine();

        cadastro.adicionarCliente(nome, idade, id, genero);
    }

    public static void loginClienteExistente(){
        System.out.println("Insira o seu Id: ");
        double id = scanner.nextDouble();
        clienteLogado = buscarClientePorId(id);
        
        }
    

    public static Cliente buscarClientePorId(double id){
        for(Cliente cliente : cadastro.getClientes()){
            if(cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public static void exibirProdutos() {
        for(Produto produto : lista.getProdutos()) {
            System.out.println(produto);
        }
    }

    public static void adicionarProdutoAoCarrinho(){
        System.out.println("Digite o nome do produto que deseja por no carrinho: ");
        String nomeProduto = scanner.nextLine();
        Produto produto = buscarProdutoPorNome(nomeProduto);
        if(produto.getNome() != null) {
            carrinho.adicionarAoCarrinho(produto);
            System.out.println("Compra finalizada com sucesso!!!!");
        } else {
            System.out.println("Erro, produto não encontrado");
        }  
    }

    public static Produto buscarProdutoPorNome(String nome){
    for(Produto produto : lista.getProdutos()) {
        if(produto.getNome().equalsIgnoreCase(nome)) {
            return produto;
        }
    }
    return null;
    }

    public static void finalizarExpediente() {
        carrinho.finalizarCompra();
    }
}
