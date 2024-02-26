package folhaPagamento;

import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {
    private List<Funcionario> funcionarios;

    public FolhaPagamento(){
        this.funcionarios = new ArrayList<>();
    }

    public FolhaPagamento(List<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    }

    public void contratar(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public double gerarFolha(){
        double totaFolha = 0;

        for(Funcionario funcionario : funcionarios){
            totaFolha += funcionario.calcularSalario();
        }
        return totaFolha;
    }
}
