package atv_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Agenda{
    private List<Pessoa> agenda = new ArrayList<>();

    public List<Pessoa> getAgenda() {
        return agenda;
    }

    public void setAgenda(Pessoa pessoa) {
        this.agenda.add(pessoa);
    }
    public List<Pessoa> ordenarAgenda() {
        Collections.sort(this.agenda);
        return this.agenda;
    }
}
