package atividade01;

public class Monstro extends Personagem{
    public Monstro(String nome, float dano, float hp, float defesa) {
        super(nome, dano, hp, defesa);
    }

    @Override
    public float atacar() {
        System.out.println("O "+ this.nome + " esta atacando");
        return this.dano;
    }

    @Override
    public float defender() {
        System.out.println("O "+ this.nome + " esta se defendendo");
        return this.defesa;
    }

    public void calcularDano(){
        System.out.println(this.nome+" hmm hmmm hmmm que dano que eu calculei");
    }


}
