package sistemaPagamento.factory;

import sistemaPagamento.entity.Pagamento;
import sistemaPagamento.entity.Transferencia;

public class PagamentoTransferencia extends PagamentoFactory{
    @Override
    public Pagamento criarPagamento() {
        return new Transferencia();
    }
}
