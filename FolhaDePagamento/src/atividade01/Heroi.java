package atividade01;

public class Heroi extends Personagem{
    private Coletavel item;
    private boolean especialUsado;

    private final float especialDano = 100;

    public Heroi(String nome, float dano, float hp, float defesa) {
        super(nome, dano, hp, defesa);
        this.item = null;
    }

    public Coletavel getItem() {
        return item;
    }

    public void setItem(Coletavel item) {
        this.item = item;
    }

    private float danoEspada(){
        if(this.item instanceof  Espada) return 10;
        return 0;
    }

    private float curaPocao(){
        if(this.item instanceof  Pocao) return 30;
        return 0;
    }

    @Override
    public float atacar() {

        System.out.println("O "+ this.nome + " esta atacando");
        return this.dano + danoEspada();
    }

    @Override
    public float defender() {
        System.out.println("O "+ this.nome + " esta se defendendo");
        return this.defesa;
    }

    public float ataqueEspecial(){
        System.out.println("O "+ this.nome + " esta usando o poder do protagonismo");
        return this.especialDano;
    }

    public void pegarItem(Coletavel item){
        this.item = item;
        item.pegar();
    }

    public void descartarItem(Coletavel item){
        this.item = item.descartar();
    }

    public void curar(){
        this.hp = curaPocao();
        System.out.println("Curando...");
    }
}
