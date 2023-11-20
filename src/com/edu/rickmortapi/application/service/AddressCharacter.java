package com.edu.rickmortapi.application.service;

import java.util.List;

public record AddressCharacter(String nome, String status, String especie, String tipo, String genero, List<String> episodios, int id) {
}
