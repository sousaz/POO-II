package atividade01;

public class Espada implements Coletavel{
    private String nome;
    private float dano;
    private boolean usando = false;

    public void pegar(){
        System.out.println("Pegando: " + this.nome);
        this.usando = true;
    }

    public Espada(String nome, float dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public Coletavel descartar(){
        System.out.println("Descartando: " + this.nome);
        this.usando = false;
        return null;
    }

    public float usar(){
        return this.dano;
    }


}
