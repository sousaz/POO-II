package sistemaPagamento.factory;

import sistemaPagamento.entity.Boleto;
import sistemaPagamento.entity.Pagamento;

public class PagamentoBoleto extends PagamentoFactory{
    @Override
    public Pagamento criarPagamento() {
        return new Boleto();
    }
}
