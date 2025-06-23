package br.com.tripway.model;

import br.com.tripway.enums.ClassePassagem;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "passagem")
public class Passagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "companhia_aerea", nullable = false)
    private String companhiaAerea;

    @Column(name = "classe", nullable = false)
    private ClassePassagem classe;

    @Column(name = "saida_ida", nullable = false)
    private LocalDateTime saidaIda;

    @Column(name = "chegada_ida", nullable = false)
    private LocalDateTime chegadaIda;

    @Column(name = "saida_volta", nullable = true)
    private LocalDateTime saidaVolta;

    @Column(name = "chegada_volta", nullable = true)
    private LocalDateTime chegadaVolta;


    public Passagem() {

    }

    public Passagem(String companhiaAerea, ClassePassagem classe, LocalDateTime saidaIda, LocalDateTime chegadaIda, LocalDateTime saidaVolta, LocalDateTime chegadaVolta) {
        this.companhiaAerea = companhiaAerea;
        this.classe = classe;
        this.saidaIda = saidaIda;
        this.chegadaIda = chegadaIda;
        this.saidaVolta = saidaVolta;
        this.chegadaVolta = chegadaVolta;
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

    public LocalDateTime getSaidaIda() {
        return saidaIda;
    }

    public void setSaidaIda(LocalDateTime saidaIda) {
        this.saidaIda = saidaIda;
    }

    public LocalDateTime getChegadaIda() {
        return chegadaIda;
    }

    public void setChegadaIda(LocalDateTime chegadaIda) {
        this.chegadaIda = chegadaIda;
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
}
