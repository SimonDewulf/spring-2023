package be.ordina.client.clients;

import be.ordina.client.dto.CreateGameDTO;
import be.ordina.client.dto.GameDTO;
import be.ordina.client.dto.UpdateGameDTO;

import java.util.UUID;

public interface GameClient {
    GameDTO getGame(UUID id);
    GameDTO createGame(CreateGameDTO createGameDTO);
    void deleteGame(UUID id);
    GameDTO updateGame(UUID id, UpdateGameDTO updateGameDTO);
}
