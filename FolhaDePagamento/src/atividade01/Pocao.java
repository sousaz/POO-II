package atividade01;

public class Pocao implements Coletavel{
    private String nome;

    private float cura = 30;

    public void pegar(){
        System.out.println("Pegando: " + this.nome);
    }

    public Coletavel descartar(){
        System.out.println("Descartando: " + this.nome);
        return null;
    }

    public float usar(){
        System.out.println("Usando poção de: " + this.nome);
        return this.cura;
    }
}
