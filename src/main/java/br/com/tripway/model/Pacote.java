package br.com.tripway.model;

import br.com.tripway.dto.PacoteDTO;
import br.com.tripway.enums.Regioes;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDate;

@Entity
@Table(name = "pacote")
public class Pacote {
    @Lob
    @Column(name = "imagem_pacote", nullable = true)
    private Blob imagem_pacote;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_pacote", nullable = false, length = 120)
    private String nomePacote;
    @Column(nullable = false)
    private BigDecimal preco;
    @Column(name = "data_partida", nullable = false)
    private LocalDate data_partida;
    @Column(name = "data_volta", nullable = false)
    private LocalDate data_volta;
    @Column(nullable = false)
    private String destino;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private LocalDate checkIn;
    @Column(name = "qtd_dias", nullable = false)
    private int qtd_dias;
    @Column(nullable = true)
    private int avaliacao;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Regioes regiao;


    public Pacote() {
    }

    public Pacote(PacoteDTO pacoteDTO) {
        super();
        this.nomePacote = pacoteDTO.getNome_pacote();
        this.preco = pacoteDTO.getPreco();
        this.data_partida = pacoteDTO.getData_partida();
        this.data_volta = pacoteDTO.getData_volta();
        this.destino = pacoteDTO.getDestino();
        this.descricao = pacoteDTO.getDescricao();
        this.checkIn = pacoteDTO.getCheckIn();
        this.qtd_dias = pacoteDTO.getQtd_dias();
        this.imagem_pacote = pacoteDTO.getImagem_pacote();
        this.avaliacao = pacoteDTO.getAvaliacao();
        this.regiao = pacoteDTO.getRegiao();
    }

    public Long getId() {
        return id;
    }

    public String getNomePacote() {
        return nomePacote;
    }

    public void setNomePacote(String nomePacote) {
        this.nomePacote = nomePacote;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDate getData_partida() {
        return data_partida;
    }

    public void setData_partida(LocalDate data_partida) {
        this.data_partida = data_partida;
    }

    public LocalDate getData_volta() {
        return data_volta;
    }

    public void setData_volta(LocalDate data_volta) {
        this.data_volta = data_volta;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public int getQtd_dias() {
        return qtd_dias;
    }

    public void setQtd_dias(int qtd_dias) {
        this.qtd_dias = qtd_dias;
    }

    public Blob getImagem_pacote() {
        return imagem_pacote;
    }

    public void setImagem_pacote(Blob imagem_pacote) {
        this.imagem_pacote = imagem_pacote;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Regioes getRegiao() {
        return regiao;
    }

    public void setRegiao(Regioes regiao) {
        this.regiao = regiao;
    }

}
