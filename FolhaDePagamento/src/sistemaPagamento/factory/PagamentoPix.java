package sistemaPagamento.factory;

import sistemaPagamento.entity.Pagamento;
import sistemaPagamento.entity.Pix;

public class PagamentoPix extends PagamentoFactory{
    @Override
    public Pagamento criarPagamento() {
        return new Pix();
    }
}
