package adapterIntregation.empresaABC;

public class NotaFiscal {
    private String cnpj;
    private String nome;
    private double valor;

    public NotaFiscal(String cnpj, String nome, double valor) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.valor = valor;
    }
}
