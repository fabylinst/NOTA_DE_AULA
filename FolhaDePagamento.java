import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do salário: ");
        double salario = scanner.nextDouble();

        double descontoIr = 0;

        if (salario <= 900) {
            descontoIr = 0;
        } else if (salario <= 1500) {
            descontoIr = salario * 0.05;
        } else if (salario <= 2500) {
            descontoIr = salario * 0.10;
        } else {
            descontoIr = salario * 0.20;
        }

        System.out.println("Desconto do Imposto de Renda: R$" + descontoIr);

        scanner.close();
    }
}
