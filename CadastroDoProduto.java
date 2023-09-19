
  import java.util.Scanner;

    public class CadastroDoProduto {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Cadastro de Produto");

            String codigo = lerCodigo(scanner);
            String nome = lerNome(scanner);
            int quantidade = lerQuantidade(scanner);

            exibirProduto(codigo, nome, quantidade);

            int escolha = menuOperacao(scanner);

            switch (escolha) {
                case 0:
                    System.out.println("Saindo do programa. Obrigado!");
                    break;
                case 1:
                    quantidade = realizarVenda(quantidade, scanner);
                    exibirQuantidadeAtual(quantidade);
                    break;
                default:
                    System.out.println("Opção inválida. Saindo do programa.");
            }

            scanner.close(); // Fechar o scanner
        }

        public static String lerCodigo(Scanner scanner) {
            System.out.print("Digite o código do produto: ");
            return scanner.nextLine();
        }

        public static String lerNome(Scanner scanner) {
            System.out.print("Digite o nome do produto: ");
            return scanner.nextLine();
        }

        public static int lerQuantidade(Scanner scanner) {
            while (true) {
                try {
                    System.out.print("Digite a quantidade do produto: ");
                    return Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, digite uma quantidade válida.");
                }
            }
        }

        public static void exibirProduto(String codigo, String nome, int quantidade) {
            System.out.println("\nProduto cadastrado com sucesso!");
            System.out.println("Código: " + codigo);
            System.out.println("Nome: " + nome);
            System.out.println("Quantidade: " + quantidade);
        }

        public static int menuOperacao(Scanner scanner) {
            System.out.println("\nMenu de Operações:");
            System.out.println("1 - Realizar operação");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            return Integer.parseInt(scanner.nextLine());
        }

        public static int realizarVenda(int estoque, Scanner scanner) {
            int quantidadeVenda = lerQuantidadeVenda(scanner);

            if (quantidadeVenda <= estoque) {
                int novoEstoque = estoque - quantidadeVenda;
                System.out.println("Venda realizada com sucesso!");
                return novoEstoque;
            } else {
                System.out.println("Quantidade insuficiente em estoque.");
                return estoque;
            }
        }

        public static int lerQuantidadeVenda(Scanner scanner) {
            while (true) {
                try {
                    System.out.print("Digite a quantidade que deseja vender: ");
                    return Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, digite uma quantidade válida.");
                }
            }
        }

        public static void exibirQuantidadeAtual(int quantidade) {
            System.out.println("Quantidade atual em estoque: " + quantidade);
        }
    }




