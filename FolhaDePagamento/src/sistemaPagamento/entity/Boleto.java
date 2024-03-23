package sistemaPagamento.entity;

public class Boleto implements Pagamento{
    @Override
    public void pagar() {
        System.out.println("Pagando com o boleto");
    }
}
