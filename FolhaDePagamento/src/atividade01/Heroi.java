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

    @Override
    public float atacar() {

        System.out.println("O "+ this.nome + " esta atacando");
        if(this.item instanceof Espada){
            return this.dano + this.item.usar();
        }
        return this.dano;
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

    public float curar(){
        if(this.item instanceof Pocao){
            System.out.println("Curando...");
            return this.item.usar();
        }
        return 0;
    }
}
