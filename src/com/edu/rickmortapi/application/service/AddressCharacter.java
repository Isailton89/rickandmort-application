package com.edu.rickmortapi.application.service;

import java.util.List;

public record AddressCharacter(String name, String status, String species, String type, String gender, List<String> episode, int id) {
}
