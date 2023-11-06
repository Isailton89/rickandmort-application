package com.edu.rickmortapi.application.service;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection {
    public AddressCharacter sendAddress(String addressRequest) {
        URI addressUrl = URI.create(addressRequest);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(addressUrl)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), AddressCharacter.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui acessar o endereço");
        }

    }
}
