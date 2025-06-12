package br.com.tripway.enums;

public enum Regioes {
    Asia(1), AmericaDoNorte(2), AmericaDoSul(3), Oceania(4), Europa(5);

    private final int codigo;

    Regioes(int codigo) {
        this.codigo = codigo;
    }

    public int getRegiao() {
        return codigo;
    }
}
