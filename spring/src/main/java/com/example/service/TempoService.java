package com.example.service;

import com.example.controller.dto.OpenMeteoResponse;
import com.example.entity.PrevisaoTempo;
import com.example.repository.PrevisaoTempoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.UUID;

@Service
public class TempoService {

    private final RestTemplate restTemplate;
    private final PrevisaoTempoRepository repository;

    public TempoService(RestTemplate restTemplate, PrevisaoTempoRepository repository) {
        this.restTemplate = restTemplate;
        this.repository = repository;
    }

    public PrevisaoTempo consultarESalvar(Double latitude, Double longitude) {

        String url = "https://api.open-meteo.com/v1/forecast?latitude=" + latitude + "&longitude=" + longitude + "&current_weather=true";


        OpenMeteoResponse response = restTemplate.getForObject(url, OpenMeteoResponse.class);

        if (response != null) {

            PrevisaoTempo previsao = new PrevisaoTempo(
                    UUID.randomUUID().toString(),
                    latitude,
                    longitude,
                    response.timezone(),
                    response.currentWeather().time(),
                    response.currentWeather().temperature(),
                    response.currentWeatherUnits().temperature(),
                    response.currentWeather().windspeed(),
                    response.currentWeatherUnits().windspeed()
            );
            return repository.salvar(previsao);
        }
        return null;
    }
}