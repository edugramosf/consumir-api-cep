package service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import com.google.gson.Gson;
import model.Cep;

public class ConsultaCepService {
    private final Gson gson = new Gson();

    public Cep consultarCep(String cep) throws IOException, InterruptedException {
        String url = "https://opencep.com/v1/" + cep.trim() + ".json";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(url))
        .build();

        HttpResponse<String> response = client
        .send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));

        String body = response.body();

        return gson.fromJson(body, Cep.class);
    }
}