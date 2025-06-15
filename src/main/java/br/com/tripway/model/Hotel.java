package br.com.tripway.model;

import jakarta.persistence.*;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_hotel", nullable = false)
    private String nomeHotel;

    @Lob
    @Column(name = "imagem_hotel", nullable = true)
    private Blob imagemHotel;

    @Column(name = "endereco", nullable = false)
    private String endereco;

    @ElementCollection
    @CollectionTable(name = "hotel_beneficios", joinColumns = @JoinColumn(name = "hotel_id"))
    @Column(name = "beneficio")
    private List<String> beneficios = new ArrayList<>();

    public Hotel(String nomeHotel, Blob imagemHotel, String endereco, List<String> beneficios) {
        this.nomeHotel = nomeHotel;
        this.imagemHotel = imagemHotel;
        this.endereco = endereco;
        this.beneficios = beneficios;
    }

    public Hotel() {

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

    public Long getId() {
        return id;
    }

}
