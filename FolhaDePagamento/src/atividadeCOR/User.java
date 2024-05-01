package atividadeCOR;

public class User {
    private String nome;

    private float credit;

    private boolean restriction;

    public User(String nome, float credit, boolean restriction) {
        this.nome = nome;
        this.credit = credit;
        this.restriction = restriction;
    }

    public String getNome() {
        return nome;
    }

    public float getCredit() {
        return credit;
    }

    public boolean isRestriction() {
        return restriction;
    }
}
