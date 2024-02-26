package folhaPagamento;

public class Gerente extends Funcionario{
    private double salario;

    public Gerente(String name, String cpf, double salario) {
        super(name, cpf);
        this.salario = salario;
    }

    public double calcularSalario(){
        return this.salario;
    }
}
