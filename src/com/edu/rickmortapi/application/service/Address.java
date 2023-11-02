package com.edu.rickmortapi.application.service;

import java.util.List;

public record Address(String name, String status, String species, String type, String gender, List<String> episode, int id) {
}
