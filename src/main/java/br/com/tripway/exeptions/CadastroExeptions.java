package br.com.tripway.exeptions;

public class CadastroExeptions extends RuntimeException {
    public CadastroExeptions(String message) {
        super(message);
    }
}
