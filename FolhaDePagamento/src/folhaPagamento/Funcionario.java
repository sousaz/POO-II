package folhaPagamento;

public abstract class Funcionario {
    private String name;
    private String cpf;

    public abstract double calcularSalario();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public Funcionario(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }
}
