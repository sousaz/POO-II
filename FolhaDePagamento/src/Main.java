import folhaPagamento.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcs = new ArrayList<>();
        funcs.add(new MensalFixo("hoberto", "1900", 2000));
        funcs.add(new Horista("monics", "3214214", 2000, 50, 100));
        funcs.add(new Comissionado("herbert", "823721a", 50000, 0.1));
        funcs.add(new ComissionadoEfetivo("bura", "duah232", 40000, 0.1, 2000));
        funcs.add(new Gerente("augusto", "666", 50000));

        FolhaPagamento fp = new FolhaPagamento(funcs);
        System.out.println("Total da folha: " + fp.gerarFolha());
    }
}