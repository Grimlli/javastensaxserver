package se.systementor.stengameserver.repositories;

import org.springframework.stereotype.Repository;
import se.systementor.stengameserver.models.Game;

import java.util.List;

@Repository
public interface GameRepository{

   // @Override
    List<Game> findAll();
}
