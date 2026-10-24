package org.emanoel.animeprojeto.controller;

import org.emanoel.animeprojeto.dto.AnimeRequestDTO;
import org.emanoel.animeprojeto.dto.AnimeResponseDTO;
import org.emanoel.animeprojeto.service.AnimeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/animes")
public class Animecontroller {
    private final AnimeService animeService;

    public  Animecontroller(AnimeService animeService){
        this.animeService = animeService;

    }
    @PostMapping
    public AnimeResponseDTO cadastrar (@RequestBody AnimeRequestDTO dados){
        return animeService.cadastrar(dados);
    }



}
