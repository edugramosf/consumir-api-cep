package service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Cep;

public class GeraArquivoService {
    private final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public void gerarArquivo(List<Cep> ceps, String nomeArquivo) throws IOException {

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(nomeArquivo), StandardCharsets.UTF_8))) {
            gson.toJson(ceps, writer);
            System.out.println("Arquivo " + nomeArquivo + " criado com sucesso.");
        }
    }
}