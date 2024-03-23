package sistemaPagamento.factory;

import sistemaPagamento.entity.Cartao;
import sistemaPagamento.entity.Pagamento;

public class PagementoCartao extends PagamentoFactory{
    @Override
    public Pagamento criarPagamento() {
        return new Cartao();
    }
}
