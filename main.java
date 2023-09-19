import java.util.Scanner;

public class main {
    private String codigo;
    private String nome;
    private int quantidade;

    public main(String codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void exibirProduto() {
        System.out.println("Produto cadastrado com sucesso!");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
    }

    public void realizarVenda(int quantidadeVenda) {
        if (quantidadeVenda <= quantidade) {
            quantidade -= quantidadeVenda;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    public void exibirQuantidadeAtual() {
        System.out.println("Quantidade atual em estoque: " + quantidade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Produto");

        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine();

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = Integer.parseInt(scanner.nextLine());

       main produto = new main(codigo, nome, quantidade);

        produto.exibirProduto();

        System.out.println("\nDeseja realizar uma venda?");
        System.out.println("1 - Sim");
        System.out.println("0 - Não");

        int escolha = Integer.parseInt(scanner.nextLine());

        switch (escolha) {
            case 1:
                System.out.print("Digite a quantidade que deseja vender: ");
                int quantidadeVenda = Integer.parseInt(scanner.nextLine());
                produto.realizarVenda(quantidadeVenda);
                produto.exibirQuantidadeAtual();
                break;
            case 0:
                System.out.println("Encerrando o programa.");
                break;
            default:
                System.out.println("Opção inválida. Encerrando o programa.");
        }

        scanner.close(); // Fechar o scanner
    }
}
