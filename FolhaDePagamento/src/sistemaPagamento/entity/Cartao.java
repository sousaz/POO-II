package sistemaPagamento.entity;

public class Cartao implements Pagamento {
    @Override
    public void pagar() {
        System.out.println("Pagando com o cartão");
    }
}
