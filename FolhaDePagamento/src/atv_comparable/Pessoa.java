package atv_comparable;

import java.time.LocalDate;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String telefone;

    public Pessoa(String nome, String sobrenome, LocalDate dataNascimento, String telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        int comparacaoNome = this.nome.compareTo(outraPessoa.nome);
        if (comparacaoNome != 0) {
            return comparacaoNome;
        }

        int comparacaoSobrenome = this.sobrenome.compareTo(outraPessoa.sobrenome);
        if (comparacaoSobrenome != 0) {
            return comparacaoSobrenome;
        }

        return this.dataNascimento.compareTo(outraPessoa.dataNascimento);
    }
}
