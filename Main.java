public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Funcionario Comum", 5000.0);
        Gerente gerente1 = new Gerente("João", 8000.0);
        Diretor diretor1 = new Diretor("Maria", 12000.0, 1000);

        System.out.println("Funcionário Comum:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: R$" + funcionario1.getSalario());

        System.out.println("\nGerente:");
        System.out.println("Nome: " + gerente1.getNome());
        System.out.println("Salário: R$" + gerente1.getSalario());

        System.out.println("\nDiretor:");
        System.out.println("Nome: " + diretor1.getNome());
        System.out.println("Salário: R$" + diretor1.getSalario());
        System.out.println("Ações: " + diretor1.getAcoes());
    }
}
