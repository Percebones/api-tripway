package br.com.tripway.model;

import br.com.tripway.dto.CompraDTO;
import br.com.tripway.enums.TipoPagamento;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "compra")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int qtd_pessoa;

    @Column(nullable = false)
    private TipoPagamento tipo_pagamento;

    @Column(nullable = false)
    private BigDecimal total_pago;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_pacote", nullable = false)
    private Pacote pacote;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passagem_id", referencedColumnName = "id")
    private Passagem passagem;

    public Compra() {
    }

    public Compra(CompraDTO compraDTO) {
        super();
        this.qtd_pessoa = compraDTO.getQtd_pessoa();
        this.tipo_pagamento = compraDTO.getTipoPagamento();
        this.total_pago = compraDTO.getTotalPago();
        this.cliente = compraDTO.getCliente();
        this.pacote = compraDTO.getPacote();
        this.passagem = compraDTO.getPassagem();
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

    public TipoPagamento getTipo_pagamento() {
        return tipo_pagamento;
    }

    public void setTipo_pagamento(TipoPagamento tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
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
