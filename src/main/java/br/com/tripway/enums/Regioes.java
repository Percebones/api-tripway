package br.com.tripway.enums;

public enum Regioes {
    asia("Ásia "), americaDoNorte("América do Norte"), americaDoSul("América do Sul"), oceania("Oceania"), europa("Europa");

    private final String regiao;

    Regioes(String regiao) {
        this.regiao = regiao;
    }

    public String getRegiao() {
        return regiao;
    }
}
