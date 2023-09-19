class gerente extends Funcionario {
    private String departamento;

    public gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void calcularBonus() {
        double bonus = getSalario() * 0.10; // 10% do salário como bônus
        System.out.println("Bônus do Gerente: R$" + bonus);
    }
}