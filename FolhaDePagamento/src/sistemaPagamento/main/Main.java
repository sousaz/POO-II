package sistemaPagamento.main;

import sistemaPagamento.factory.PagamentoFactory;
import sistemaPagamento.factory.PagamentoPix;

public class Main {
    public static void main(String[] args) {

        PagamentoFactory pagamento = new PagamentoPix();

        pagamento.fazerPagamento();
    }
}
