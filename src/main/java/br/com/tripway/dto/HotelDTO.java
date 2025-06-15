package br.com.tripway.dto;

import java.sql.Blob;
import java.util.List;

public class HotelDTO {
    private Long id;
    private String nomeHotel;
    private Blob imagemHotel;
    private String endereco;
    private List<String> beneficios;

    public HotelDTO(Long id, String nomeHotel, Blob imagemHotel, String endereco, List<String> beneficios) {
        this.id = id;
        this.nomeHotel = nomeHotel;
        this.imagemHotel = imagemHotel;
        this.endereco = endereco;
        this.beneficios = beneficios;
    }

    public Long getId() {
        return id;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public Blob getImagemHotel() {
        return imagemHotel;
    }

    public void setImagemHotel(Blob imagemHotel) {
        this.imagemHotel = imagemHotel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<String> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<String> beneficios) {
        this.beneficios = beneficios;
    }
}
