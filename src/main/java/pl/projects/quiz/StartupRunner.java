package pl.projects.quiz;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.projects.quiz.database.entities.PlayerEntity;
import pl.projects.quiz.database.repositories.PlayerRepository;
import pl.projects.quiz.frontend.GameOptions;
import pl.projects.quiz.services.QuizDataService;


import java.util.List;

@Component
@Log
public class StartupRunner implements CommandLineRunner {
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private QuizDataService quizDataService;

    @Override
    public void run(String...args) throws Exception {
        log.info("Executing startup actions...");
        playerRepository.save(new PlayerEntity("Greg"));
        playerRepository.save(new PlayerEntity("Margaret"));
        playerRepository.save(new PlayerEntity("George"));

        log.info("List of players from database:");
        List<PlayerEntity> playersFromDatabase = playerRepository.findAll();
        for (PlayerEntity player : playersFromDatabase) {
            log.info("Retrieved player: " + player);
        }
        quizDataService.getQuizCategories();

    }
}