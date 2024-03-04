package atividade01;

public class Espada implements Coletavel{
    private String nome;
    private boolean usando = false;

    public void pegar(){
        System.out.println("Pegando: " + this.nome);
        this.usando = true;
    }

    public Espada(String nome) {
        this.nome = nome;
    }

    public Coletavel descartar(){
        System.out.println("Descartando: " + this.nome);
        this.usando = false;
        return null;
    }


}
