package sistemaPagamento.entity;

public class Transferencia implements Pagamento{
    @Override
    public void pagar() {
        System.out.println("Pagando com transferencia");
    }
}
