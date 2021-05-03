package Service;

import Entity.Game;

public interface GameService {
    void addGame(Game game);
    void deleteGame(Game game);
    void updateGame(Game game,int price);
}
