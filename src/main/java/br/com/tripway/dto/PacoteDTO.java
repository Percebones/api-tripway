package br.com.tripway.dto;

import br.com.tripway.enums.Regioes;
import br.com.tripway.model.Hotel;

import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDate;

public class PacoteDTO {

    private final Long id;
    private Blob imagem_pacote;
    private String nome_pacote;
    private BigDecimal preco;
    private LocalDate data_partida;
    private LocalDate data_volta;
    private String destino;
    private String descricao;
    private LocalDate checkIn;
    private int qtd_dias;
    private int avaliacao;
    private Regioes regiao;

    private Hotel hotel;      // novo
    private PassagemDTO passagem; // novo

    public PacoteDTO(Blob imagem_pacote, Long id, String nome_pacote, BigDecimal preco, LocalDate data_partida, LocalDate data_volta,
                     String destino, String descricao, LocalDate checkIn, int qtd_dias, int avaliacao, Regioes regiao,
                     Hotel hotel, PassagemDTO passagem) {  // incluiu hotel e passagem
        this.imagem_pacote = imagem_pacote;
        this.id = id;
        this.nome_pacote = nome_pacote;
        this.preco = preco;
        this.data_partida = data_partida;
        this.data_volta = data_volta;
        this.destino = destino;
        this.descricao = descricao;
        this.checkIn = checkIn;
        this.qtd_dias = qtd_dias;
        this.avaliacao = avaliacao;
        this.regiao = regiao;
        this.hotel = hotel;
        this.passagem = passagem;
    }

    // getters e setters

    public Blob getImagem_pacote() {
        return imagem_pacote;
    }

    public void setImagem_pacote(Blob imagem_pacote) {
        this.imagem_pacote = imagem_pacote;
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

    public String getNome_pacote() {
        return nome_pacote;
    }

    public void setNome_pacote(String nome_pacote) {
        this.nome_pacote = nome_pacote;
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
