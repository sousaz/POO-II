import atividade01.Coletavel;
import atividade01.Espada;
import atividade01.Heroi;
import atividade01.Monstro;
import folhaPagamento.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        List<Funcionario> funcs = new ArrayList<>();
//        funcs.add(new MensalFixo("hoberto", "1900", 2000));
//        funcs.add(new Horista("monics", "3214214", 2000, 50, 100));
//        funcs.add(new Comissionado("herbert", "823721a", 50000, 0.1));
//        funcs.add(new ComissionadoEfetivo("bura", "duah232", 40000, 0.1, 2000));
//        funcs.add(new Gerente("augusto", "666", 50000));
//
//        FolhaPagamento fp = new FolhaPagamento(funcs);
//        System.out.println("Total da folha: " + fp.gerarFolha());

        Espada espada1 = new Espada("tomaaaa", 30);
        Heroi h1 = new Heroi("jarvis", 10, 100, 5);
        Monstro m1 = new Monstro("Zumbi", 40, 200, 50);

        h1.pegarItem(espada1);
        h1.ataqueEspecial();
        m1.atacar();
        h1.atacar();
        h1.curar();
        m1.defender();

        System.out.println(h1.atacar());
    }
}