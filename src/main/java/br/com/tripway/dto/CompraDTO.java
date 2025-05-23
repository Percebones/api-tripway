package br.com.tripway.dto;

import br.com.tripway.enums.TipoPagamento;
import br.com.tripway.model.Cliente;
import br.com.tripway.model.Pacote;

import java.math.BigDecimal;

public class CompraDTO {

    private Long id;
    private int qtd_pessoa;
    private TipoPagamento tipo_pagamento;
    private BigDecimal total_pago;
    private Cliente cliente;
    private Pacote pacote;

    public CompraDTO(Long id, int qtd_pessoa, TipoPagamento tipo_pagamento, BigDecimal total_pago, Cliente cliente, Pacote pacote) {
        this.id = id;
        this.qtd_pessoa = qtd_pessoa;
        this.tipo_pagamento = tipo_pagamento;
        this.total_pago = total_pago;
        this.cliente = cliente;
        this.pacote = pacote;
    }

    public TipoPagamento getTipo_pagamento() {
        return tipo_pagamento;
    }

    public void setTipo_pagamento(TipoPagamento tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
    }

    public Long getId() {
        return id;
    }

    public int getQtd_pessoa() {
        return qtd_pessoa;
    }

    public void setQtd_pessoa(int qtd_pessoa) {
        this.qtd_pessoa = qtd_pessoa;
    }

    public BigDecimal getTotal_pago() {
        return total_pago;
    }

    public void setTotal_pago(BigDecimal total_pago) {
        this.total_pago = total_pago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }
}
