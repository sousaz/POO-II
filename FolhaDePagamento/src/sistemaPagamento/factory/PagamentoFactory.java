package sistemaPagamento.factory;

import sistemaPagamento.entity.Pagamento;

public abstract class PagamentoFactory {
    public abstract Pagamento criarPagamento();
    public void fazerPagamento() {
        Pagamento pagamento = criarPagamento();
        System.out.println("Iniciando processo de pagamento.");
        pagamento.pagar();
    }
}
