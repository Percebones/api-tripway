package br.com.tripway.model;

import br.com.tripway.exeptions.TipoPagamentoExeptions;

public enum TipoPagamento {
    Pix(0), Credito(1), Debito(2), Boleto(3);

    private final int codigo;

    TipoPagamento(int codigo) {
        this.codigo = codigo;
    }

    public static TipoPagamento porCodigo(int codigo) throws TipoPagamentoExeptions {
        for (TipoPagamento tipo : TipoPagamento.values()) {
            if (tipo.getCodigo() == codigo) {
                return tipo;
            }
        }
        throw new TipoPagamentoExeptions("Codigo do Tipo pagamento invalido");
    }

    public int getCodigo() {
        return codigo;
    }

}
