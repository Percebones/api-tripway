package br.com.tripway.enums;


public enum TipoPagamento {
    Pix(0), Credito(1), Debito(2), Boleto(3);

    private final int codigo;

    TipoPagamento(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
