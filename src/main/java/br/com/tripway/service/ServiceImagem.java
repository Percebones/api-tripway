package br.com.tripway.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ServiceImagem {


    public String salvarImagem(MultipartFile arquivo) throws IOException {

        String imagens = "src/main/resources/imagens/";
        Files.createDirectories(Paths.get(imagens));
        String nomeArquivo = System.currentTimeMillis() + "_" + arquivo.getOriginalFilename();
        File file = new File(imagens, nomeArquivo);
        arquivo.transferTo(file);
        return nomeArquivo;
    }

}
