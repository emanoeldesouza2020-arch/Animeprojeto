package org.emanoel.animeprojeto.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.emanoel.animeprojeto.entity.Anime;

public interface AnimeRepository extends JpaRepository <Anime, Long> {
}
