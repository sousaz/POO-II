package atividade01;

public class Pocao implements Coletavel{
    private String nome;

    public void pegar(){
        System.out.println("Pegando: " + this.nome);
    }

    public Coletavel descartar(){
        System.out.println("Descartando: " + this.nome);
        return null;
    }

    public void usar(){
        System.out.println("Usando poção de: " + this.nome);
    }
}
