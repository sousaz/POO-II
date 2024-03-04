package atividade01;

public abstract class Personagem {
    protected String nome;
    protected float dano;
    protected float hp;
    protected float defesa;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDano(float dano) {
        this.dano = dano;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public void setDefesa(float defesa) {
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public float getDano() {
        return dano;
    }

    public float getHp() {
        return hp;
    }

    public float getDefesa() {
        return defesa;
    }

    public Personagem(String nome, float dano, float hp, float defesa){
        this.nome = nome;
        this.dano = dano;
        this.hp = hp;
        this.defesa = defesa;
    }


    public abstract float atacar();

    public abstract float defender();
}
