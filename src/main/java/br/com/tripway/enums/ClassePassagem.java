package br.com.tripway.enums;

public enum ClassePassagem {

    economica(1), executivo(2), primeiraClasse(3), outro(4);

    private final int codigo;

    ClassePassagem(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
