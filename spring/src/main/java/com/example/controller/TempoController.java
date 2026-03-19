package com.example.controller;

import com.example.controller.dto.response.PrevisaoTempoResponse;
import com.example.controller.dto.response.TemperaturaResponse;
import com.example.entity.PrevisaoTempo;
import com.example.service.TempoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tempo")
public class TempoController {

    private final TempoService tempoService;

    public TempoController(TempoService tempoService) {
        this.tempoService = tempoService;
    }

    @GetMapping
    public PrevisaoTempoResponse consultarTempo(@RequestParam Double latitude, @RequestParam Double longitude) {

        PrevisaoTempo previsao = tempoService.consultarESalvar(latitude, longitude);

        TemperaturaResponse temperatura = new TemperaturaResponse(
                previsao.dataHora(),
                previsao.temperaturaDia(),
                previsao.unidadeTemperaturaDia(),
                previsao.vento(),
                previsao.unidadeVento()
        );

        return new PrevisaoTempoResponse(previsao.tempoZona(), temperatura);
    }
}