package br.com.tripway.enums;


public enum TipoPagamento {
    Pix(1), Credito(2), Debito(3), Boleto(4);

    private final int codigo;

    TipoPagamento(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
