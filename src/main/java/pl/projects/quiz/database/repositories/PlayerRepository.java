package pl.projects.quiz.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.projects.quiz.database.entities.PlayerEntity;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}