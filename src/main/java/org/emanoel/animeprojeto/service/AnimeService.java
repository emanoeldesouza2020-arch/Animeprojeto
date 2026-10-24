package org.emanoel.animeprojeto.service;
import org.emanoel.animeprojeto.dto.AnimeRequestDTO;
import org.emanoel.animeprojeto.dto.AnimeResponseDTO;
import org.emanoel.animeprojeto.repository.AnimeRepository;
import org.springframework.stereotype.Service;
import org.emanoel.animeprojeto.entity.Anime;

@Service
public class AnimeService {
    private final AnimeRepository animeRepository;
    public AnimeService(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }

    //esse metodo ele retorna id titulo status, ano,sinopse
    public  AnimeResponseDTO cadastrar(AnimeRequestDTO dados){
    Anime anime = new Anime();
   anime.setTitulo(dados.getTitulo());
   anime.setAnolancamento(dados.getAnolancamento());
   anime.setSinopse(dados.getSinopse());
   anime.setStatus(dados.getStatus());

      Anime retornar= animeRepository.save(anime);
        AnimeResponseDTO resposta = new AnimeResponseDTO();
        resposta.setId(retornar.getId());

        resposta.setTitulo(retornar.getTitulo());
        resposta.setSinopse(retornar.getSinopse());
        resposta.setAnoLancamento(retornar.getAnolancamento());
        resposta.setStatus(retornar.getStatus());
        return resposta;

    }


}
