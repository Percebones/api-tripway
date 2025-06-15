package br.com.tripway.dto;

import br.com.tripway.enums.ClassePassagem;
import br.com.tripway.model.Hotel;
import br.com.tripway.model.Pacote;

import java.time.LocalDateTime;

public class PassagemDTO {
    private Long id;
    private String companhiaAerea;
    private ClassePassagem classe;
    private LocalDateTime saidaIda;
    private LocalDateTime chegadaIda;
    private LocalDateTime saidaVolta;
    private LocalDateTime chegadaVolta;
    private Hotel hotel;
    private Pacote pacote;

    public PassagemDTO(Long id, String companhiaAerea, ClassePassagem classe, LocalDateTime saidaIda, LocalDateTime chegadaIda,
                       LocalDateTime saidaVolta, LocalDateTime chegadaVolta, Hotel hotel, Pacote pacote) {
        this.id = id;
        this.companhiaAerea = companhiaAerea;
        this.classe = classe;
        this.saidaIda = saidaIda;
        this.chegadaIda = chegadaIda;
        this.saidaVolta = saidaVolta;
        this.chegadaVolta = chegadaVolta;
        this.hotel = hotel;
        this.pacote = pacote;
    }

    public PassagemDTO() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    public ClassePassagem getClasse() {
        return classe;
    }

    public void setClasse(ClassePassagem classe) {
        this.classe = classe;
    }

    public LocalDateTime getChegadaIda() {
        return chegadaIda;
    }

    public void setChegadaIda(LocalDateTime chegadaIda) {
        this.chegadaIda = chegadaIda;
    }

    public LocalDateTime getSaidaIda() {
        return saidaIda;
    }

    public void setSaidaIda(LocalDateTime saidaIda) {
        this.saidaIda = saidaIda;
    }

    public LocalDateTime getSaidaVolta() {
        return saidaVolta;
    }

    public void setSaidaVolta(LocalDateTime saidaVolta) {
        this.saidaVolta = saidaVolta;
    }

    public LocalDateTime getChegadaVolta() {
        return chegadaVolta;
    }

    public void setChegadaVolta(LocalDateTime chegadaVolta) {
        this.chegadaVolta = chegadaVolta;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;


    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }
}
