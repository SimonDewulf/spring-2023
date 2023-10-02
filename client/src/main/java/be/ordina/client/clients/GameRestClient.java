package be.ordina.client.clients;

import be.ordina.client.dto.CreateGameDTO;
import be.ordina.client.dto.GameDTO;
import be.ordina.client.dto.UpdateGameDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Component
@RequiredArgsConstructor
class GameRestClient implements GameClient {

    private final RestTemplate restTemplate;

    @Override
    public GameDTO getGame(UUID id) {
        return restTemplate.getForObject(
               "/game/" + id,
                GameDTO.class
        );
    }

    @Override
    public GameDTO createGame(CreateGameDTO createGameDTO) {
        return restTemplate.postForObject(
                "/game",
                createGameDTO,
                GameDTO.class
        );
    }

    @Override
    public void deleteGame(UUID id) {

    }

    @Override
    public GameDTO updateGame(UUID id, UpdateGameDTO updateGameDTO) {
        return null;
    }
}
