package br.com.tripway.dto;

import br.com.tripway.enums.Regioes;
import br.com.tripway.model.Hotel;

import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDate;

public class PacoteDTO {

    private Long id;
    private Blob imagemPacote;
    private String nomePacote;
    private BigDecimal preco;
    private LocalDate dataPartida;
    private LocalDate dataVolta;
    private String destino;
    private String descricao;
    private LocalDate checkIn;
    private int qtdDias;
    private int avaliacao;
    private Regioes regiao;
    private Hotel hotel;
    private PassagemDTO passagem;

    // ✅ Construtor vazio obrigatório
    public PacoteDTO() {
    }

    public PacoteDTO(Blob imagemPacote, Long id, String nomePacote, BigDecimal preco, LocalDate dataPartida, LocalDate dataVolta,
                     String destino, String descricao, LocalDate checkIn, int qtdDias, int avaliacao, Regioes regiao,
                     Hotel hotel, PassagemDTO passagem) {
        this.imagemPacote = imagemPacote;
        this.id = id;
        this.nomePacote = nomePacote;
        this.preco = preco;
        this.dataPartida = dataPartida;
        this.dataVolta = dataVolta;
        this.destino = destino;
        this.descricao = descricao;
        this.checkIn = checkIn;
        this.qtdDias = qtdDias;
        this.avaliacao = avaliacao;
        this.regiao = regiao;
        this.hotel = hotel;
        this.passagem = passagem;
    }
    // getters e setters

    public Blob getImagemPacote() {
        return imagemPacote;
    }

    public void setImagemPacote(Blob imagemPacote) {
        this.imagemPacote = imagemPacote;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
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

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public LocalDate getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(LocalDate dataVolta) {
        this.dataVolta = dataVolta;
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

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
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

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public PassagemDTO getPassagem() {
        return passagem;
    }

    public void setPassagem(PassagemDTO passagem) {
        this.passagem = passagem;
    }
}
